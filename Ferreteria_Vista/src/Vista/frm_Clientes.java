package Vista;


import Controlador.ControladorCliente;
import Modelo.Conexion;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class frm_Clientes extends javax.swing.JFrame {

    DefaultTableModel CLIENTES;

    String[] cabecera = {"N°", "CODIGO", "NOMBRE", "DISTRITO", "TELEFONO", "CORREO", "FECHA DE REGISTRO"};

    String[][] data;

    int cont = 1;
    
    ControladorCliente conCliente = new ControladorCliente();

    public frm_Clientes() throws SQLException {
        initComponents();

        this.setLocationRelativeTo(null); // centrar en pantalla
        this.setResizable(false);// bloquear el maximizar

        CLIENTES = new DefaultTableModel(data, cabecera);
        jtblInformacion.setModel(CLIENTES);
        
        TableColumn columna;
        columna = jtblInformacion.getColumnModel().getColumn(0);
        columna.setPreferredWidth(0);

        Connection con = Conexion.getInstance().getCon();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT DNI_Cliente, NombresAp, Distrito, Telefono, Correo, Fecha FROM Clientes";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Vector<Object> fila = new Vector<>();
                fila.add(cont);
                fila.add(rs.getString("DNI_Cliente"));
                fila.add(rs.getString("NombresAp"));
                fila.add(rs.getString("Distrito"));
                fila.add(rs.getInt("Telefono"));
                fila.add(rs.getString("Correo"));
                fila.add(rs.getDate("Fecha"));

                CLIENTES.addRow(data);

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
        jbtnEliminarCliente = new javax.swing.JButton();
        jbtnRegresar = new javax.swing.JButton();
        jbtnBuscarCliente = new javax.swing.JButton();
        jbtnNuevoCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenid@ a \"Distribuidora & Luminarias Consa\"");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 600, 60));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LISTA DE LOS CLIENTES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 390, 60));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 740, 390));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("@2023-2 by Grupo 3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 780, 20));

        jbtnSalir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir a ventana.png"))); // NOI18N
        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 220, 60));

        jbtnEliminarCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar cliente.png"))); // NOI18N
        jbtnEliminarCliente.setText("ELIMINAR");
        jbtnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 310, 60));

        jbtnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Regresar.png"))); // NOI18N
        jbtnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        jbtnBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar cliente.png"))); // NOI18N
        jbtnBuscarCliente.setText("BUSCAR");
        jbtnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 190, 60));

        jbtnNuevoCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo cliente.png"))); // NOI18N
        jbtnNuevoCliente.setText("NUEVO");
        jbtnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 190, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jbtnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarClienteActionPerformed

        String codigoAEliminar = JOptionPane.showInputDialog(null, "Ingrese el código del cliente a eliminar");

        if (codigoAEliminar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el DNI del Cliente que desea eliminar.");
            return;
        }

        int rowIndex = -1;

        if (CLIENTES.getRowCount() != 0) {
            for (int i = 0; i < CLIENTES.getRowCount(); i++) {
                if (CLIENTES.getValueAt(i, 1).equals(codigoAEliminar)) {
                    rowIndex = i;
                }
            }
        }

        boolean eliminado = conCliente.eliminar(codigoAEliminar);

        if (eliminado) {
            if (rowIndex != -1) {
                CLIENTES.removeRow(rowIndex);
            }
            JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar al Cliente");
        }


    }//GEN-LAST:event_jbtnEliminarClienteActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed

        new frm_RegistroDeClientes().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnRegresarActionPerformed

    private void jbtnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarClienteActionPerformed

        String BuscarCliente = JOptionPane.showInputDialog(null, "ESCRIBIR EL NOMBRE DEL CLIENTE:");

        if (BuscarCliente == null) {
            JOptionPane.showMessageDialog(null, "Ingrese un código válido");
        } else {

            DefaultTableModel modelo = (DefaultTableModel) jtblInformacion.getModel();
            int numFilas = modelo.getRowCount();

            for (int fila = 0; fila < numFilas; fila++) {
                String Competencia = modelo.getValueAt(fila, 1).toString(); // Suponiendo que el código está en la primera columna
                if (BuscarCliente.equals(Competencia)) {
                    // Se encontró el código en la tabla
                    jtblInformacion.setRowSelectionInterval(fila, fila); // Seleccionar la fila encontrada
                    jtblInformacion.scrollRectToVisible(jtblInformacion.getCellRect(fila, 0, true)); // Hacer visible la fila encontrada
                    return; // Terminar la búsqueda
                }
            }

            // Si no se encontró el código en la tabla
            JOptionPane.showMessageDialog(null, "Nombre no encontrado en la tabla.");

        }

    }//GEN-LAST:event_jbtnBuscarClienteActionPerformed

    private void jbtnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoClienteActionPerformed

        new frm_RegistroDeClientes().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnNuevoClienteActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                try {
                    new frm_Clientes().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frm_Clientes.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton jbtnBuscarCliente;
    private javax.swing.JButton jbtnEliminarCliente;
    private javax.swing.JButton jbtnNuevoCliente;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JTable jtblInformacion;
    // End of variables declaration//GEN-END:variables
}
