package D_Repaso.C_RepararListaLetras;

public class ConErrores extends javax.swing.JFrame {

    public ConErrores() {
        initComponents();
        
        //Centramos la ventana
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaCantidad = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMensajes = new javax.swing.JTextArea();
        botónAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaCantidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pocas", "Muchas", "Todas" }));

        areaMensajes.setColumns(20);
        areaMensajes.setRows(5);
        jScrollPane1.setViewportView(areaMensajes);

        botónAceptar.setText("Aceptar");
        botónAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botónAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botónAceptar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botónAceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botónAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botónAceptarActionPerformed
    {//GEN-HEADEREND:event_botónAceptarActionPerformed
        //Inicializamos el TextArea
        areaMensajes.setText("");
        
        //Obtenemos el Indice de la Cantidad Seleccionada
        int  selec = listaCantidad.getSelectedIndex();
        int  maxLetras;
        char letraActual = 'A';

        switch(selec) {
            case 0:
                maxLetras = 5;
                break;
            case 1:
                maxLetras = 15;
                break;
            case 2:
                maxLetras = 26;
                break;
            default:
                areaMensajes.setText("ERROR - OPCION NO CONTEMPLADA");
                return;
        }
        for (int i=0; i < maxLetras; i++)
        {
            if (letraActual != 'A' && letraActual != 'E' && letraActual != 'I' &&
                letraActual != 'O' && letraActual != 'U')
               areaMensajes.append("" + letraActual + "\n");

            letraActual++;
        }
    }//GEN-LAST:event_botónAceptarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConErrores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMensajes;
    private javax.swing.JButton botónAceptar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox listaCantidad;
    // End of variables declaration//GEN-END:variables

}
