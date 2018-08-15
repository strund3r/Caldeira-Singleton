/*
cada 10L água = -2°graus caldeira
cada 10° fogo = 5°graus caldeira

Class Caldeira {

-int volume;
-int temperatura;
-static caldeira instancia = null;
+ -> -Caldeira();
+static Caldeira getInstancia();



getInstancia()
{
	if(instancia == NULL){new instancia}
	else () 
	getInstancia();
 */
package caldeira;

public class Caldeira {
    private int volume;
    private int temperaturaFogo;
    private int temperaturaAgua;
    private int temperaturaMax;
    private int temperaturaMin;
    private int aguaMax;
    private int aguaMin;
    
    public void Caldeira(){};
    
    private static Caldeira instancia = null;
    
    public static  Caldeira getInstancia(){
        instancia = instancia == null ? new Caldeira() : instancia;
        return instancia;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) throws Exception {
        if (volume < aguaMax && volume > getAguaMin()) {
            this.volume = volume;
            this.temperaturaAgua -= 2;
            throw new Exception("Volume excede o limite");
        }
    }

    public int getTemperaturaFogo() {
        return temperaturaFogo;
    }

    public void setTemperaturaFogo(int temperaturaFogo) {
        this.temperaturaFogo = temperaturaFogo;
    }

    public int getTemperaturaAgua() {
        return temperaturaAgua;
    }

    public void setTemperaturaAgua(int temperaturaAgua) {
        this.temperaturaAgua = temperaturaAgua;
    }

    public int getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(int temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public int getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(int temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }    

    public int getAguaMax() {
        return aguaMax;
    }

    public void setAguaMax(int aguaMax) {
        this.aguaMax = aguaMax;
    }

    public int getAguaMin() {
        return aguaMin;
    }

    public void setAguaMin(int aguaMin) {
        this.aguaMin = aguaMin;
    }
}