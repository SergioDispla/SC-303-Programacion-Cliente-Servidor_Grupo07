package Interfaz;

import Gestores.GestorAdministracionProductos;
import Gestores.GestorAdministracionClienteVehiculo;
import Persona.Cliente;
import Persona.Persona;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InterfazAdministracionClienteVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form InterfazRegistroClientes
     */
    public InterfazAdministracionClienteVehiculo() {
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

        jFrame1 = new javax.swing.JFrame();
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
        calendarFechaRegistro = new com.toedter.calendar.JDateChooser();
        botonListarClientes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        labelListado = new javax.swing.JLabel();
        labelRegistro1 = new javax.swing.JLabel();
        botonEliminarClientes = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTituloVentana.setAlignment(java.awt.Label.CENTER);
        labelTituloVentana.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTituloVentana.setText("Administracion Clientes");

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

        botonListarClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonListarClientes.setText("Listar Clientes");
        botonListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarClientesActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(new javax.swing.border.MatteBorder(null));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Placa", "Vehiculo"
            }
        ));
        jScrollPane2.setViewportView(tablaClientes);

        labelListado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelListado.setText("Listado Clientes");

        labelRegistro1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelRegistro1.setText("Registro");

        botonEliminarClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonEliminarClientes.setText("Eliminar Cliente");
        botonEliminarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelCedula, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(labelCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelNombre, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelFechaRegistro)
                                .addGap(40, 40, 40)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(txtCorreoElectronicoCliente)
                                .addComponent(txtNombreCliente)
                                .addComponent(txtCedulaCliente)
                                .addComponent(txtTelefonoCliente)
                                .addComponent(calendarFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonRegistrarClientes))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonListarClientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonEliminarClientes))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(labelTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelListado)
                .addGap(246, 246, 246))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(252, 252, 252)
                    .addComponent(labelRegistro1)
                    .addContainerGap(771, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(labelListado)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCedula)
                                .addGap(29, 29, 29)
                                .addComponent(labelNombre)
                                .addGap(31, 31, 31)
                                .addComponent(labelTelefono)
                                .addGap(40, 40, 40)
                                .addComponent(labelDireccion))
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
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonRegistrarClientes)
                            .addComponent(botonListarClientes)
                            .addComponent(botonEliminarClientes)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(labelRegistro1)
                    .addContainerGap(526, Short.MAX_VALUE)))
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

        //Instanciacion de un objeto tipo GestorVehiculoCliente para usar el metodo registrarCliente
        GestorAdministracionClienteVehiculo clienteNuevo = new GestorAdministracionClienteVehiculo();
        clienteNuevo.registrarCliente(cliente);

        InterfazRegistroVehiculos interfazRegistroVehiculos = new InterfazRegistroVehiculos(cliente);
        interfazRegistroVehiculos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        interfazRegistroVehiculos.setVisible(true);

        //Limpiamos los textfields
        txtCedulaCliente.setText("");
        txtNombreCliente.setText("");
        txtTelefonoCliente.setText("");
        txtDireccionCliente.setText("");
        txtCorreoElectronicoCliente.setText("");
        calendarFechaRegistro.setDate(null);  
    }//GEN-LAST:event_botonRegistrarClientesActionPerformed

    private void botonListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarClientesActionPerformed
        //Instanciacion de un objeto tipo GestorVehiculoCliente para usar el metodo listarClientes
        GestorAdministracionClienteVehiculo clientes = new GestorAdministracionClienteVehiculo();
        
        clientes.listarClientesYVehiculos();
        tablaClientes.setModel(clientes.getClientesDefaultModel());        
    }//GEN-LAST:event_botonListarClientesActionPerformed

    private void botonEliminarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarClientesActionPerformed
        //Instanciacion de un objeto tipo GestorAdministracionProductos para usar el metodo eliminarProductos()
        GestorAdministracionClienteVehiculo cliente = new GestorAdministracionClienteVehiculo();        

        //Capturamos el item seleccionado en la tabla
        int filaSeleccionada = tablaClientes.getSelectedRow();
        
        if (filaSeleccionada >= 0){
            //Obtenemos la cedula del cliente del item seleccionado
            String cedulaCliente = tablaClientes.getValueAt(filaSeleccionada, 0).toString();   
                
            //Llamamos al metodo eliminarCliente y le pasamos la cedula de cliente
            cliente.eliminarCliente(cedulaCliente);
                
            //Actualizamos la tabla para que refleje el nuevo contenido actualizado
            cliente.listarClientesYVehiculos();
            tablaClientes.setModel(cliente.getClientesDefaultModel());             
        } else {
                JOptionPane.showMessageDialog(null, "Seleccione al menos un cliente de la tabla");
        }
    }//GEN-LAST:event_botonEliminarClientesActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazAdministracionClienteVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministracionClienteVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministracionClienteVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministracionClienteVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdministracionClienteVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarClientes;
    private javax.swing.JButton botonListarClientes;
    private javax.swing.JButton botonRegistrarClientes;
    private com.toedter.calendar.JDateChooser calendarFechaRegistro;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFechaRegistro;
    private javax.swing.JLabel labelListado;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRegistro1;
    private javax.swing.JLabel labelTelefono;
    private java.awt.Label labelTituloVentana;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtCorreoElectronicoCliente;
    private javax.swing.JTextArea txtDireccionCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
