package Vista;

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

public class frm_Empleados extends javax.swing.JFrame {

    DefaultTableModel EMPLEADOS;

    String[] cabecera = {"N°", "ID", "NOMBRE", "APELLIDO M", "APELLIDO P", "EDAD", "GENERO", "DISTRITO", "TELEFONO", "CORREO",
        "FECHA DE CONTRATACIÓN", "SALARIO", "DEPARTAMENTO", "CARGO"};

    String[][] data;

    int cont = 1;

    public frm_Empleados() throws SQLException {
        initComponents();

        this.setLocationRelativeTo(null); // centrar en pantalla
        this.setResizable(false);// bloquear el maximizar

        EMPLEADOS = new DefaultTableModel(data, cabecera);
        jtblInformacionDeEmpleados.setModel(EMPLEADOS);
        
        TableColumn columna;
        columna = jtblInformacionDeEmpleados.getColumnModel().getColumn(0);
        columna.setPreferredWidth(0);

        Connection con = Conexion.getInstance().getCon();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT DNI_Empleado, Nombres, ApellidosP, ApellidosM, Edad, Genero, Distrito, Telefono, Correo, FechaContrato, Salario, Departamento, Cargo FROM Empleados";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Vector<Object> fila = new Vector<>();
                fila.add(cont);
                fila.add(rs.getString("DNI_Empleado"));
                fila.add(rs.getString("Nombres"));
                fila.add(rs.getString("ApellidosP"));
                fila.add(rs.getString("ApellidosM"));
                fila.add(rs.getInt("Edad"));
                fila.add(rs.getString("Genero"));
                fila.add(rs.getString("Distrito"));
                fila.add(rs.getString("Telefono"));
                fila.add(rs.getString("Correo"));
                fila.add(rs.getDate("FechaContrato"));
                fila.add("S/. " + rs.getDouble("Salario"));
                fila.add(rs.getString("Departamento"));
                fila.add(rs.getString("Cargo"));

                EMPLEADOS.addRow(fila);

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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblInformacionDeEmpleados = new javax.swing.JTable();
        jbtnSalir = new javax.swing.JButton();
        jbtnEliminarEmpleado = new javax.swing.JButton();
        jbtnRegresar = new javax.swing.JButton();
        jbtnBuscarEmpleado = new javax.swing.JButton();
        jbtnNuevoEmpleado = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("@2023-2 by Grupo 3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenid@ a \"Distribuidora & Luminarias Consa\"");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 980, 60));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LISTA DE LOS EMPLEADOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 770, 60));

        jtblInformacionDeEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblInformacionDeEmpleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1130, 390));

        jbtnSalir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir a ventana.png"))); // NOI18N
        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 530, 270, 60));

        jbtnEliminarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnEliminarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar empleado.png"))); // NOI18N
        jbtnEliminarEmpleado.setText("ELIMINAR");
        jbtnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEliminarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 520, 60));

        jbtnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Regresar.png"))); // NOI18N
        jbtnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        jbtnBuscarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnBuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar empleado.png"))); // NOI18N
        jbtnBuscarEmpleado.setText("BUSCAR");
        jbtnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 60, 200, 60));

        jbtnNuevoEmpleado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnNuevoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo empleado.png"))); // NOI18N
        jbtnNuevoEmpleado.setText("NUEVO");
        jbtnNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnNuevoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 320, 60));

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

    private void jbtnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarEmpleadoActionPerformed

        String codigoAEliminar = JOptionPane.showInputDialog(null, "Ingrese el código del empleado a eliminar");

        

    }//GEN-LAST:event_jbtnEliminarEmpleadoActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed

        new frm_RegistroDeEmpleados().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnRegresarActionPerformed

    private void jbtnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarEmpleadoActionPerformed

        String BuscarEmpleado = JOptionPane.showInputDialog(null, "ESCRIBE EL CODIGO DEL EMPLEADO:");

        BuscarEmpleado = BuscarEmpleado.toUpperCase();

        if (BuscarEmpleado == null) {
            JOptionPane.showMessageDialog(null, "Ingrese un código válido");
        } else {

            DefaultTableModel modelo = (DefaultTableModel) jtblInformacionDeEmpleados.getModel();
            int numFilas = modelo.getRowCount();

            for (int fila = 0; fila < numFilas; fila++) {
                String Competencia = modelo.getValueAt(fila, 1).toString(); // Suponiendo que el código está en la primera columna
                if (BuscarEmpleado.equals(Competencia)) {
                    // Se encontró el código en la tabla
                    jtblInformacionDeEmpleados.setRowSelectionInterval(fila, fila); // Seleccionar la fila encontrada
                    jtblInformacionDeEmpleados.scrollRectToVisible(jtblInformacionDeEmpleados.getCellRect(fila, 0, true)); // Hacer visible la fila encontrada
                    return; // Terminar la búsqueda
                }
            }

            // Si no se encontró el código en la tabla
            JOptionPane.showMessageDialog(null, "Nombre no encontrado en la tabla.");

        }

    }//GEN-LAST:event_jbtnBuscarEmpleadoActionPerformed

    private void jbtnNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoEmpleadoActionPerformed

        new frm_RegistroDeEmpleados().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnNuevoEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new frm_Empleados().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frm_Empleados.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton jbtnBuscarEmpleado;
    private javax.swing.JButton jbtnEliminarEmpleado;
    private javax.swing.JButton jbtnNuevoEmpleado;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JTable jtblInformacionDeEmpleados;
    // End of variables declaration//GEN-END:variables
}
