package Vista;

import Controlador.ControladorEmpleado;
import Modelo.Empleado;
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

public class frm_RegistroDeEmpleados extends javax.swing.JFrame {

    Format RegistroFecha = new SimpleDateFormat("dd-MM-yyyy");
    String GeneradorF = RegistroFecha.format(new Date());

    //Declaracion del formato de la table
    DefaultTableModel EMPLEADOS;
    String[] cabecera = {"N°", "DNI", "NOMBRE", "APELLIDO M", "APELLIDO P", "EDAD", "GENERO", "DISTRITO", "TELEFONO", "CORREO",
        "FECHA DE CONTRATACIÓN", "SALARIO", "DEPARTAMENTO", "CARGO"};
    String[][] data;

    Empleado empleado;
    ControladorEmpleado controladorEmpleado = new ControladorEmpleado();

    public frm_RegistroDeEmpleados() {
        initComponents();

        jtxtFechaDeContratacion.setText(GeneradorF);

        this.setResizable(false);// bloquear el maximizar
        this.setLocationRelativeTo(null);// poner pantalla centro

        //Habilitando los encabezados de la tabla
        EMPLEADOS = new DefaultTableModel(data, cabecera);
        jtblDatosDeLosClientes.setModel(EMPLEADOS);

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

        jbtnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtIdentificacion = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtDistrito = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jtxtCorreo = new javax.swing.JTextField();
        jbtnEliminarEmpleado = new javax.swing.JButton();
        jtxtFechaDeContratacion = new javax.swing.JTextField();
        jbtnRegistrarEmpleado = new javax.swing.JButton();
        jbtnBuscarEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatosDeLosClientes = new javax.swing.JTable();
        jtxtEdad = new javax.swing.JTextField();
        jtxtApellidosP = new javax.swing.JTextField();
        jtxtApellidosM = new javax.swing.JTextField();
        jcbxGenero = new javax.swing.JComboBox<>();
        jtxtSalario = new javax.swing.JTextField();
        jcbxDepartamento = new javax.swing.JComboBox<>();
        jcbxCargo = new javax.swing.JComboBox<>();
        jbtnReporteEmpleado = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jbtnModificarEmpleado = new javax.swing.JButton();

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

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bienvenid@ a \"Distribuidora & Luminarias Consa\"");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1030, 40));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REGISTRAR EMPLEADO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 860, 60));

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("@2023-2 by Grupo 3");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1270, 20));

        jtxtIdentificacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtIdentificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° DE IDENTIFICACIÓN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 60));

        jtxtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 260, 60));

        jtxtDistrito.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtDistrito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtDistrito.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DISTRITO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 230, 60));

        jtxtTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TELEFONO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 250, 60));

        jtxtCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CORREO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 300, 60));

        jbtnEliminarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnEliminarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar empleado.png"))); // NOI18N
        jbtnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnEliminarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 250, 130, 60));

        jtxtFechaDeContratacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtFechaDeContratacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtFechaDeContratacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA DE CONTRATACIÓN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtFechaDeContratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 220, 60));

        jbtnRegistrarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnRegistrarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo empleado.png"))); // NOI18N
        jbtnRegistrarEmpleado.setText("REGISTRAR");
        jbtnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnRegistrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, 260, 60));

        jbtnBuscarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnBuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar empleado.png"))); // NOI18N
        jbtnBuscarEmpleado.setText("BUSCAR");
        jbtnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 180, 260, 60));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 317, 1250, 280));

        jtxtEdad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EDAD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, 100, 60));

        jtxtApellidosP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtApellidosP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtApellidosP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APELLIDO PATERNO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtApellidosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 190, 60));

        jtxtApellidosM.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtApellidosM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtApellidosM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APELLIDO MATERNO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtApellidosM, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 190, 60));

        jcbxGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jcbxGenero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GENERO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jcbxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 170, 60));

        jtxtSalario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtSalario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtSalario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SALARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 230, 60));

        jcbxDepartamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estrategia_de_Mercado", "Cadena_de_Suministro", "Gestión_de_Productos" }));
        jcbxDepartamento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DEPARTAMENTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jcbxDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 250, 60));

        jcbxCargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jefe", "Ayudante", "Vendedor@", "Comprador@", "Aluxiliar_de_Almacen" }));
        jcbxCargo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CARGO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jcbxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 250, 60));

        jbtnReporteEmpleado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnReporteEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Abrir.png"))); // NOI18N
        jbtnReporteEmpleado.setText("REPORTE");
        jbtnReporteEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReporteEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnReporteEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logo.png"))); // NOI18N
        jLabel7.setText("jLabel4");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 160, 90));

        jbtnModificarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnModificarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modificar cliente.png"))); // NOI18N
        jbtnModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnModificarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, 120, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void LimpiarEntradas() {

        jtxtIdentificacion.setText("");
        jtxtNombre.setText("");
        jtxtApellidosM.setText("");
        jtxtApellidosP.setText("");
        jtxtEdad.setText("");
        jcbxGenero.setSelectedItem(0);
        jtxtDistrito.setText("");
        jtxtTelefono.setText("");
        jtxtCorreo.setText("");
        jtxtSalario.setText("");
        jcbxDepartamento.setSelectedItem(0);
        jcbxCargo.setSelectedItem(0);
        jtxtIdentificacion.requestFocus();

    }

    //Modificado
    private void jbtnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarEmpleadoActionPerformed

        String cod = jtxtIdentificacion.getText();
        
        if (cod.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el DNI del Empleado que desea eliminar.");
            return;
        }

        int rowIndex = -1;

        if (EMPLEADOS.getRowCount() != 0) {
            for (int i = 0; i < EMPLEADOS.getRowCount(); i++) {
                if (EMPLEADOS.getValueAt(i, 1).equals(cod)) {
                    rowIndex = i;
                }
            }
        }

        boolean eliminado = controladorEmpleado.eliminar(cod);

        if (eliminado) {
            if (rowIndex != -1) {
                EMPLEADOS.removeRow(rowIndex);
            }
            JOptionPane.showMessageDialog(null, "Empleado eliminado correctamente");
            LimpiarEntradas();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar al Empleado");
        }

        
    }//GEN-LAST:event_jbtnEliminarEmpleadoActionPerformed

    //Metodo modificado
    private void jbtnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarEmpleadoActionPerformed

        String dni = jtxtIdentificacion.getText();
        String nombres = jtxtNombre.getText();
        String apellidosP = jtxtApellidosP.getText();
        String apellidosM = jtxtApellidosM.getText();
        String edadStr = jtxtEdad.getText();
        String genero = (String) jcbxGenero.getSelectedItem();
        String distrito = jtxtDistrito.getText();
        String telefonoStr = jtxtTelefono.getText();
        String correo = jtxtCorreo.getText();
        String fechaContrato = jtxtFechaDeContratacion.getText();
        String salarioStr = jtxtSalario.getText();
        String departamento = (String) jcbxDepartamento.getSelectedItem();
        String cargo = (String) jcbxCargo.getSelectedItem();

        if (dni.isEmpty() || nombres.isEmpty() || apellidosP.isEmpty() || apellidosM.isEmpty()
                || edadStr.isEmpty() || genero.isEmpty() || distrito.isEmpty() || telefonoStr.isEmpty()
                || correo.isEmpty() || fechaContrato.isEmpty() || salarioStr.isEmpty()
                || departamento.isEmpty() || cargo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios. Por favor, llene todos los campos.");
            return;
        }

        int edad = Integer.parseInt(edadStr);
        double salario = Double.parseDouble(salarioStr);

        int tel = 0;

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
            fecha = dateFormat.parse(fechaContrato);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una fecha válida en el formato dd-MM-yyyy");
            return;
        }

        if (controladorEmpleado != null) {
            if (controladorEmpleado.registrar(dni, nombres, apellidosP, apellidosM, edad, genero, distrito, tel, correo, fecha, salario, departamento, cargo)) {
                JOptionPane.showMessageDialog(null, "Empleado Registrado");

                Object[] fila = {EMPLEADOS.getRowCount() + 1, dni, nombres, apellidosP, apellidosM, edad, genero, distrito, tel, correo, fechaContrato, salario, departamento, cargo};
                EMPLEADOS.addRow(fila);

                LimpiarEntradas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar al Empleado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El objeto ControladorEmpleado no ha sido inicializado");
        }

    }//GEN-LAST:event_jbtnRegistrarEmpleadoActionPerformed

    //Modificado
    private void jbtnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarEmpleadoActionPerformed

        String dniBuscar = jtxtIdentificacion.getText();
        
        if (dniBuscar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el DNI del Empleado que desea buscar.");
            return;
        }

        empleado = controladorEmpleado.buscar(dniBuscar);

        if (empleado != null) {

            JOptionPane.showMessageDialog(null, "Empleado encontrado: " + empleado.getNombres());

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            jtxtIdentificacion.setText(empleado.getDNI_Empleado());
            jtxtNombre.setText(empleado.getNombres());
            jtxtApellidosP.setText(empleado.getApellidosP());
            jtxtApellidosM.setText(empleado.getApellidosM());
            jtxtEdad.setText(String.valueOf(empleado.getEdad()));
            jcbxGenero.setSelectedItem(empleado.getGenero());
            jtxtDistrito.setText(empleado.getDistrito());
            jtxtTelefono.setText(String.valueOf(empleado.getTelefono()));
            jtxtCorreo.setText(empleado.getCorreo());
            jtxtFechaDeContratacion.setText(dateFormat.format(empleado.getFechaContrato()));
            jtxtSalario.setText("" + empleado.getSalario());
            jcbxDepartamento.setSelectedItem(empleado.getDepartamento());
            jcbxCargo.setSelectedItem(empleado.getCargo());

        } else {

            JOptionPane.showMessageDialog(null, "Empleado no encontrado");

        }

    }//GEN-LAST:event_jbtnBuscarEmpleadoActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed

        new frm_VentanaPrincipal().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnRegresarActionPerformed

    private void jbtnReporteEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReporteEmpleadoActionPerformed

        try {
            new frm_Empleados().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frm_RegistroDeEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);

    }//GEN-LAST:event_jbtnReporteEmpleadoActionPerformed

    //Modificado
    private void jbtnModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarEmpleadoActionPerformed

        String dni = jtxtIdentificacion.getText();
        String nombres = jtxtNombre.getText();
        String apellidosP = jtxtApellidosP.getText();
        String apellidosM = jtxtApellidosM.getText();
        String edadStr = jtxtEdad.getText();
        String genero = (String) jcbxGenero.getSelectedItem();
        String distrito = jtxtDistrito.getText();
        String telefonoStr = jtxtTelefono.getText();
        String correo = jtxtCorreo.getText();
        String fechaContrato = jtxtFechaDeContratacion.getText();
        String salarioStr = jtxtSalario.getText();
        String departamento = (String) jcbxDepartamento.getSelectedItem();
        String cargo = (String) jcbxCargo.getSelectedItem();

        if (dni.isEmpty() || nombres.isEmpty() || apellidosP.isEmpty() || apellidosM.isEmpty()
                || edadStr.isEmpty() || genero.isEmpty() || distrito.isEmpty() || telefonoStr.isEmpty()
                || correo.isEmpty() || fechaContrato.isEmpty() || salarioStr.isEmpty()
                || departamento.isEmpty() || cargo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios. Por favor, llene todos los campos.");
            return;
        }

        int edad = Integer.parseInt(edadStr);
        double salario = Double.parseDouble(salarioStr);

        int tel = 0;

        if (!jtxtTelefono.getText().isEmpty()) {
            try {
                tel = Integer.parseInt(jtxtTelefono.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido para el teléfono");
                return;
            }
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date fecha = dateFormat.parse(fechaContrato);

            boolean actualizado = controladorEmpleado.actualizar(dni, nombres, apellidosP, apellidosM, edad, genero, distrito, tel, correo, fecha, salario, departamento, cargo);

            if (actualizado) {
                JOptionPane.showMessageDialog(null, "Empleado actualizado correctamente");

                // Busca el índice de la fila que contiene el cliente actualizado
                int rowIndex = -1;
                for (int i = 0; i < EMPLEADOS.getRowCount(); i++) {
                    if (EMPLEADOS.getValueAt(i, 1).equals(dni)) {
                        rowIndex = i;
                    }
                }

                // Actualiza la fila en la tabla
                if (rowIndex != -1) {
                    EMPLEADOS.setValueAt(dni, rowIndex, 1);
                    EMPLEADOS.setValueAt(nombres, rowIndex, 2);
                    EMPLEADOS.setValueAt(apellidosP, rowIndex, 3);
                    EMPLEADOS.setValueAt(apellidosM, rowIndex, 4);
                    EMPLEADOS.setValueAt(edad, rowIndex, 5);
                    EMPLEADOS.setValueAt(genero, rowIndex, 6);
                    EMPLEADOS.setValueAt(distrito, rowIndex, 7);
                    EMPLEADOS.setValueAt(tel, rowIndex, 8);
                    EMPLEADOS.setValueAt(correo, rowIndex, 9);
                    EMPLEADOS.setValueAt(fecha, rowIndex, 10);
                    EMPLEADOS.setValueAt(salario, rowIndex, 11);
                    EMPLEADOS.setValueAt(departamento, rowIndex, 12);
                    EMPLEADOS.setValueAt(cargo, rowIndex, 13);
                }

                LimpiarEntradas();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar al Empleado");
            }

        } catch (ParseException e) {
            System.err.println(e);
        }

    }//GEN-LAST:event_jbtnModificarEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(frm_RegistroDeEmpleados.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_RegistroDeEmpleados.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_RegistroDeEmpleados.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_RegistroDeEmpleados.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_RegistroDeEmpleados().setVisible(true);
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
    private javax.swing.JButton jbtnBuscarEmpleado;
    private javax.swing.JButton jbtnEliminarEmpleado;
    public javax.swing.JButton jbtnModificarEmpleado;
    private javax.swing.JButton jbtnRegistrarEmpleado;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JButton jbtnReporteEmpleado;
    private javax.swing.JComboBox<String> jcbxCargo;
    private javax.swing.JComboBox<String> jcbxDepartamento;
    private javax.swing.JComboBox<String> jcbxGenero;
    private javax.swing.JTable jtblDatosDeLosClientes;
    private javax.swing.JTextField jtxtApellidosM;
    private javax.swing.JTextField jtxtApellidosP;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtDistrito;
    private javax.swing.JTextField jtxtEdad;
    private javax.swing.JTextField jtxtFechaDeContratacion;
    private javax.swing.JTextField jtxtIdentificacion;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtSalario;
    private javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}
