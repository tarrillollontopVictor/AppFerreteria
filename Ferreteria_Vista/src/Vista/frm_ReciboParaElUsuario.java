package Vista;


import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class frm_ReciboParaElUsuario extends javax.swing.JFrame {

    Format RegistroFecha = new SimpleDateFormat("dd-MM-yyyy");
    String GeneradorF = RegistroFecha.format(new Date());

    Format RegistroHora = new SimpleDateFormat("HH:mm:ss");
    String GeneradorH = RegistroHora.format(new Date());

    // Método en el formulario de destino para recibir los datos de la tabla
    public void setDatosTabla(Object[][] datos) {
        // Obtener el modelo de tabla de la tabla de destino
        DefaultTableModel modeloDestino = (DefaultTableModel) jtblRecibo.getModel();

        // Limpiar el modelo de la tabla de destino
        modeloDestino.setRowCount(0);

        // Agregar los datos al modelo de tabla de la tabla de destino
        for (Object[] fila : datos) {
            modeloDestino.addRow(fila);
        }
    }

    frm_RegistrarVenta Aux = new frm_RegistrarVenta();

    public frm_ReciboParaElUsuario() {
        initComponents();

        this.setLocationRelativeTo(null); // centrar en pantalla
        this.setResizable(false);// bloquear el maximizar

        TableColumn columna;
        columna = jtblRecibo.getColumnModel().getColumn(0);
        columna.setPreferredWidth(0);

        jlblPago.setText("PAGO TOTAL: S/. " + Aux.TotalPagar);
        jlblCodigo.setText("CODIGO:  " + Aux.Codigoaaa);
        jlblNombre.setText(Aux.Nombreaaa);

        jlblTiemporDelRecibo.setText("FECHA: " + GeneradorF + " HORA: " + GeneradorH);

        double SinIGV, IGV;

        IGV = Double.parseDouble(Aux.TotalPagar) * 0.18;
        SinIGV = Double.parseDouble(Aux.TotalPagar) - IGV;

        DecimalFormat df = new DecimalFormat("#####.00");

        String sinigv = "S/." + df.format(SinIGV);
        String igv = "S/." + df.format(IGV);

        jlblSinIGV.setText(sinigv);
        jlblIGV.setText(igv);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jbtnRetirar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlblPago = new javax.swing.JLabel();
        jlblTiemporDelRecibo = new javax.swing.JLabel();
        jlblCodigo = new javax.swing.JLabel();
        jlblNombre = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblRecibo = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jlblNombre2 = new javax.swing.JLabel();
        jlblIGV = new javax.swing.JLabel();
        jlblNombre4 = new javax.swing.JLabel();
        jlblSinIGV = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RECIBO");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 460, 50));

        jbtnRetirar.setBackground(new java.awt.Color(204, 255, 255));
        jbtnRetirar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Finalizar.png"))); // NOI18N
        jbtnRetirar.setMnemonic('v');
        jbtnRetirar.setText("FINALIZAR");
        jbtnRetirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRetirarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, 210, 50));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("@2023-2 by Grupo 3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 660, 290, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 460, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 460, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("GRACIAS POR SU COMPRA");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 310, 30));

        jlblPago.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jlblPago.setForeground(new java.awt.Color(255, 255, 255));
        jlblPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPago.setText("PAGO TOTAL: S/. ##.##");
        jlblPago.setToolTipText("");
        jPanel1.add(jlblPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 460, 50));

        jlblTiemporDelRecibo.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jlblTiemporDelRecibo.setForeground(new java.awt.Color(255, 255, 255));
        jlblTiemporDelRecibo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTiemporDelRecibo.setText("FECHA: ##/##/####          HORA: ##:##:##");
        jlblTiemporDelRecibo.setToolTipText("");
        jPanel1.add(jlblTiemporDelRecibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 460, 40));

        jlblCodigo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jlblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jlblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCodigo.setText("CODIGO:  ###########");
        jlblCodigo.setToolTipText("");
        jPanel1.add(jlblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 460, 40));

        jlblNombre.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jlblNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNombre.setText("NOMBRE");
        jlblNombre.setToolTipText("");
        jPanel1.add(jlblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 460, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/QR.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 100, 100));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 460, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 460, 40));

        jtblRecibo.setBackground(new java.awt.Color(0, 0, 0));
        jtblRecibo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtblRecibo.setForeground(new java.awt.Color(255, 255, 255));
        jtblRecibo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N°", "PRODUCTO", "P. UNITARIO", "CANTIDAD", "TOTAL"
            }
        ));
        jtblRecibo.setGridColor(new java.awt.Color(0, 0, 0));
        jtblRecibo.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jtblRecibo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 440, 160));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 460, 40));

        jlblNombre2.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jlblNombre2.setForeground(new java.awt.Color(255, 255, 255));
        jlblNombre2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlblNombre2.setText("I.G.V. 18 %");
        jlblNombre2.setToolTipText("");
        jPanel1.add(jlblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 320, 40));

        jlblIGV.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jlblIGV.setForeground(new java.awt.Color(255, 255, 255));
        jlblIGV.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlblIGV.setText("S/.##.##");
        jlblIGV.setToolTipText("");
        jPanel1.add(jlblIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 110, 40));

        jlblNombre4.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jlblNombre4.setForeground(new java.awt.Color(255, 255, 255));
        jlblNombre4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlblNombre4.setText("Sub Total (Sin I.G.V.)");
        jlblNombre4.setToolTipText("");
        jPanel1.add(jlblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 320, 40));

        jlblSinIGV.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jlblSinIGV.setForeground(new java.awt.Color(255, 255, 255));
        jlblSinIGV.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlblSinIGV.setText("S/.##.##");
        jlblSinIGV.setToolTipText("");
        jPanel1.add(jlblSinIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 110, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, 90));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Av. Virgen del Pilar s/n Int. 514 – CC Don Manuel");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 270, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("\"Distribuidora & Luminarias Consa\"");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 270, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("RUC: 10431742069");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 270, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRetirarActionPerformed

        try {                                            
            
            String cod = Aux.Codigoaaa;
            String nom = Aux.Nombreaaa;
            String Total = Aux.TotalPagar;
            
            DecimalFormat df = new DecimalFormat("#####.00");
            
            double totalx = Double.parseDouble(Total);
            double igv = totalx * 0.18;
            double sinigv = totalx - igv;
            
            double igvx = Double.parseDouble(df.format(igv));
            double sinigvx = Double.parseDouble(df.format(sinigv));
            double totaln = Double.parseDouble(df.format(totalx));
            
            Connection con = Conexion.getInstance().getCon();
            PreparedStatement ps = null;
            
            String sql = "{CALL INSERTAR_VENTA(?, ?, ?, ?, ?, ?)}";
            
            try {
                ps = con.prepareCall(sql);
                
                ps.setString(1, cod);
                ps.setString(2, nom);
                ps.setDouble(3, sinigvx);
                ps.setDouble(4, igvx);
                ps.setDouble(5, totaln);
                
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date fecha = dateFormat.parse(GeneradorF);
                ps.setDate(6, new java.sql.Date(fecha.getTime()));
                
                ps.execute();
                
            } catch (SQLException | ParseException e) {
                System.out.println(e);
            } finally {
                try {
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
            
            new frm_RegistrarVenta().setVisible(true);
            this.setVisible(false);
            
        } catch (SQLException ex) {
            Logger.getLogger(frm_ReciboParaElUsuario.class.getName()).log(Level.SEVERE, null,ex);
        }

    }//GEN-LAST:event_jbtnRetirarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ReciboParaElUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ReciboParaElUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ReciboParaElUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ReciboParaElUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ReciboParaElUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnRetirar;
    private javax.swing.JLabel jlblCodigo;
    private javax.swing.JLabel jlblIGV;
    private javax.swing.JLabel jlblNombre;
    private javax.swing.JLabel jlblNombre2;
    private javax.swing.JLabel jlblNombre4;
    private javax.swing.JLabel jlblPago;
    private javax.swing.JLabel jlblSinIGV;
    private javax.swing.JLabel jlblTiemporDelRecibo;
    private javax.swing.JTable jtblRecibo;
    // End of variables declaration//GEN-END:variables

}
