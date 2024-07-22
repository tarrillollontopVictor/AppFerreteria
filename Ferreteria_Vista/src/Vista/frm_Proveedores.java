package Vista;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class frm_Proveedores extends javax.swing.JFrame {

    DefaultTableModel PROVEEDORES;

    String[] cabecera = {"N°", "NOMBRE", "DIRECCION", "CIUDAD", "PAIS", "TELEFONO", "CORREO ELECTRONICO", "SITIO WEB"};

    String[][] data;

    int cont = 1;

    public frm_Proveedores() throws SQLException {
        initComponents();

        this.setLocationRelativeTo(null); // centrar en pantalla
        this.setResizable(false);// bloquear el maximizar

        PROVEEDORES = new DefaultTableModel(data, cabecera);
        jtblInformacion.setModel(PROVEEDORES);
        
        TableColumn columna;
        columna = jtblInformacion.getColumnModel().getColumn(0);
        columna.setPreferredWidth(0);

        Connection con = Conexion.getInstance().getCon();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT RUC_Proveedor, Nombre, Direccion, Ciudad, Pais, Telefono, Correo, SitioWeb FROM Proveedor";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Vector<Object> fila = new Vector<>();
                fila.add(cont);
                fila.add(rs.getString("RUC_Proveedor"));
                fila.add(rs.getString("Nombre"));
                fila.add(rs.getString("Direccion"));
                fila.add(rs.getString("Ciudad"));
                fila.add(rs.getString("Pais"));
                fila.add(rs.getInt("Telefono"));
                fila.add(rs.getString("Correo"));
                fila.add(rs.getString("SitioWeb"));

                PROVEEDORES.addRow(fila);

                cont++;

            }

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblInformacion = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jbtnSalir = new javax.swing.JButton();
        jbtnEliminarCompetencia = new javax.swing.JButton();
        jbtnRegresar = new javax.swing.JButton();
        jbtnBuscarCompetencia = new javax.swing.JButton();
        jbtnNuevoCompetencia = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenid@ a \"Distribuidora & Luminarias Consa\"");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 780, 60));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LISTA DE LOS PROVEEDORES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 570, 60));

        jtblInformacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblInformacion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 930, 390));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("@2023-2 by Grupo 3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 960, 20));

        jbtnSalir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir a ventana.png"))); // NOI18N
        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, 260, 60));

        jbtnEliminarCompetencia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnEliminarCompetencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar competencia.png"))); // NOI18N
        jbtnEliminarCompetencia.setText("ELIMINAR");
        jbtnEliminarCompetencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarCompetenciaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEliminarCompetencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 340, 60));

        jbtnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Regresar.png"))); // NOI18N
        jbtnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        jbtnBuscarCompetencia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnBuscarCompetencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar competencias.png"))); // NOI18N
        jbtnBuscarCompetencia.setText("BUSCAR");
        jbtnBuscarCompetencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarCompetenciaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBuscarCompetencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 200, 60));

        jbtnNuevoCompetencia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnNuevoCompetencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nueva competencia.png"))); // NOI18N
        jbtnNuevoCompetencia.setText("NUEVO");
        jbtnNuevoCompetencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoCompetenciaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnNuevoCompetencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 310, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed

        new frm_VentanaPrincipal().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnEliminarCompetenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarCompetenciaActionPerformed

        String NombreCompetencia = JOptionPane.showInputDialog(null, "Ingrese el código del cliente a eliminar");


    }//GEN-LAST:event_jbtnEliminarCompetenciaActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed

        new frm_RegistroDelProveedor().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnRegresarActionPerformed

    private void jbtnBuscarCompetenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarCompetenciaActionPerformed

        String BuscarCompetencia = JOptionPane.showInputDialog(null, "ESCRIBIR EL NOMBRE DE LA COMPETENCIA:");

        if (BuscarCompetencia == null) {
            JOptionPane.showMessageDialog(null, "Ingrese un código válido");
        } else {

            DefaultTableModel modelo = (DefaultTableModel) jtblInformacion.getModel();
            int numFilas = modelo.getRowCount();

            for (int fila = 0; fila < numFilas; fila++) {
                String Competencia = modelo.getValueAt(fila, 1).toString(); // Suponiendo que el código está en la primera columna
                if (BuscarCompetencia.equals(Competencia)) {
                    // Se encontró el código en la tabla
                    jtblInformacion.setRowSelectionInterval(fila, fila); // Seleccionar la fila encontrada
                    jtblInformacion.scrollRectToVisible(jtblInformacion.getCellRect(fila, 0, true)); // Hacer visible la fila encontrada
                    return; // Terminar la búsqueda
                }
            }

            // Si no se encontró el código en la tabla
            JOptionPane.showMessageDialog(null, "Nombre no encontrado en la tabla.");

        }

    }//GEN-LAST:event_jbtnBuscarCompetenciaActionPerformed

    private void jbtnNuevoCompetenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoCompetenciaActionPerformed

        new frm_RegistroDelProveedor().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnNuevoCompetenciaActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                try {
                    new frm_Proveedores().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frm_Proveedores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBuscarCompetencia;
    private javax.swing.JButton jbtnEliminarCompetencia;
    private javax.swing.JButton jbtnNuevoCompetencia;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JTable jtblInformacion;
    // End of variables declaration//GEN-END:variables
}
