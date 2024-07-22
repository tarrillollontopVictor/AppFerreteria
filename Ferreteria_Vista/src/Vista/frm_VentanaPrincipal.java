package Vista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frm_VentanaPrincipal extends javax.swing.JFrame {

    public frm_VentanaPrincipal() {
        initComponents();
        
        this.setLocationRelativeTo(null); //centrar en pantalla
        this.setResizable(false);//bloquear el maximizar
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtnCompetencia = new javax.swing.JButton();
        jbtnClientes = new javax.swing.JButton();
        jbtnProductos = new javax.swing.JButton();
        jbtnEmpleados = new javax.swing.JButton();
        jbtnCerrarSesion = new javax.swing.JButton();
        jbtnRealizarVenta = new javax.swing.JButton();
        jbtnReporteDeVentas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bienvenid@ a \"Distribuidora & Luminarias Consa\"");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 550, 60));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VENTANA PRINCIPAL");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 550, 50));

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("@2023-2 by Grupo 3");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 730, 20));

        jbtnCompetencia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnCompetencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Competencias.png"))); // NOI18N
        jbtnCompetencia.setText("REGISTRO PROVEEDOR");
        jbtnCompetencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCompetenciaActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnCompetencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 350, 60));

        jbtnClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Clientes.png"))); // NOI18N
        jbtnClientes.setText("REGISTRO CLIENTES");
        jbtnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClientesActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 350, 60));

        jbtnProductos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Productos.png"))); // NOI18N
        jbtnProductos.setText("REGISTRO PRODUCTOS");
        jbtnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProductosActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 350, 60));

        jbtnEmpleados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Empleados.png"))); // NOI18N
        jbtnEmpleados.setText("REGISTRO EMPLEADOS");
        jbtnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEmpleadosActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 350, 60));

        jbtnCerrarSesion.setBackground(new java.awt.Color(255, 153, 153));
        jbtnCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cerrar sesion.png"))); // NOI18N
        jbtnCerrarSesion.setText("CERRAR SESIÓN");
        jbtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 310, 60));

        jbtnRealizarVenta.setBackground(new java.awt.Color(153, 255, 255));
        jbtnRealizarVenta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnRealizarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Venta.png"))); // NOI18N
        jbtnRealizarVenta.setText("REALIZAR VENTA");
        jbtnRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRealizarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnRealizarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 350, 60));

        jbtnReporteDeVentas.setBackground(new java.awt.Color(153, 255, 153));
        jbtnReporteDeVentas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnReporteDeVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Reporte de ventas.png"))); // NOI18N
        jbtnReporteDeVentas.setText("REPORTE DE VENTAS");
        jbtnReporteDeVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReporteDeVentasActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnReporteDeVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 350, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCompetenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCompetenciaActionPerformed

        new frm_RegistroDelProveedor().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jbtnCompetenciaActionPerformed

    private void jbtnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClientesActionPerformed
        
        new frm_RegistroDeClientes().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jbtnClientesActionPerformed

    private void jbtnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProductosActionPerformed
        
        new frm_RegistroDeProductos().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jbtnProductosActionPerformed

    private void jbtnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEmpleadosActionPerformed
        
        new frm_RegistroDeEmpleados().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jbtnEmpleadosActionPerformed

    private void jbtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarSesionActionPerformed

        new frm_Administrador().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnCerrarSesionActionPerformed

    private void jbtnRealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRealizarVentaActionPerformed
        
        new frm_RegistrarVenta().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jbtnRealizarVentaActionPerformed

    private void jbtnReporteDeVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReporteDeVentasActionPerformed
        
        try {
            new frm_VentasRealizadas().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frm_VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        
    }//GEN-LAST:event_jbtnReporteDeVentasActionPerformed

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
            java.util.logging.Logger.getLogger(frm_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnCerrarSesion;
    private javax.swing.JButton jbtnClientes;
    private javax.swing.JButton jbtnCompetencia;
    private javax.swing.JButton jbtnEmpleados;
    private javax.swing.JButton jbtnProductos;
    private javax.swing.JButton jbtnRealizarVenta;
    private javax.swing.JButton jbtnReporteDeVentas;
    // End of variables declaration//GEN-END:variables
}
