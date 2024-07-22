package Vista;

import Controlador.ControladorProvedor;
import Modelo.Proveedor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class frm_RegistroDelProveedor extends javax.swing.JFrame {

    //Declaracion del formato de la table
    DefaultTableModel PROVEEDORES;
    String[] cabecera = {"N°", "RUC", "NOMBRE", "DIRECCION", "CIUDAD", "PAIS", "TELEFONO", "CORREO ELECTRONICO", "SITIO WEB"};
    String[][] data;

    Proveedor proveedor;
    ControladorProvedor controladorProvedor = new ControladorProvedor();
    

    public frm_RegistroDelProveedor() {
        initComponents();

        this.setResizable(false);// bloquear el maximizar
        this.setLocationRelativeTo(null);// poner pantalla centro

        //Habilitando los encabezados de la tabla
        PROVEEDORES = new DefaultTableModel(data, cabecera);
        jtblDatosDeLosProveedores.setModel(PROVEEDORES);

        CambiarTamañoColumna();

        jtxtPais.setText("Perú");

    }

    void CambiarTamañoColumna() {
        TableColumn columna;
        columna = jtblDatosDeLosProveedores.getColumnModel().getColumn(0);
        columna.setPreferredWidth(5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnRegresar = new javax.swing.JButton();
        jbtnReporteCompetencia = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtNombreProveedor = new javax.swing.JTextField();
        jtxtDireccion = new javax.swing.JTextField();
        jtxtCiudad = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jtxtCorreo = new javax.swing.JTextField();
        jbtnEliminarProveedor = new javax.swing.JButton();
        jtxtPais = new javax.swing.JTextField();
        jbtnRegistrarProveedor = new javax.swing.JButton();
        jbtnBuscarProveedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatosDeLosProveedores = new javax.swing.JTable();
        jtxtWeb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jbtnModificarProveedor = new javax.swing.JButton();
        jtxtRUCProveedor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Regresar.png"))); // NOI18N
        jbtnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        jbtnReporteCompetencia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnReporteCompetencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Abrir.png"))); // NOI18N
        jbtnReporteCompetencia.setText("REPORTE");
        jbtnReporteCompetencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReporteCompetenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReporteCompetencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, 60));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bienvenid@ a \"Distribuidora & Luminarias Consa\"");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 540, 40));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REGISTRAR PROVEEDOR");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 370, 60));

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("@2023-2 by Grupo 3");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 780, 20));

        jtxtNombreProveedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtNombreProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtNombreProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 280, 60));

        jtxtDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIRECCION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 140, 60));

        jtxtCiudad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtCiudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CIUDAD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 140, 60));

        jtxtTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TELEFONO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 190, 60));

        jtxtCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CORREO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 180, 60));

        jbtnEliminarProveedor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar competencia.png"))); // NOI18N
        jbtnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 130, 60));

        jtxtPais.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtPais.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtPais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PAIS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 60));

        jbtnRegistrarProveedor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnRegistrarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nueva competencia.png"))); // NOI18N
        jbtnRegistrarProveedor.setText("REGISTRAR");
        jbtnRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnRegistrarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 260, 60));

        jbtnBuscarProveedor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnBuscarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar competencias.png"))); // NOI18N
        jbtnBuscarProveedor.setText("BUSCAR");
        jbtnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnBuscarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 260, 60));

        jtblDatosDeLosProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblDatosDeLosProveedores);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 317, 760, 280));

        jtxtWeb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtWeb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtWeb.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SITIO WEB", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 170, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logo.png"))); // NOI18N
        jLabel7.setText("jLabel4");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 160, 90));

        jbtnModificarProveedor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnModificarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modificar cliente.png"))); // NOI18N
        jbtnModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnModificarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 120, 60));

        jtxtRUCProveedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtRUCProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtRUCProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RUC", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtRUCProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void LimpiarEntradas() {

        jtxtRUCProveedor.setText("");
        jtxtNombreProveedor.setText("");
        jtxtDireccion.setText("");
        jtxtCiudad.setText("");
        jtxtTelefono.setText("");
        jtxtCorreo.setText("");
        jtxtWeb.setText("");
        jtxtRUCProveedor.requestFocus();

    }

    //modificado
    private void jbtnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarProveedorActionPerformed

        String ruc = jtxtRUCProveedor.getText();

        if (ruc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el RUC del proveedor que desea eliminar.");
            return;
        }

        int rowIndex = -1;

        for (int i = 0; i < PROVEEDORES.getRowCount(); i++) {
            if (PROVEEDORES.getValueAt(i, 1).equals(ruc)) {
                rowIndex = i;
            }
        }

        boolean eliminado = controladorProvedor.eliminar(ruc);

        if (eliminado) {
            if (rowIndex != -1) {
                PROVEEDORES.removeRow(rowIndex);
            }
            JOptionPane.showMessageDialog(null, "Proveedor eliminado correctamente");
            LimpiarEntradas();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar al proveedor");
        }

    }//GEN-LAST:event_jbtnEliminarProveedorActionPerformed

    //metodo modificado
    private void jbtnRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarProveedorActionPerformed

        String rucProveedor = jtxtRUCProveedor.getText();
        String nombre = jtxtNombreProveedor.getText();
        String direccion = jtxtDireccion.getText();
        String ciudad = jtxtCiudad.getText();
        String pais = jtxtPais.getText();
        String telefonoStr = jtxtTelefono.getText();
        String correo = jtxtCorreo.getText();
        String web = jtxtWeb.getText();

        if (rucProveedor.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || ciudad.isEmpty()
                || pais.isEmpty() || telefonoStr.isEmpty() || correo.isEmpty() || web.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios. Por favor, llene todos los campos.");
            return;
        }

        int telefono = 0;

        if (!telefonoStr.isEmpty()) {
            try {
                telefono = Integer.parseInt(telefonoStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido para el teléfono");
                return;
            }
        }

        boolean registrado = controladorProvedor.registrar(rucProveedor, nombre, direccion, ciudad, pais, telefono, correo, web);
        if (registrado) {
            JOptionPane.showMessageDialog(null, "Proveedor registrado correctamente");

            // Añadir fila a la tabla
            Object[] fila = {PROVEEDORES.getRowCount() + 1, rucProveedor, nombre, direccion, ciudad, pais, telefono, correo, web};
            PROVEEDORES.addRow(fila);

            LimpiarEntradas();
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar al Proveedor");
        }

    }//GEN-LAST:event_jbtnRegistrarProveedorActionPerformed

    
    //metodo modificado
    private void jbtnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarProveedorActionPerformed

        String ruc = jtxtRUCProveedor.getText();

        if (ruc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el RUC del proveedor que desea buscar.");
            return;
        }

        proveedor = controladorProvedor.buscar(ruc);

        if (proveedor != null) {

            JOptionPane.showMessageDialog(null, "Proveedor encontrado: " + proveedor.getNombre());

            jtxtRUCProveedor.setText(proveedor.getRucProveedor());
            jtxtNombreProveedor.setText(proveedor.getNombre());
            jtxtDireccion.setText(proveedor.getDireccion());
            jtxtCiudad.setText(proveedor.getCiudad());
            jtxtPais.setText(proveedor.getPais());
            jtxtTelefono.setText("" + proveedor.getTelefono());
            jtxtCorreo.setText(proveedor.getCorreo());
            jtxtWeb.setText(proveedor.getSitioWeb());

        } else {

            JOptionPane.showMessageDialog(null, "Proveedor no encontrado");

        }

    }//GEN-LAST:event_jbtnBuscarProveedorActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed

        new frm_VentanaPrincipal().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnRegresarActionPerformed

    private void jbtnReporteCompetenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReporteCompetenciaActionPerformed

        try {
            new frm_Proveedores().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frm_RegistroDelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);

    }//GEN-LAST:event_jbtnReporteCompetenciaActionPerformed

    //modificado
    private void jbtnModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarProveedorActionPerformed

        String rucProveedor = jtxtRUCProveedor.getText();
        String nombre = jtxtNombreProveedor.getText();
        String direccion = jtxtDireccion.getText();
        String ciudad = jtxtCiudad.getText();
        String pais = jtxtPais.getText();
        String telefonoStr = jtxtTelefono.getText();
        String correo = jtxtCorreo.getText();
        String web = jtxtWeb.getText();

        if (rucProveedor.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || ciudad.isEmpty()
                || pais.isEmpty() || telefonoStr.isEmpty() || correo.isEmpty() || web.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios. Por favor, llene todos los campos.");
            return;
        }

        int telefono = 0;

        if (!telefonoStr.isEmpty()) {
            try {
                telefono = Integer.parseInt(telefonoStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido para el teléfono");
                return;
            }
        }

        boolean actualizado = controladorProvedor.actualizar(rucProveedor, nombre, direccion, ciudad, pais, telefono, correo, web);

        if (actualizado) {
            JOptionPane.showMessageDialog(null, "Proveedor actualizado correctamente");

            // Busca el índice de la fila que contiene el proveedor actualizado
            int rowIndex = -1;
            for (int i = 0; i < PROVEEDORES.getRowCount(); i++) {
                if (PROVEEDORES.getValueAt(i, 0).equals(rucProveedor)) {
                    rowIndex = i;
                }
            }

            // Actualiza la fila en la tabla
            if (rowIndex != -1) {
                PROVEEDORES.setValueAt(rucProveedor, rowIndex, 1);
                PROVEEDORES.setValueAt(nombre, rowIndex, 2);
                PROVEEDORES.setValueAt(direccion, rowIndex, 3);
                PROVEEDORES.setValueAt(ciudad, rowIndex, 4);
                PROVEEDORES.setValueAt(pais, rowIndex, 5);
                PROVEEDORES.setValueAt(telefono, rowIndex, 6);
                PROVEEDORES.setValueAt(correo, rowIndex, 7);
                PROVEEDORES.setValueAt(web, rowIndex, 8);
            }

            LimpiarEntradas();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar al Proveedor");
        }

    }//GEN-LAST:event_jbtnModificarProveedorActionPerformed

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
            java.util.logging.Logger.getLogger(frm_RegistroDelProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_RegistroDelProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_RegistroDelProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_RegistroDelProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new frm_RegistroDelProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBuscarProveedor;
    private javax.swing.JButton jbtnEliminarProveedor;
    public javax.swing.JButton jbtnModificarProveedor;
    private javax.swing.JButton jbtnRegistrarProveedor;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JButton jbtnReporteCompetencia;
    private javax.swing.JTable jtblDatosDeLosProveedores;
    private javax.swing.JTextField jtxtCiudad;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JTextField jtxtNombreProveedor;
    private javax.swing.JTextField jtxtPais;
    private javax.swing.JTextField jtxtRUCProveedor;
    private javax.swing.JTextField jtxtTelefono;
    private javax.swing.JTextField jtxtWeb;
    // End of variables declaration//GEN-END:variables
}
