package view;

import caldeira.Caldeira;

public class NewClass {
    public static void main(String args[]) throws Exception {
        Caldeira caldeira = new Caldeira();
        
        caldeira.setAguaMax(10);
        caldeira.setAguaMin(2);
        caldeira.setVolume(10);
        
        System.out.println(caldeira.getVolume());
    }
}