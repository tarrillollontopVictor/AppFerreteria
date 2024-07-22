package Vista;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class frm_VentasRealizadas extends javax.swing.JFrame {

    DefaultTableModel VENTAS;

    String[] cabecera = {"N°", "CODIGO", "NOMBRE", "PRECIO S/IGV", "IGV", "TOTAL", "FECHA"};

    String[][] data;

    int cont = 1;

    public frm_VentasRealizadas() throws SQLException {
        initComponents();

        this.setLocationRelativeTo(null); // centrar en pantalla
        this.setResizable(false);// bloquear el maximizar

        VENTAS = new DefaultTableModel(data, cabecera);
        jtblVentas.setModel(VENTAS);
        
        TableColumn columna;
        columna = jtblVentas.getColumnModel().getColumn(0);
        columna.setPreferredWidth(0);

        Connection con = Conexion.getInstance().getCon();
        PreparedStatement ps = null;
        ResultSet rs = null;

        double sigv = 0, igvv = 0, totalventa = 0;

        try {
            String sql = "SELECT CodigoCliente, NombreCliente, sinIGV, IGV, Total, Fecha FROM Ventas";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Vector<Object> fila = new Vector<>();
                fila.add(cont);
                fila.add(rs.getString("CodigoCliente"));
                fila.add(rs.getString("NombreCliente"));
                fila.add("S/. " + rs.getDouble("sinIGV"));
                fila.add("S/. " + rs.getDouble("IGV"));
                fila.add("S/. " + rs.getDouble("Total"));
                fila.add(rs.getDate("Fecha"));

                VENTAS.addRow(fila);

                cont++;

                sigv += rs.getDouble("sinIGV");
                igvv += rs.getDouble("IGV");
                totalventa += rs.getDouble("Total");

            }

            jlblSinIGV.setText("S/." + sigv);
            jlblIGV.setText("S/." + igvv);
            jlblTotal.setText("S/." + totalventa);

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtnRegresar = new javax.swing.JButton();
        jbtnBuscarVenta = new javax.swing.JButton();
        jbtnNuevaVenta = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblVentas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jlblSinIGV = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jlblIGV = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jlblTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bienvenid@ a \"Distribuidora & Luminarias Consa\"");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 890, 30));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VENTAS REALIZADAS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 310, 90));

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("@2023-2 by Grupo 3");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 960, 20));

        jbtnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Regresar.png"))); // NOI18N
        jbtnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        jbtnBuscarVenta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnBuscarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar Venta.png"))); // NOI18N
        jbtnBuscarVenta.setText("BUSCAR");
        jbtnBuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnBuscarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 190, 70));

        jbtnNuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Venta.png"))); // NOI18N
        jbtnNuevaVenta.setText("NUEVA VENTA");
        jbtnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevaVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 270, 70));

        jtblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtblVentas);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 720, 470));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTADISTICA DE VENTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TOTAL SIN IGV", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblSinIGV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblSinIGV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSinIGV.setText("S/. ##.##");
        jPanel3.add(jlblSinIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 18, 170, 81));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 28, 190, 110));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TOTAL IGV", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblIGV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblIGV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblIGV.setText("S/. ##.##");
        jPanel4.add(jlblIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 18, 170, 81));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 110));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TOTAL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTotal.setText("S/. ##.##");
        jPanel5.add(jlblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 18, 170, 90));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 190, 120));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 210, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 160, 90));

        jbtnSalir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir a ventana.png"))); // NOI18N
        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 540, 210, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed

        new frm_VentanaPrincipal().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnRegresarActionPerformed

    private void jbtnBuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarVentaActionPerformed


    }//GEN-LAST:event_jbtnBuscarVentaActionPerformed

    private void jbtnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevaVentaActionPerformed

        new frm_RegistrarVenta().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnNuevaVentaActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed

        new frm_VentanaPrincipal().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frm_VentasRealizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_VentasRealizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_VentasRealizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_VentasRealizadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frm_VentasRealizadas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frm_VentasRealizadas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtnBuscarVenta;
    private javax.swing.JButton jbtnNuevaVenta;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JLabel jlblIGV;
    private javax.swing.JLabel jlblSinIGV;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JTable jtblVentas;
    // End of variables declaration//GEN-END:variables
}
