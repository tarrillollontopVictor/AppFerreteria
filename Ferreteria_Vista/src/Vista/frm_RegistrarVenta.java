package Vista;

import Controlador.ControladorCliente;
import Controlador.ControladorProducto;
import Modelo.Cliente;
import Modelo.Productos;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class frm_RegistrarVenta extends javax.swing.JFrame {

    Format RegistroFecha = new SimpleDateFormat("dd-MM-yyyy");
    String GeneradorF = RegistroFecha.format(new Date());

    //Declaracion del formato de la table
    DefaultTableModel PRODUCTOS;
    String[] cabecera = {"N°", "PRODUCTO", "P. UNITARIO", "CANTIDAD", "TOTAL"};
    String[][] data;

    Productos productos;
    ControladorProducto crud_productos = new ControladorProducto();
    Cliente cliente;
    ControladorCliente crud_cliente = new ControladorCliente();

    int num = 0;

    public frm_RegistrarVenta() {
        initComponents();

        this.setLocationRelativeTo(null); // centrar en pantalla
        this.setResizable(false);// bloquear el maximizar

        jtxtFecha.setText(GeneradorF);

        //Habilitando los encabezados de la tabla
        PRODUCTOS = new DefaultTableModel(data, cabecera);
        jtblProductosCliente.setModel(PRODUCTOS);

        TableColumn columna;
        columna = jtblProductosCliente.getColumnModel().getColumn(0);
        columna.setPreferredWidth(0);

    }

    public static String TotalPagar = "", Codigoaaa = "", Nombreaaa = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtxtNombreCliente = new javax.swing.JTextField();
        jbtnExiste = new javax.swing.JButton();
        jtxtCodigoCliente = new javax.swing.JTextField();
        jtxtCorreo = new javax.swing.JTextField();
        jtxtDireccion = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jbtnRegistrarCliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbtnRegistrarProducto = new javax.swing.JButton();
        jtxtValorProducto = new javax.swing.JTextField();
        jbtnAgregar = new javax.swing.JButton();
        jtxtFecha = new javax.swing.JTextField();
        jtxtCodProducto = new javax.swing.JTextField();
        jtxtProducto = new javax.swing.JTextField();
        jspCantidad = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblProductosCliente = new javax.swing.JTable();
        jbtnRecibo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jlblTotalPagar = new javax.swing.JLabel();
        jlblTotalPagar1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE VENTAS");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenid@ a \"Distribuidora & Luminarias Consa\"");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 610, 60));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRAR VENTA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 610, 80));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("@2023-2 by Grupo 3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 780, 20));

        jbtnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Regresar.png"))); // NOI18N
        jbtnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS PERSONALES DEL CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNombreCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtNombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtNombreCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 160, 60));

        jbtnExiste.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnExiste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cliente.png"))); // NOI18N
        jbtnExiste.setText("AGREGAR");
        jbtnExiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExisteActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnExiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 200, 60));

        jtxtCodigoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtCodigoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCodigoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CÓDIGO DEL CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 60));

        jtxtCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CORREO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 270, 60));

        jtxtDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DISTRITO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 240, 60));

        jtxtTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TELEFONO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 210, 60));

        jbtnRegistrarCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar cliente.png"))); // NOI18N
        jbtnRegistrarCliente.setText("REGISTRAR");
        jbtnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 210, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 760, 160));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VENTAS", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnRegistrarProducto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnRegistrarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar producto.png"))); // NOI18N
        jbtnRegistrarProducto.setText("REGISTRAR");
        jbtnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarProductoActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnRegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 300, 60));

        jtxtValorProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtValorProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtValorProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VALOR S/.", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.add(jtxtValorProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 150, 60));

        jbtnAgregar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Producto.png"))); // NOI18N
        jbtnAgregar.setText("AGREGAR");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 230, 60));

        jtxtFecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.add(jtxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 60));

        jtxtCodProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtCodProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCodProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.add(jtxtCodProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 60));

        jtxtProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.add(jtxtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 240, 60));

        jspCantidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jspCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.add(jspCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 140, 60));

        jtblProductosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblProductosCliente);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 510, 170));

        jbtnRecibo.setBackground(new java.awt.Color(153, 153, 153));
        jbtnRecibo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnRecibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Recibo.png"))); // NOI18N
        jbtnRecibo.setText("RECIBO");
        jbtnRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReciboActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnRecibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 220, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CANTIDAD: ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 100, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TOTAL A PAGAR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblTotalPagar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlblTotalPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTotalPagar.setText("0");
        jPanel4.add(jlblTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 150, 70));

        jlblTotalPagar1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlblTotalPagar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTotalPagar1.setText("S/.");
        jPanel4.add(jlblTotalPagar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 18, 50, 70));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 220, 100));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 760, 340));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logo.png"))); // NOI18N
        jLabel5.setText("jLabel4");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 160, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed

        new frm_VentanaPrincipal().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnRegresarActionPerformed

    private void jbtnReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReciboActionPerformed

        // Obtener el modelo de tabla y los datos de la tabla de origen
        DefaultTableModel modeloOrigen = (DefaultTableModel) jtblProductosCliente.getModel();
        int rowCount = modeloOrigen.getRowCount();
        int columnCount = modeloOrigen.getColumnCount();
        Object[][] datosOrigen = new Object[rowCount][columnCount];

        // Copiar los datos de la tabla de origen al arreglo de destino
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                datosOrigen[i][j] = modeloOrigen.getValueAt(i, j);
            }
        }

        TotalPagar = jlblTotalPagar.getText();
        Codigoaaa = jtxtCodigoCliente.getText();
        Nombreaaa = jtxtNombreCliente.getText();

        // Pasar los datos al formulario de destino (frmn)
        frm_ReciboParaElUsuario formularioDestino = new frm_ReciboParaElUsuario();
        formularioDestino.setDatosTabla(datosOrigen);
        formularioDestino.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnReciboActionPerformed

    private void jbtnExisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExisteActionPerformed

        String cod = jtxtCodigoCliente.getText();

        if (cod.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el DNI del Cliente que desea agregar");
            return;
        }

        cliente = crud_cliente.buscar(cod);

        if (cliente != null) {

            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.getNombresAp());

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            jtxtCodigoCliente.setText(cliente.getDNI_Cliente());
            jtxtNombreCliente.setText(cliente.getNombresAp());
            jtxtDireccion.setText(cliente.getDistrito());
            jtxtTelefono.setText("" + cliente.getTelefono());
            jtxtCorreo.setText("" + cliente.getCorreo());
            jtxtFecha.setText(dateFormat.format(cliente.getFecha()));

        } else {

            JOptionPane.showMessageDialog(null, "Cliente no encontrado");

        }

    }//GEN-LAST:event_jbtnExisteActionPerformed

    private void jbtnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarProductoActionPerformed

        String Cod = jtxtCodProducto.getText();
        String Nombre = jtxtProducto.getText();
        String Valor = jtxtValorProducto.getText();
        int Cant = (int) jspCantidad.getValue();
        String totalPagarText = jlblTotalPagar.getText();

        if (Cod != null && !Cod.isEmpty() && Nombre != null && !Nombre.isEmpty() && Valor != null && !Valor.isEmpty()) {

            num++;

            double total = Double.parseDouble(Valor) * Cant;

            double suma = Double.parseDouble(totalPagarText) + total;

            DecimalFormat df = new DecimalFormat("#####00.00");

            Object[] fila = {num, Nombre, Valor, Cant, "S/." + df.format(total)};

            PRODUCTOS.addRow(fila);

            jlblTotalPagar.setText(df.format(suma));

        } else {
            JOptionPane.showMessageDialog(null, "Verifique los campos del producto");
        }

    }//GEN-LAST:event_jbtnRegistrarProductoActionPerformed

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed

        String cod = jtxtCodProducto.getText();

        if (cod.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el Codigo del producto que desea buscar.");
            return;
        }

        productos = crud_productos.buscar(cod);

        if (productos != null) {

            JOptionPane.showMessageDialog(null, "Producto encontrado: " + productos.getNombre());

            jtxtCodProducto.setText(cod);
            jtxtProducto.setText(productos.getNombre());
            jtxtValorProducto.setText("" + productos.getPrecioVenta());

        } else {

            JOptionPane.showMessageDialog(null, "Producto no encontrado");

        }

    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jbtnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarClienteActionPerformed

        if (jtxtCodigoCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Codigo está vacío");
        } else if (jtxtNombreCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Nombres está vacío");
        } else if (jtxtDireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Distrito está vacío");
        } else {

            String cod = jtxtCodigoCliente.getText();
            String nom = jtxtNombreCliente.getText();
            String distrito = jtxtDireccion.getText();
            int tel = 0;
            String correo = jtxtCorreo.getText();
            String fechaTexto = GeneradorF;

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


            if (crud_cliente != null) {
                if (crud_cliente.registrar(cod, nom, distrito, tel, correo, fecha)) {
                    JOptionPane.showMessageDialog(null, "Cliente Registrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar el cliente");
                }
            }

        }

    }//GEN-LAST:event_jbtnRegistrarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(frm_RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_RegistrarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnExiste;
    private javax.swing.JButton jbtnRecibo;
    private javax.swing.JButton jbtnRegistrarCliente;
    private javax.swing.JButton jbtnRegistrarProducto;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JLabel jlblTotalPagar;
    private javax.swing.JLabel jlblTotalPagar1;
    private javax.swing.JSpinner jspCantidad;
    private javax.swing.JTable jtblProductosCliente;
    private javax.swing.JTextField jtxtCodProducto;
    private javax.swing.JTextField jtxtCodigoCliente;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JTextField jtxtFecha;
    private javax.swing.JTextField jtxtNombreCliente;
    private javax.swing.JTextField jtxtProducto;
    private javax.swing.JTextField jtxtTelefono;
    private javax.swing.JTextField jtxtValorProducto;
    // End of variables declaration//GEN-END:variables
}
