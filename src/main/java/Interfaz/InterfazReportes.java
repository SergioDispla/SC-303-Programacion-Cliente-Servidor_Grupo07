
package Interfaz;

import javax.swing.JFrame;


public class InterfazReportes extends javax.swing.JFrame {

    /**
     * Creates new form InterfazReportes
     */
    public InterfazReportes() {
        initComponents();
        setLocationRelativeTo(null);
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
        botonReporteOperarios = new javax.swing.JButton();
        botonReporteClienteVehiculo = new javax.swing.JButton();
        botonReporteVentasProductos = new javax.swing.JButton();
        botonReporteDetalladoVehiculo = new javax.swing.JButton();
        botonReporteMantenimientos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTituloVentana.setAlignment(java.awt.Label.CENTER);
        labelTituloVentana.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTituloVentana.setText("Administración de Reportes");

        botonReporteOperarios.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonReporteOperarios.setText("Reporte Operarios");
        botonReporteOperarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteOperariosActionPerformed(evt);
            }
        });

        botonReporteClienteVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonReporteClienteVehiculo.setText("Reporte Clientes y Vehículos");
        botonReporteClienteVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteClienteVehiculoActionPerformed(evt);
            }
        });

        botonReporteVentasProductos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonReporteVentasProductos.setText("Reporte Ventas Productos");
        botonReporteVentasProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteVentasProductosActionPerformed(evt);
            }
        });

        botonReporteDetalladoVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonReporteDetalladoVehiculo.setText("Reporte Detallado Vehículos");
        botonReporteDetalladoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteDetalladoVehiculoActionPerformed(evt);
            }
        });

        botonReporteMantenimientos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonReporteMantenimientos.setText("Reporte Mantenimientos");
        botonReporteMantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteMantenimientosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(labelTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonReporteOperarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonReporteClienteVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonReporteDetalladoVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonReporteVentasProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonReporteMantenimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(botonReporteOperarios, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReporteClienteVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReporteDetalladoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReporteVentasProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonReporteMantenimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonReporteOperariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteOperariosActionPerformed
        SubInterfazReporteOperarios interfaz = new SubInterfazReporteOperarios();
        interfaz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        interfaz.setVisible(true);
     
    }//GEN-LAST:event_botonReporteOperariosActionPerformed

    private void botonReporteClienteVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteClienteVehiculoActionPerformed
        SubInterfazReporteClientesYVehiculos interfaz = new SubInterfazReporteClientesYVehiculos();
        interfaz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        interfaz.setVisible(true);
    }//GEN-LAST:event_botonReporteClienteVehiculoActionPerformed

    private void botonReporteDetalladoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteDetalladoVehiculoActionPerformed
        SubInterfazReporteDetalladoVehiculo interfaz = new SubInterfazReporteDetalladoVehiculo();
        interfaz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        interfaz.setVisible(true);
    }//GEN-LAST:event_botonReporteDetalladoVehiculoActionPerformed

    private void botonReporteVentasProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteVentasProductosActionPerformed
       SubInterfazReporteVentaProductos interfaz = new SubInterfazReporteVentaProductos();
       interfaz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       interfaz.setVisible(true);
    }//GEN-LAST:event_botonReporteVentasProductosActionPerformed

    private void botonReporteMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteMantenimientosActionPerformed
        SubInterfazReporteMantenimientos interfaz = new SubInterfazReporteMantenimientos();
        interfaz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        interfaz.setVisible(true);      
    }//GEN-LAST:event_botonReporteMantenimientosActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonReporteClienteVehiculo;
    private javax.swing.JButton botonReporteDetalladoVehiculo;
    private javax.swing.JButton botonReporteMantenimientos;
    private javax.swing.JButton botonReporteOperarios;
    private javax.swing.JButton botonReporteVentasProductos;
    private java.awt.Label labelTituloVentana;
    // End of variables declaration//GEN-END:variables
}
