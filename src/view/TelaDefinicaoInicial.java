/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import caldeira.Caldeira;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author Franzwagner Ternus
 */
public class TelaDefinicaoInicial extends javax.swing.JFrame {

    // Caldeira caldeira = new Caldeira();
    
    /**
     * Creates new form TelaDefinicaoInicial
     */
    public TelaDefinicaoInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDadosAgua = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        entradaNivelMinAgua = new javax.swing.JTextField();
        entradaNivelMaxAgua = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        entradaTempMinAgua = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        entradaTempMaxAgua = new javax.swing.JTextField();
        panelDadosAgua1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        entradaNivelAtualAgua = new javax.swing.JTextField();
        entradaTempAtualAgua = new javax.swing.JTextField();
        entradaTempAtualFogo = new javax.swing.JTextField();
        botaoDefinir = new javax.swing.JToggleButton();
        botaoSair = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caldeira - Definição Inicial");
        setResizable(false);

        panelDadosAgua.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Água", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N

        jLabel2.setText("Nível Mínimo de Água:");

        jLabel3.setText("Nível Máximo de Água:");

        jLabel9.setText("Temperatura Mínima da Água:");

        jLabel1.setText("Temperatura Máxima da Água:");

        entradaTempMaxAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaTempMaxAguaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDadosAguaLayout = new javax.swing.GroupLayout(panelDadosAgua);
        panelDadosAgua.setLayout(panelDadosAguaLayout);
        panelDadosAguaLayout.setHorizontalGroup(
            panelDadosAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosAguaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDadosAguaLayout.createSequentialGroup()
                        .addGroup(panelDadosAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDadosAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entradaNivelMinAgua)
                            .addComponent(entradaNivelMaxAgua)))
                    .addGroup(panelDadosAguaLayout.createSequentialGroup()
                        .addGroup(panelDadosAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDadosAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entradaTempMaxAgua, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(entradaTempMinAgua))))
                .addContainerGap())
        );
        panelDadosAguaLayout.setVerticalGroup(
            panelDadosAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosAguaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(entradaNivelMinAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDadosAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entradaNivelMaxAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDadosAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(entradaTempMinAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDadosAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(entradaTempMaxAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        panelDadosAgua1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Caldeira", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N

        jLabel4.setText("Nível Atual de Água:");

        jLabel5.setText("Temperatura Atual da Água:");

        jLabel6.setText("Temperatura Atual do Fogo:");

        entradaNivelAtualAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNivelAtualAguaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDadosAgua1Layout = new javax.swing.GroupLayout(panelDadosAgua1);
        panelDadosAgua1.setLayout(panelDadosAgua1Layout);
        panelDadosAgua1Layout.setHorizontalGroup(
            panelDadosAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosAgua1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entradaNivelAtualAgua)
                    .addComponent(entradaTempAtualAgua)
                    .addComponent(entradaTempAtualFogo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelDadosAgua1Layout.setVerticalGroup(
            panelDadosAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosAgua1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(entradaNivelAtualAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDadosAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(entradaTempAtualAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDadosAgua1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(entradaTempAtualFogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        botaoDefinir.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        botaoDefinir.setText("Definir");
        botaoDefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDefinirActionPerformed(evt);
            }
        });

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoDefinir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDadosAgua1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDadosAgua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelDadosAgua1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelDadosAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoDefinir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entradaNivelAtualAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNivelAtualAguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNivelAtualAguaActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        int resp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair?", 
            "Caldeira - Sair", YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(resp == JOptionPane.YES_OPTION){
           System.exit(0);
        }
    }//GEN-LAST:event_botaoSairActionPerformed

    private void entradaTempMaxAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaTempMaxAguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaTempMaxAguaActionPerformed

    private void botaoDefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDefinirActionPerformed
        try{
            Caldeira.getInstancia().setVolume(Integer.parseInt(entradaNivelAtualAgua.getText()));
            Caldeira.getInstancia().setTemperaturaAgua(Integer.parseInt(entradaTempAtualAgua.getText()));
            Caldeira.getInstancia().setTemperaturaFogo(Integer.parseInt(entradaTempAtualFogo.getText()));
            Caldeira.getInstancia().setAguaMin(Integer.parseInt(entradaNivelMinAgua.getText()));
            Caldeira.getInstancia().setAguaMax(Integer.parseInt(entradaNivelMaxAgua.getText()));
            Caldeira.getInstancia().setTemperaturaMin(Integer.parseInt(entradaTempMinAgua.getText()));
            Caldeira.getInstancia().setTemperaturaMax(Integer.parseInt(entradaTempMaxAgua.getText()));
                        
            new TelaCaldeira().setVisible(true);

            this.dispose();
            
        } catch(Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
        
        
    }//GEN-LAST:event_botaoDefinirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDefinicaoInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDefinicaoInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDefinicaoInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDefinicaoInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDefinicaoInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoDefinir;
    private javax.swing.JToggleButton botaoSair;
    private javax.swing.JTextField entradaNivelAtualAgua;
    private javax.swing.JTextField entradaNivelMaxAgua;
    private javax.swing.JTextField entradaNivelMinAgua;
    private javax.swing.JTextField entradaTempAtualAgua;
    private javax.swing.JTextField entradaTempAtualFogo;
    private javax.swing.JTextField entradaTempMaxAgua;
    private javax.swing.JTextField entradaTempMinAgua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelDadosAgua;
    private javax.swing.JPanel panelDadosAgua1;
    // End of variables declaration//GEN-END:variables
}
