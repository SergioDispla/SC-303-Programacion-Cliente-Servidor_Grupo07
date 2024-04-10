
package Interfaz;
import Gestores.GestorAdministracionClienteVehiculo;
import Persona.Cliente;
import Vehiculo.Vehiculo;

public class InterfazRegistroVehiculos extends javax.swing.JFrame {
    private String clienteAsociado;

    /**
     * Creates new form InterfazRegistroVehiculos
     */
    public InterfazRegistroVehiculos(Cliente cliente) {
        initComponents();
        setLocationRelativeTo(null);
        clienteAsociado = cliente.getCedula();
        txtCedulaCliente.setText(clienteAsociado);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTituloVentana = new java.awt.Label();
        labelModeloVehiculo = new javax.swing.JLabel();
        labelPlacaVehiculo = new javax.swing.JLabel();
        labelMarcaVehiculo = new javax.swing.JLabel();
        labelYearVehiculo = new javax.swing.JLabel();
        labelKilometrajeVehiculo = new javax.swing.JLabel();
        txtMarcaVehiculo = new javax.swing.JTextField();
        txtPlacaVehiculo = new javax.swing.JTextField();
        txtModeloVehiculo = new javax.swing.JTextField();
        txtYearVehiculo = new javax.swing.JTextField();
        txtKilometrajeVehiculo = new javax.swing.JTextField();
        botonRegistrarVehiculo = new javax.swing.JButton();
        labelCedulaCliente = new javax.swing.JLabel();
        txtCedulaCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTituloVentana.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTituloVentana.setText("Registro Vehiculo");

        labelModeloVehiculo.setText("Modelo:");

        labelPlacaVehiculo.setText("Placa:");

        labelMarcaVehiculo.setText("Marca:");

        labelYearVehiculo.setText("Año:");

        labelKilometrajeVehiculo.setText("Kilometraje");

        botonRegistrarVehiculo.setText("Registrar Vehiculo");
        botonRegistrarVehiculo.setToolTipText("Ingresa productos manualmente");
        botonRegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarVehiculoActionPerformed(evt);
            }
        });

        labelCedulaCliente.setText("Ced. Cliente Asociado");

        txtCedulaCliente.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(labelTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(botonRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelMarcaVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMarcaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelModeloVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtModeloVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelYearVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtYearVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelKilometrajeVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtKilometrajeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelPlacaVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelCedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPlacaVehiculo))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMarcaVehiculo))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModeloVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelModeloVehiculo))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYearVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelYearVehiculo))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKilometrajeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKilometrajeVehiculo))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCedulaCliente)
                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(botonRegistrarVehiculo)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarVehiculoActionPerformed
        //Definicion de variables que van a capturar lo que se ingrese en los textfields
        String placaVehiculo = txtPlacaVehiculo.getText().trim();
        String marcaVehiculo = txtMarcaVehiculo.getText().trim();
        String modeloVehiculo = txtModeloVehiculo.getText().trim();
        Integer yearVehiculo = Integer.parseInt(txtYearVehiculo.getText());
        Integer kilometrajeVehiculo = Integer.parseInt(txtKilometrajeVehiculo.getText().trim());
        String cedulaCliente = clienteAsociado;

        //Mostramos el label del cliente que va ir asociado a este vehiculo
        txtCedulaCliente.setText(cedulaCliente);
        
        //Instanciacion de un objeto tipo Vehiculo
        Vehiculo vehiculo = new Vehiculo(placaVehiculo,marcaVehiculo,modeloVehiculo,yearVehiculo,kilometrajeVehiculo,cedulaCliente);

        //Instanciacion de un objeto tipo GestorVehiculoCliente para usar el metodo registrar Vehiculo
        GestorAdministracionClienteVehiculo cliente_vehiculo = new GestorAdministracionClienteVehiculo();
        cliente_vehiculo.registrarVehiculo(vehiculo);
        
        //Limpiado de labels
        txtPlacaVehiculo.setText("");
        txtMarcaVehiculo.setText("");
        txtModeloVehiculo.setText("");
        txtYearVehiculo.setText("");
        txtKilometrajeVehiculo.setText("");    
    }//GEN-LAST:event_botonRegistrarVehiculoActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazRegistroVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistroVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistroVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistroVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Cliente cliente) { 
                new InterfazRegistroVehiculos(cliente).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrarVehiculo;
    private javax.swing.JLabel labelCedulaCliente;
    private javax.swing.JLabel labelKilometrajeVehiculo;
    private javax.swing.JLabel labelMarcaVehiculo;
    private javax.swing.JLabel labelModeloVehiculo;
    private javax.swing.JLabel labelPlacaVehiculo;
    private java.awt.Label labelTituloVentana;
    private javax.swing.JLabel labelYearVehiculo;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtKilometrajeVehiculo;
    private javax.swing.JTextField txtMarcaVehiculo;
    private javax.swing.JTextField txtModeloVehiculo;
    private javax.swing.JTextField txtPlacaVehiculo;
    private javax.swing.JTextField txtYearVehiculo;
    // End of variables declaration//GEN-END:variables
}
