package Interfaz;

import Factura.Factura.TipoPago;
import Servicio.ServicioMecanico;
import Taller.ConectarDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

 public class InterfazServiciosMecanicos extends javax.swing.JFrame {
     TipoPago tipoPago;
     float subtotal = 0.0f;

    /**
     * Creates new form InterfazServicioTaller
     */
            
    public InterfazServiciosMecanicos() {
        initComponents();
        validacionOperario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelServiciosDisponibles = new java.awt.Label();
        labelTituloVentana1 = new java.awt.Label();
        labelCedulaCliente = new javax.swing.JLabel();
        txtCedulaCliente = new javax.swing.JTextField();
        botonBuscarCliente = new javax.swing.JButton();
        labelIngresarCedula = new java.awt.Label();
        labelCedulaCliente1 = new javax.swing.JLabel();
        labelCedulaCliente2 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        labelNombreOperario = new javax.swing.JLabel();
        listVehiculos = new java.awt.List();
        labelInformacionCliente1 = new java.awt.Label();
        comboServicios = new javax.swing.JComboBox<>();
        botonAgregarServicio = new javax.swing.JToggleButton();
        labelServiciosComprar = new java.awt.Label();
        botonProcesarOrden = new javax.swing.JToggleButton();
        listaServicios = new java.awt.List();
        labelSeleccionePlaca = new javax.swing.JLabel();
        labelSubtotalCompra = new javax.swing.JLabel();
        labelSubtotalMonto = new javax.swing.JLabel();
        labelTipoPago = new javax.swing.JLabel();
        comboTipoPago = new javax.swing.JComboBox<>();
        botonRegistrarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelServiciosDisponibles.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelServiciosDisponibles.setText("Servicios Disponibles");

        labelTituloVentana1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTituloVentana1.setText("Servicios Mecánicos  ");

        labelCedulaCliente.setText("Cédula Cliente");

        botonBuscarCliente.setText("Buscar Cliente");
        botonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarClienteActionPerformed(evt);
            }
        });

        labelIngresarCedula.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelIngresarCedula.setText("Ingrese cédula del cliente");

        labelCedulaCliente1.setText("Nombre Cliente: ");

        labelCedulaCliente2.setText("Placas Vehículo(s):");

        jLabel1.setText("Operario: ");

        labelInformacionCliente1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelInformacionCliente1.setText("Información Cliente");

        comboServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cambio de aceite - 25000", "Cambio de filtros - 5500", "Cambio de llantas - 45000", "Reparación de frenos - 80000", "Alineación y balanceo - 40000", "Reparación de suspensión - 120000", "Reparación de transmisión - 150000", "Reparación de motor - 200000", "Diagnóstico electrónico - 10000" }));

        botonAgregarServicio.setText("Agregar");
        botonAgregarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarServicioActionPerformed(evt);
            }
        });

        labelServiciosComprar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelServiciosComprar.setText("Servicios a Realizar");

        botonProcesarOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonProcesarOrden.setText("Procesar Orden");
        botonProcesarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProcesarOrdenActionPerformed(evt);
            }
        });

        labelSeleccionePlaca.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        labelSeleccionePlaca.setText("(Seleccione una placa)");

        labelSubtotalCompra.setText("Subtotal:");

        labelSubtotalMonto.setText("0");

        labelTipoPago.setText("Tipo Pago");

        comboTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TARJETA", "EFECTIVO" }));

        botonRegistrarCliente.setText("Registrar Cliente");
        botonRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(labelIngresarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCedulaCliente)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonBuscarCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botonRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(labelNombreOperario)
                                .addGap(110, 110, 110))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCedulaCliente1)
                                    .addComponent(labelCedulaCliente2)
                                    .addComponent(labelSeleccionePlaca))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(listVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelInformacionCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(labelServiciosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelServiciosComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(botonAgregarServicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(listaServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelSubtotalCompra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelSubtotalMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(labelTipoPago)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(762, 762, 762)
                        .addComponent(botonProcesarOrden)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(338, 338, 338)
                    .addComponent(labelTituloVentana1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(379, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labelNombreOperario))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelInformacionCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelCedulaCliente1)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(listVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelCedulaCliente2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelSeleccionePlaca)))
                                .addGap(44, 44, 44)
                                .addComponent(labelServiciosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelIngresarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelCedulaCliente)
                                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botonBuscarCliente)
                                    .addComponent(botonRegistrarCliente)))))
                    .addComponent(labelServiciosComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonAgregarServicio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listaServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelSubtotalCompra)
                                .addComponent(labelSubtotalMonto))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelTipoPago)
                                    .addComponent(comboTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(botonProcesarOrden)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(labelTituloVentana1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(639, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarClienteActionPerformed
        String cedulaCliente = txtCedulaCliente.getText().trim();
        
         try {
            // Establecer conexión a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            // Consulta SQL para consultar el cliente y los vehiculos asociados
            String consultaCliente = "SELECT nombre FROM clientes where cedula = (?)";
            
            // Preparar la declaracion SQL
            PreparedStatement declaracionCliente = conexion.prepareStatement(consultaCliente);
            declaracionCliente.setString(1, cedulaCliente);
            
            // Ejecutar la consulta y obtener el resultado
            ResultSet resultado = declaracionCliente.executeQuery();
            
            if (!resultado.isBeforeFirst()){ 
                JOptionPane.showMessageDialog(null, "[!] El cliente no se encuentra registrado");
            } else {            
                //Imprimir los resultados en la tabla
                while (resultado.next()) {
                    //Guardamos el resultado de la consulta en la variable
                    String nombre_cliente = resultado.getString("nombre");
                    
                    //Cambiamos el valor del text para que refleje el nombre del cliente
                    txtNombreCliente.setText(nombre_cliente);
                    
                    //Bloque de Consulta SQL para retornar las placas asociadas al cliente
                    // Consulta SQL para consultar datos del cliente
                    String consulta = "SELECT placa FROM vehiculos where cedula = (?)";
              
                    // Preparar la declaracion SQL
                    PreparedStatement declaracion = conexion.prepareStatement(consulta);
                    declaracion.setString(1, cedulaCliente);
            
                    // Ejecutar la consulta y obtener el resultado
                    resultado = declaracion.executeQuery(); 
                    
                    while (resultado.next()) {
                        //Guardamos el resultado de la consulta en la variable
                        String placa = resultado.getString("placa");  
                        
                        //Mostramos las placas asociadas a ese cliente como una lista
                        listVehiculos.add(placa);
                    }
                }
            }  
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error al conectar la base de datos " + e.getMessage());
        }
        
    }//GEN-LAST:event_botonBuscarClienteActionPerformed

    private void botonAgregarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarServicioActionPerformed
        if (txtNombreCliente.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar un cliente primero");   
        } else {
            //Obtenemos el item seleccionados y lo guardamos en variables
            int servicio_numero = comboServicios.getSelectedIndex();

            //Creamos una variable de tipo ServicioMecanico que va obtener un valor del ArrayList segun la posicion pasada 
            ServicioMecanico servicios = ServicioMecanico.getServiciosMecanicos().get(servicio_numero);

            //Mostramos los servicios seleccionados en una lista
            listaServicios.add(servicios.getNombre()+" - Precio: "+servicios.getPrecio());

            //Sumar el precio del servicio al subtotal
            subtotal += servicios.getPrecio();
            labelSubtotalMonto.setText(String.valueOf(subtotal));
        }    
    }//GEN-LAST:event_botonAgregarServicioActionPerformed

    private void botonProcesarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProcesarOrdenActionPerformed
        if (txtCedulaCliente.getText().isEmpty() || listaServicios.getItemCount() == 0){
            JOptionPane.showMessageDialog(null, "  Alguno de los campos necesarios esta vacío\nFavor ingresar cédula cliente o servicio mecánico");
        } else {
            //Instanciacion de un objeto tipo GestorAdministracionProductos para usar el metodo registrarVenta

        }
    }//GEN-LAST:event_botonProcesarOrdenActionPerformed

    private void botonRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarClienteActionPerformed
        SubInterfazRegistrarCliente subInterfaz = new SubInterfazRegistrarCliente();
        subInterfaz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        subInterfaz.setVisible(true);
    }//GEN-LAST:event_botonRegistrarClienteActionPerformed

    private void validacionOperario(){       
        try {
            String id_Empleado = JOptionPane.showInputDialog("Ingrese su ID de Empleado");
            
            // Establecer conexión a la base de datos
            ConectarDB connect = new ConectarDB();
            Connection conexion = connect.conectarDB();
            
            // Consulta SQL para insertar la transaccion en la tabla de "registromantenimiento"
            String consulta = "SELECT nombre FROM operarios WHERE id_operario = (?)";

            //Preparar la declaracion SQL
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, id_Empleado);
            
            //Ejecutar la consulta y obtener el resultado
            ResultSet resultado = declaracion.executeQuery();   
            
            //Se ejecuta un bucle para que el sistema deje pasar el usuario hasta que ingrese un ID correcto
            while(true){ 
                if (!resultado.isBeforeFirst()){ 
                    JOptionPane.showMessageDialog(null, "[!] El ID de Empleado no se encuentra registrado o no es válido");       
                } else {            
                    //Imprimir los resultados en la tabla
                    while (resultado.next()) {
                        String nombre = resultado.getString("nombre");
                        labelNombreOperario.setText(nombre);
                    } 
                    break;
                }
                id_Empleado = JOptionPane.showInputDialog("Ingrese su ID de Empleado");
                declaracion.setString(1, id_Empleado);
                resultado = declaracion.executeQuery();   
            }       
       } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos: " + e.getMessage());    
       }
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
            java.util.logging.Logger.getLogger(InterfazServiciosMecanicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazServiciosMecanicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazServiciosMecanicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazServiciosMecanicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazServiciosMecanicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonAgregarServicio;
    private javax.swing.JButton botonBuscarCliente;
    private javax.swing.JToggleButton botonProcesarOrden;
    private javax.swing.JButton botonRegistrarCliente;
    private javax.swing.JComboBox<String> comboServicios;
    private javax.swing.JComboBox<String> comboTipoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCedulaCliente;
    private javax.swing.JLabel labelCedulaCliente1;
    private javax.swing.JLabel labelCedulaCliente2;
    private java.awt.Label labelInformacionCliente1;
    private java.awt.Label labelIngresarCedula;
    private javax.swing.JLabel labelNombreOperario;
    private javax.swing.JLabel labelSeleccionePlaca;
    private java.awt.Label labelServiciosComprar;
    private java.awt.Label labelServiciosDisponibles;
    private javax.swing.JLabel labelSubtotalCompra;
    private javax.swing.JLabel labelSubtotalMonto;
    private javax.swing.JLabel labelTipoPago;
    private java.awt.Label labelTituloVentana1;
    private java.awt.List listVehiculos;
    private java.awt.List listaServicios;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}