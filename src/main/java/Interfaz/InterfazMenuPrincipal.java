/*
Interfaz grafica principal
Esta interfaz debera mostrar las siguientes opciones:
- Registros (clientes, operadores, productos)
- Mantenimientos (Vehiculo - Cliente)
- Ventas (Productos, Vehiculos)
- Reportes (TBD)
 */
package Interfaz;
import javax.swing.JFrame;

public class InterfazMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazMenuPrincipal
     */
    public InterfazMenuPrincipal() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBienvenida = new javax.swing.JLabel();
        botonRegistroOperadores = new javax.swing.JButton();
        botonRegistroProductos = new javax.swing.JButton();
        botonVentaProductos = new javax.swing.JButton();
        botonMantenimientoVehiculo = new javax.swing.JButton();
        botonRegistroClientes = new javax.swing.JButton();
        labelRegistros = new javax.swing.JLabel();
        labelReportes = new javax.swing.JLabel();
        labelMantenimientos = new javax.swing.JLabel();
        labelVentas = new javax.swing.JLabel();
        botonReporteVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelBienvenida.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelBienvenida.setText("Bienvenido a Lubri-Fast");

        botonRegistroOperadores.setText("Registro Operarios");
        botonRegistroOperadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroOperadoresActionPerformed(evt);
            }
        });

        botonRegistroProductos.setText("Registro Productos");
        botonRegistroProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroProductosActionPerformed(evt);
            }
        });

        botonVentaProductos.setText("Venta Productos");
        botonVentaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVentaProductosActionPerformed(evt);
            }
        });

        botonMantenimientoVehiculo.setText("Mantenimiento Vehiculos");
        botonMantenimientoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMantenimientoVehiculoActionPerformed(evt);
            }
        });

        botonRegistroClientes.setText("Registro Clientes");
        botonRegistroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroClientesActionPerformed(evt);
            }
        });

        labelRegistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelRegistros.setText("Administracion [Registros]");

        labelReportes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelReportes.setText("Reportes");

        labelMantenimientos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMantenimientos.setText("Mantenimientos");

        labelVentas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelVentas.setText("Ventas");

        botonReporteVentas.setText("Reporte Ventas Productos");
        botonReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(labelBienvenida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonMantenimientoVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(257, 257, 257))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(365, 365, 365)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonRegistroProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonRegistroClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonRegistroOperadores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMantenimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonVentaProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelReportes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonReporteVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelBienvenida)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRegistros)
                    .addComponent(labelMantenimientos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMantenimientoVehiculo)
                    .addComponent(botonRegistroClientes))
                .addGap(18, 18, 18)
                .addComponent(botonRegistroOperadores)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVentas)
                    .addComponent(botonRegistroProductos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVentaProductos)
                .addGap(90, 90, 90)
                .addComponent(labelReportes)
                .addGap(18, 18, 18)
                .addComponent(botonReporteVentas)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton para acceder a la subinterfaz de Registro Operadores
    private void botonRegistroOperadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroOperadoresActionPerformed
       InterfazRegistroOperarios interfaz = new InterfazRegistroOperarios();
       interfaz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       interfaz.setVisible(true);
    }//GEN-LAST:event_botonRegistroOperadoresActionPerformed

    //Boton para acceder a la subinterfaz de Registro de Productos
    private void botonRegistroProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroProductosActionPerformed
       InterfazRegistroProductos interfaz = new InterfazRegistroProductos();
       interfaz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       interfaz.setVisible(true);
    }//GEN-LAST:event_botonRegistroProductosActionPerformed

    //Boton para acceder a la subinterfaz de Venta de Productos
    private void botonVentaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVentaProductosActionPerformed
        InterfazVentaProductos interfaz = new InterfazVentaProductos();
        interfaz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        interfaz.setVisible(true);
    }//GEN-LAST:event_botonVentaProductosActionPerformed

    //Boton para acceder a la subinterfaz de Mantenimiento Vehiculos
    private void botonMantenimientoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMantenimientoVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMantenimientoVehiculoActionPerformed

    //Boton para acceder a la subinterfaz de Registro de Clientes
    private void botonRegistroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroClientesActionPerformed
       InterfazRegistroClienteVehiculo interfaz = new InterfazRegistroClienteVehiculo();
       interfaz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       interfaz.setVisible(true);
    }//GEN-LAST:event_botonRegistroClientesActionPerformed

    //Boton para acceder a la subinterfaz de Reporte de Ventas
    private void botonReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteVentasActionPerformed
       InterfazReportes interfaz = new InterfazReportes();
       interfaz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       interfaz.setVisible(true);
    }//GEN-LAST:event_botonReporteVentasActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMantenimientoVehiculo;
    private javax.swing.JButton botonRegistroClientes;
    private javax.swing.JButton botonRegistroOperadores;
    private javax.swing.JButton botonRegistroProductos;
    private javax.swing.JButton botonReporteVentas;
    private javax.swing.JButton botonVentaProductos;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel labelMantenimientos;
    private javax.swing.JLabel labelRegistros;
    private javax.swing.JLabel labelReportes;
    private javax.swing.JLabel labelVentas;
    // End of variables declaration//GEN-END:variables
}
