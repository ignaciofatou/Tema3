/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_Excepciones.B_ControlNumerico;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ignacio
 */
public class VentanaContrNum extends javax.swing.JFrame {

    private static final String FICHERO_LOG  = "ControlNumerico.log";
    static final Logger LOGGER = Logger.getLogger("paquete.VentanaContrNum");
    FileHandler fileXml;

    public VentanaContrNum() {
        initComponents();
        
        //Centramos la ventana
        setLocationRelativeTo(null);

        //Establecemos el Nivel del Log
        LOGGER.setLevel(Level.FINEST);
        
        //Creamos el Fichero de Logs
        try {            
            fileXml = new FileHandler(FICHERO_LOG);
            LOGGER.addHandler(fileXml);
        } catch (IOException ex) {
            LOGGER.warning("No se ha podido generar el Fichero log");
            LOGGER.finest("No se pudo generar el Fichero: " + FICHERO_LOG);
            LOGGER.finest("Error: " + ex.getMessage());
        } catch (SecurityException ex) {
            LOGGER.warning("No se ha podido generar el Fichero log");
            LOGGER.finest("No se pudo generar el Fichero: " + FICHERO_LOG);
            LOGGER.finest("Error: " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFDigitos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFPrimerDigito = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFSegundoDigito = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFResultado = new javax.swing.JTextField();
        jBCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Introduzca Digitos:");

        jLabel2.setText("CONTROL NUMÉRICO");

        jLabel3.setText("Posicion Primer Digito");

        jLabel4.setText("Posicion Segundo Digito");

        jLabel5.setText("Resultado (Digito1/Digito2):");

        jTFResultado.setEditable(false);

        jBCalcular.setText("Calcular");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFDigitos))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFPrimerDigito, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                    .addComponent(jTFSegundoDigito)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBCalcular)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFDigitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFPrimerDigito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFSegundoDigito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCalcular))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
        
        int posicion1;
        int posicion2;
        String subDig1;
        String subDig2;
        double digito1;
        double digito2;
        double division;

        //Recuperamos la Posicion 1
        try {
            //Recuperamos el Digito 1
            posicion1 = Integer.valueOf(jTFPrimerDigito.getText());
            LOGGER.finest("Posicion 1: " + posicion1);

            //Recuperamos el Digito 2
            posicion2 = Integer.valueOf(jTFSegundoDigito.getText());
            LOGGER.finest("Posicion 1: " + posicion2);

            //Recuperamos el Digito 1
            subDig1 = jTFDigitos.getText().substring(posicion1 - 1, posicion1);
            LOGGER.finest("Cadena Digito 1: " + subDig1);
            digito1 = Integer.valueOf(subDig1);

            //Recuperamos el Digito 2
            subDig2 = jTFDigitos.getText().substring(posicion2 - 1, posicion2);
            LOGGER.finest("Cadena Digito 2: " + subDig2);
            digito2 = Integer.valueOf(subDig2);

            
            LOGGER.finest("Division = " + digito1 + "/" + digito2);
            //Comprobamos si el Digito 2 es distinto de 0
            if (digito2 != 0.0){                
                //Realizamos la Divisition
                division = digito1 / digito2;

                //Mostramos el Resultado de la Division
                NumberFormat formatoNumero = NumberFormat.getNumberInstance();
                formatoNumero.setMaximumFractionDigits(2);
                jTFResultado.setText(formatoNumero.format(division));
            } else {
                LOGGER.severe("Error, División Entre 0");
            }

        } catch (NumberFormatException e1) {
            LOGGER.severe("Error, Se han introducido caracteres no numéricos");
        } catch (IndexOutOfBoundsException e2) {
            LOGGER.severe("Error, La posicion de uno de los digitos es Incorrecta");
        }
    }//GEN-LAST:event_jBCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaContrNum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaContrNum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaContrNum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaContrNum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaContrNum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTFDigitos;
    private javax.swing.JTextField jTFPrimerDigito;
    private javax.swing.JTextField jTFResultado;
    private javax.swing.JTextField jTFSegundoDigito;
    // End of variables declaration//GEN-END:variables
}
