package Interfaz;

import Gestores.GestorVehiculoCliente;
import Persona.Cliente;
import Persona.Persona;
import Vehiculo.Vehiculo;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class InterfazRegistroClienteVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form InterfazRegistroClientes
     */
    public InterfazRegistroClienteVehiculo() {
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

        labelTituloVentana = new java.awt.Label();
        labelCedula = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelFechaRegistro = new javax.swing.JLabel();
        txtCedulaCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtCorreoElectronicoCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccionCliente = new javax.swing.JTextArea();
        botonRegistrarClientes = new javax.swing.JButton();
        labelYearVehiculo = new javax.swing.JLabel();
        labelKilometrajeVehiculo = new javax.swing.JLabel();
        txtMarcaVehiculo = new javax.swing.JTextField();
        txtPlacaVehiculo = new javax.swing.JTextField();
        txtModeloVehiculo = new javax.swing.JTextField();
        txtYearVehiculo = new javax.swing.JTextField();
        txtKilometrajeVehiculo = new javax.swing.JTextField();
        labelModeloVehiculo = new javax.swing.JLabel();
        labelPlacaVehiculo = new javax.swing.JLabel();
        labelCedulaCliente = new javax.swing.JLabel();
        labelMarcaVehiculo = new javax.swing.JLabel();
        txtCedulaCliente1 = new javax.swing.JTextField();
        calendarFechaRegistro = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTituloVentana.setAlignment(java.awt.Label.CENTER);
        labelTituloVentana.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTituloVentana.setText("Registro Clientes");

        labelCedula.setText("Cédula:");

        labelNombre.setText("Nombre Completo:");

        labelTelefono.setText("Teléfono:");

        labelDireccion.setText("Dirección:");

        labelCorreo.setText("Correo Electrónico:");

        labelFechaRegistro.setText("Fecha Registro:");

        txtDireccionCliente.setColumns(20);
        txtDireccionCliente.setRows(5);
        jScrollPane1.setViewportView(txtDireccionCliente);

        botonRegistrarClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRegistrarClientes.setText("Registrar Cliente");
        botonRegistrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarClientesActionPerformed(evt);
            }
        });

        labelYearVehiculo.setText("Año:");

        labelKilometrajeVehiculo.setText("Kilometraje");

        labelModeloVehiculo.setText("Modelo:");

        labelPlacaVehiculo.setText("Placa:");

        labelCedulaCliente.setText("Ced. Cliente Asociado");

        labelMarcaVehiculo.setText("Marca:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(labelFechaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(txtCorreoElectronicoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(txtCedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(calendarFechaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelMarcaVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMarcaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelModeloVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addComponent(labelCedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedulaCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(labelTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(botonRegistrarClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCedula)
                        .addGap(29, 29, 29)
                        .addComponent(labelNombre)
                        .addGap(31, 31, 31)
                        .addComponent(labelTelefono)
                        .addGap(40, 40, 40)
                        .addComponent(labelDireccion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCorreo)
                                .addGap(33, 33, 33)
                                .addComponent(labelFechaRegistro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCorreoElectronicoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(calendarFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(txtCedulaCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(botonRegistrarClientes)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton para registrar un cliente y su vehiculo
    private void botonRegistrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarClientesActionPerformed
        //Definicion de variables que van a capturar lo que se ingrese en los textfields
        String ced_cliente = txtCedulaCliente.getText().trim();
        String nombreCliente = txtNombreCliente.getText().trim(); 
        String telefonoCliente = txtTelefonoCliente.getText().trim();
        String direccionCliente = txtDireccionCliente.getText();
        String correoCliente = txtCorreoElectronicoCliente.getText().trim();
        LocalDate fechaRegistro = convertirDatetoLocalDate(calendarFechaRegistro.getDate());
        
        //Instanciacion de un objeto tipo Cliente con las variables anteriormente capturadas
        Cliente cliente = new Cliente(ced_cliente,nombreCliente,telefonoCliente,direccionCliente,correoCliente,Persona.Roles.Cliente,fechaRegistro);
        
        //Definicion de variables que van a capturar lo que se ingrese en los textfields
        String placaVehiculo = txtPlacaVehiculo.getText().trim();
        String marcaVehiculo = txtMarcaVehiculo.getText().trim();
        String modeloVehiculo = txtModeloVehiculo.getText().trim();
        Integer yearVehiculo = Integer.valueOf(txtYearVehiculo.getText());
        Integer kilometrajeVehiculo = Integer.valueOf(txtKilometrajeVehiculo.getText().trim());
        String cedulaCliente = cliente.getCedula();

        //Instanciacion de un objeto tipo Vehiculo con las variables anteriormente capturadas
        Vehiculo vehiculo = new Vehiculo(placaVehiculo,marcaVehiculo,modeloVehiculo,yearVehiculo,kilometrajeVehiculo,cedulaCliente);
       
        //Instanciacion de un objecto tipo GestorVehiculoCliente para usar el metodo registrarClienteVehiculo
        GestorVehiculoCliente clienteNuevo = new GestorVehiculoCliente();
        clienteNuevo.registrarClienteVehiculo(cliente, vehiculo);
        
        //Limpiado de labels
        txtPlacaVehiculo.setText("");
        txtMarcaVehiculo.setText("");
        txtModeloVehiculo.setText("");
        txtYearVehiculo.setText("");
        txtKilometrajeVehiculo.setText("");
        
    }//GEN-LAST:event_botonRegistrarClientesActionPerformed

    //Metodo para convertir un Date a LocalDate
    public LocalDate convertirDatetoLocalDate(Date date) {
        return date.toInstant()
        .atZone(ZoneId.systemDefault())
        .toLocalDate();
}  
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
            java.util.logging.Logger.getLogger(InterfazRegistroClienteVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistroClienteVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistroClienteVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistroClienteVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistroClienteVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrarClientes;
    private com.toedter.calendar.JDateChooser calendarFechaRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelCedulaCliente;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFechaRegistro;
    private javax.swing.JLabel labelKilometrajeVehiculo;
    private javax.swing.JLabel labelMarcaVehiculo;
    private javax.swing.JLabel labelModeloVehiculo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPlacaVehiculo;
    private javax.swing.JLabel labelTelefono;
    private java.awt.Label labelTituloVentana;
    private javax.swing.JLabel labelYearVehiculo;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtCedulaCliente1;
    private javax.swing.JTextField txtCorreoElectronicoCliente;
    private javax.swing.JTextArea txtDireccionCliente;
    private javax.swing.JTextField txtKilometrajeVehiculo;
    private javax.swing.JTextField txtMarcaVehiculo;
    private javax.swing.JTextField txtModeloVehiculo;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtPlacaVehiculo;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtYearVehiculo;
    // End of variables declaration//GEN-END:variables
}
