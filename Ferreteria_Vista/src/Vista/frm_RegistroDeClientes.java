package Vista;

import Controlador.ControladorCliente;
import Modelo.Cliente;
import java.sql.SQLException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class frm_RegistroDeClientes extends javax.swing.JFrame {

    Format RegistroFecha = new SimpleDateFormat("dd-MM-yyyy");
    String GeneradorF = RegistroFecha.format(new Date());

    //Declaracion del formato de la table
    DefaultTableModel CLIENTES;
    String[] cabecera = {"N°", "CODIGO", "NOMBRE", "DISTRITO", "TELEFONO", "CORREO", "FECHA DE REGISTRO"};
    String[][] data;


    ControladorCliente clienteControlador = new ControladorCliente();

    public frm_RegistroDeClientes() {
        initComponents();

        jtxtFecha.setText(GeneradorF);

        this.setResizable(false);// bloquear el maximizar
        this.setLocationRelativeTo(null);// poner pantalla centro

        //Habilitando los encabezados de la tabla
        CLIENTES = new DefaultTableModel(data, cabecera);
        jtblDatosDeLosClientes.setModel(CLIENTES);

        CambiarTamañoColumna();

    }

    void CambiarTamañoColumna() {
        TableColumn columna;
        columna = jtblDatosDeLosClientes.getColumnModel().getColumn(0);
        columna.setPreferredWidth(5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtCodigoCliente = new javax.swing.JTextField();
        jtxtNombreCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtDistrito = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jtxtCorreo = new javax.swing.JTextField();
        jbtnModificarCliente = new javax.swing.JButton();
        jtxtFecha = new javax.swing.JTextField();
        jbtnRegistrarCliente = new javax.swing.JButton();
        jbtnBuscarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatosDeLosClientes = new javax.swing.JTable();
        jbtnRegresar = new javax.swing.JButton();
        jbtnReporteCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jbtnEliminarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bienvenid@ a \"Distribuidora & Luminarias Consa\"");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 540, 40));

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("@2023-2 by Grupo 3");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 780, 20));

        jtxtCodigoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtCodigoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCodigoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CÓDIGO DEL CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 230, 60));

        jtxtNombreCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtNombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtNombreCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRES Y APELLIDOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 250, 60));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REGISTRAR CLIENTE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 370, 60));

        jtxtDistrito.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtDistrito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtDistrito.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DISTRITO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 230, 60));

        jtxtTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TELEFONO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 250, 60));

        jtxtCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CORREO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 270, 60));

        jbtnModificarCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modificar cliente.png"))); // NOI18N
        jbtnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 130, 60));

        jtxtFecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 210, 60));

        jbtnRegistrarCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo cliente.png"))); // NOI18N
        jbtnRegistrarCliente.setText("REGISTRAR");
        jbtnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 260, 60));

        jbtnBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar cliente.png"))); // NOI18N
        jbtnBuscarCliente.setText("BUSCAR");
        jbtnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 260, 60));

        jtblDatosDeLosClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblDatosDeLosClientes);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 317, 760, 280));

        jbtnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Regresar.png"))); // NOI18N
        jbtnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        jbtnReporteCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnReporteCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Abrir.png"))); // NOI18N
        jbtnReporteCliente.setText("REPORTE");
        jbtnReporteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReporteClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnReporteCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logo.png"))); // NOI18N
        jLabel7.setText("jLabel4");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 160, 90));

        jbtnEliminarCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar cliente.png"))); // NOI18N
        jbtnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 120, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void LimpiarEntradas() {

        jtxtCodigoCliente.setText("");
        jtxtNombreCliente.setText("");
        jtxtDistrito.setText("");
        jtxtTelefono.setText("");
        jtxtCorreo.setText("");
        jtxtCodigoCliente.requestFocus();

    }

    private void jbtnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarClienteActionPerformed

        if (jtxtCodigoCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Codigo está vacío");
        } else if (jtxtNombreCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Nombres está vacío");
        } else if (jtxtDistrito.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Distrito está vacío");
        } else {

            String cod = jtxtCodigoCliente.getText();
            String nom = jtxtNombreCliente.getText();
            String distrito = jtxtDistrito.getText();
            int tel = 0;
            String correo = jtxtCorreo.getText();
            String fechaTexto = jtxtFecha.getText();

            String telText = jtxtTelefono.getText();

            if (!telText.equals("")) {
                try {
                    tel = Integer.parseInt(telText);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido para el teléfono");
                    return;
                }
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            try {
                Date fecha = dateFormat.parse(fechaTexto);

                boolean actualizado = clienteControlador.actualizar(cod, nom, distrito, tel, correo, fecha); 

                if (actualizado) {
                    JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente");

                    // Busca el índice de la fila que contiene el cliente actualizado
                    int rowIndex = -1;
                    for (int i = 0; i < CLIENTES.getRowCount(); i++) {
                        if (CLIENTES.getValueAt(i, 1).equals(cod)) {
                            rowIndex = i;
                        }
                    }

                    System.out.println("Índice de la fila a actualizar: " + rowIndex);

                    // Actualiza la fila en la tabla
                    if (rowIndex != -1) {
                        CLIENTES.setValueAt(cod, rowIndex, 1);
                        CLIENTES.setValueAt(nom, rowIndex, 2);
                        CLIENTES.setValueAt(distrito, rowIndex, 3);
                        CLIENTES.setValueAt(tel, rowIndex, 4);
                        CLIENTES.setValueAt(correo, rowIndex, 5);
                        CLIENTES.setValueAt(fechaTexto, rowIndex, 6);
                    }

                    LimpiarEntradas();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar al Cliente");
                }

            } catch (ParseException e) {
                System.err.println(e);
            }

        }

    }//GEN-LAST:event_jbtnModificarClienteActionPerformed

    //JUNIOR EN ESTE METODO HICE UN LLAMADO AL CONTROLLER, NO TENIAS QUE CREAR SQL AQUI
    private void jbtnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarClienteActionPerformed

        if (jtxtCodigoCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Codigo está vacío");
        } else if (jtxtNombreCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Nombres está vacío");
        } else if (jtxtDistrito.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Distrito está vacío");
        } else {

            String cod = jtxtCodigoCliente.getText();
            String nom = jtxtNombreCliente.getText();
            String distrito = jtxtDistrito.getText();
            int tel = 0;
            String correo = jtxtCorreo.getText();
            String fechaTexto = jtxtFecha.getText();

            if (!jtxtTelefono.getText().isEmpty()) {
                try {
                    tel = Integer.parseInt(jtxtTelefono.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido para el teléfono");
                    return;
                }
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date fecha = null;

            try {
                fecha = dateFormat.parse(fechaTexto);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una fecha válida en el formato dd-MM-yyyy");
                return;
            }

            
                if (clienteControlador.registrar(cod, nom, distrito, tel, correo, fecha)){
                    JOptionPane.showMessageDialog(null, "Cliente Registrado");
                    if (correo.equals("")) {
                        correo = "NO REGISTRA";
                    }

                    Object[] fila = {CLIENTES.getRowCount() + 1, cod, nom, distrito, tel, correo, fecha};
                    CLIENTES.addRow(fila);

                    LimpiarEntradas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar el cliente");
                }
            

        }

    }//GEN-LAST:event_jbtnRegistrarClienteActionPerformed

    //AGREGUE LA VALIDACION CON EL CONTROLLER EN VEZ DE PONER LA CONSULTA SQL
    private void jbtnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarClienteActionPerformed

        String cod = jtxtCodigoCliente.getText();

        if (cod.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el DNI del Cliente que desea buscar.");
            return;
        }

        Cliente cliente = clienteControlador.buscar(cod);

        if (cliente != null) {

            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.getNombresAp());

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            jtxtCodigoCliente.setText(cliente.getDNI_Cliente());
            jtxtNombreCliente.setText(cliente.getNombresAp());
            jtxtDistrito.setText(cliente.getDistrito());
            jtxtTelefono.setText("" + cliente.getTelefono());
            jtxtCorreo.setText("" + cliente.getCorreo());
            jtxtFecha.setText(dateFormat.format(cliente.getFecha()));

        } else {

            JOptionPane.showMessageDialog(null, "Cliente no encontrado");

        }

    }//GEN-LAST:event_jbtnBuscarClienteActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed

        new frm_VentanaPrincipal().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnRegresarActionPerformed

    private void jbtnReporteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReporteClienteActionPerformed

        try {
            new frm_Clientes().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frm_RegistroDeClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);

    }//GEN-LAST:event_jbtnReporteClienteActionPerformed

    private void jbtnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarClienteActionPerformed

        String cod = jtxtCodigoCliente.getText();

        if (cod.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el DNI del Cliente que desea eliminar.");
            return;
        }

        int rowIndex = -1;

        if (CLIENTES.getRowCount() != 0) {
            for (int i = 0; i < CLIENTES.getRowCount(); i++) {
                if (CLIENTES.getValueAt(i, 1).equals(cod)) {
                    rowIndex = i;
                }
            }
        }

        boolean eliminado = clienteControlador.eliminar(cod);

        if (eliminado) {
            if (rowIndex != -1) {
                CLIENTES.removeRow(rowIndex);
            }
            JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
            LimpiarEntradas();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar al Cliente");
        }

    }//GEN-LAST:event_jbtnEliminarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(frm_RegistroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_RegistroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_RegistroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_RegistroDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new frm_RegistroDeClientes().setVisible(true);
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
    private javax.swing.JButton jbtnBuscarCliente;
    private javax.swing.JButton jbtnEliminarCliente;
    private javax.swing.JButton jbtnModificarCliente;
    private javax.swing.JButton jbtnRegistrarCliente;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JButton jbtnReporteCliente;
    private javax.swing.JTable jtblDatosDeLosClientes;
    private javax.swing.JTextField jtxtCodigoCliente;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtDistrito;
    private javax.swing.JTextField jtxtFecha;
    private javax.swing.JTextField jtxtNombreCliente;
    private javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}
