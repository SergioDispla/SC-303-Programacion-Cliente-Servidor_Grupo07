package Interfaz;

import Gestores.GestorAdministracionClienteVehiculo;
import Gestores.GestorOperarios;
import Persona.Operario;
import Persona.Persona;
import java.util.*;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

public class InterfazAdministracionOperarios extends javax.swing.JFrame {

    /**
     * Creates new form InterfazRegistroClientes
     */
    public InterfazAdministracionOperarios() {
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
        labelIdEmpleado = new javax.swing.JLabel();
        labelCedulaEmpleado = new javax.swing.JLabel();
        labelNombreEmpleado = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelSalarioEmpleado = new javax.swing.JLabel();
        labelFechaRegistro = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        botonListarOperarios = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaOperarios = new javax.swing.JTable();
        botonRegistrarOperarios = new javax.swing.JButton();
        calendarFechaContratacion = new com.toedter.calendar.JDateChooser();
        labelTelefonoEmpleado = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        botonEliminarOperario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTituloVentana.setAlignment(java.awt.Label.CENTER);
        labelTituloVentana.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTituloVentana.setText("Registro Operarios");

        labelIdEmpleado.setText("Id Empleado");

        labelCedulaEmpleado.setText("Cédula:");

        labelNombreEmpleado.setText("Nombre:");

        labelDireccion.setText("Dirección:");

        labelCorreo.setText("Correo Electrónico:");

        labelSalarioEmpleado.setText("Salario");

        labelFechaRegistro.setText("Fecha Contratación:");

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

        botonListarOperarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonListarOperarios.setText("Listar Operarios");
        botonListarOperarios.setActionCommand("Listar Operadores");
        botonListarOperarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarOperariosActionPerformed(evt);
            }
        });

        tablaOperarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Operario", "Nombre"
            }
        ));
        jScrollPane2.setViewportView(tablaOperarios);

        botonRegistrarOperarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonRegistrarOperarios.setText("Registrar Operario");
        botonRegistrarOperarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarOperariosActionPerformed(evt);
            }
        });

        labelTelefonoEmpleado.setText("Telefono:");

        botonEliminarOperario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonEliminarOperario.setText("Eliminar Operario");
        botonEliminarOperario.setActionCommand("Listar Operadores");
        botonEliminarOperario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarOperarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Registrar Operario");

        jLabel2.setText("Lista Operarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelSalarioEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNombreEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelIdEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCedulaEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(labelFechaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTelefonoEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSalario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calendarFechaContratacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(botonRegistrarOperarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonListarOperarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminarOperario)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(labelTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(215, 215, 215))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelIdEmpleado)
                                .addGap(29, 29, 29)
                                .addComponent(labelCedulaEmpleado)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelNombreEmpleado)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelefonoEmpleado)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDireccion)
                                .addGap(53, 53, 53)
                                .addComponent(labelCorreo)
                                .addGap(37, 37, 37)
                                .addComponent(labelSalarioEmpleado)
                                .addGap(37, 37, 37)
                                .addComponent(labelFechaRegistro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(calendarFechaContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonListarOperarios)
                    .addComponent(botonRegistrarOperarios)
                    .addComponent(botonEliminarOperario))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton para listar operarios de la base de datos
    private void botonListarOperariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarOperariosActionPerformed
        //Instanciacion de un objeto tipo GestorOperarios para usar el metodo listarOperarios()
        GestorOperarios operarios = new GestorOperarios();
        
        //Lamada del metodo listarOperarios
        operarios.listarOperarios();
        tablaOperarios.setModel(operarios.getOperariosDefaultModel());        
    }//GEN-LAST:event_botonListarOperariosActionPerformed

    //Boton para registrar operarios de la base de datos
    private void botonRegistrarOperariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarOperariosActionPerformed
        //Definicion de variables que van a capturar lo que se ingrese en los textfields
        String id_Empleado = txtIdEmpleado.getText().trim();
        String ced_Empleado = txtCedula.getText().trim();
        String nombreEmpleado = txtNombre.getText().trim();
        String tel_Empleado = txtTelefono.getText().trim();
        String direccionEmpleado = txtDireccion.getText().trim();
        String correo_Empleado = txtCorreoElectronico.getText().trim();
        float salarioEmpleado = Float.parseFloat(txtSalario.getText().trim());
        LocalDate fecha_Contratacion = convertirDatetoLocalDate(calendarFechaContratacion.getDate());  
      
        //Instanciacion de un objeto tipo Operario
        Operario operario = new Operario(id_Empleado,ced_Empleado,nombreEmpleado,tel_Empleado,direccionEmpleado,correo_Empleado,Persona.Roles.Operario,salarioEmpleado,fecha_Contratacion);
        GestorOperarios nuevoOperario = new GestorOperarios();
        
        //Llamado del metodo registrarOperario()
        nuevoOperario.registrarOperario(operario);
            
        //Limpiado de labels
        txtIdEmpleado.setText("");
        txtCedula.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtDireccion.setText(""); 
        txtCorreoElectronico.setText("");
        txtSalario.setText("");
        calendarFechaContratacion.setDate(null);
    
    }//GEN-LAST:event_botonRegistrarOperariosActionPerformed

    //Boton para eliminar operarios de la base de datos
    private void botonEliminarOperarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarOperarioActionPerformed
        //Instanciacion de un objeto tipo GestorAdministracionProductos para usar el metodo eliminarProductos()
        GestorOperarios operario = new GestorOperarios();        

        //Capturamos el item seleccionado en la tabla
        int filaSeleccionada = tablaOperarios.getSelectedRow();
        
        if (filaSeleccionada >= 0){
            //Obtenemos la cedula del cliente del item seleccionado
            String id_Operario = tablaOperarios.getValueAt(filaSeleccionada, 0).toString();   
                
            //Llamamos al metodo eliminarCliente y le pasamos la cedula de cliente
            operario.eliminarOperario(id_Operario);
                
            //Actualizamos la tabla para que refleje el nuevo contenido actualizado
            operario.listarOperarios();
            tablaOperarios.setModel(operario.getOperariosDefaultModel());             
        } else {
                JOptionPane.showMessageDialog(null, "Seleccione al menos un operario de la tabla");
        }   
    }//GEN-LAST:event_botonEliminarOperarioActionPerformed
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
            java.util.logging.Logger.getLogger(InterfazAdministracionOperarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministracionOperarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministracionOperarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAdministracionOperarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdministracionOperarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarOperario;
    private javax.swing.JButton botonListarOperarios;
    private javax.swing.JButton botonRegistrarOperarios;
    private com.toedter.calendar.JDateChooser calendarFechaContratacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCedulaEmpleado;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFechaRegistro;
    private javax.swing.JLabel labelIdEmpleado;
    private javax.swing.JLabel labelNombreEmpleado;
    private javax.swing.JLabel labelSalarioEmpleado;
    private javax.swing.JLabel labelTelefonoEmpleado;
    private java.awt.Label labelTituloVentana;
    private javax.swing.JTable tablaOperarios;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}