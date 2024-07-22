package Vista;

import Controlador.ControladorProducto;
import Modelo.Productos;
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

public class frm_RegistroDeProductos extends javax.swing.JFrame {

    Format RegistroFecha = new SimpleDateFormat("dd-MM-yyyy");
    String GeneradorF = RegistroFecha.format(new Date());

    //Declaracion del formato de la table
    DefaultTableModel PRODUCTOS;
    String[] cabecera = {"N°", "CODIGO", "NOMBRE", "DESCRIPCION", "CATEGORIA", "PRECIO VENTA", "STOCK DISPONIBLE", "PROVEEDOR",
        "FECHA DE ADQUISICION", "UBICACION ALMACEN", "MARCA", "NUMERO SERIE", "UNIDAD MEDIDA"};
    String[][] data;

    Productos productos;
    ControladorProducto controladorProducto = new ControladorProducto();

    public frm_RegistroDeProductos() {
        initComponents();

        jtxtFechaDeAdquisicion.setText(GeneradorF);

        this.setResizable(false);// bloquear el maximizar
        this.setLocationRelativeTo(null);// poner pantalla centro

        //Habilitando los encabezados de la tabla
        PRODUCTOS = new DefaultTableModel(data, cabecera);
        jtblDatosDeLosClientes.setModel(PRODUCTOS);

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
        jtxtCodigo = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtStock = new javax.swing.JTextField();
        jtxtNuemeroSerie = new javax.swing.JTextField();
        jbtnEliminarProducto = new javax.swing.JButton();
        jtxtFechaDeAdquisicion = new javax.swing.JTextField();
        jbtnRegistrarProducto = new javax.swing.JButton();
        jbtnBuscarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatosDeLosClientes = new javax.swing.JTable();
        jtxtUbicacionAlmancen = new javax.swing.JTextField();
        jtxtDescripcion = new javax.swing.JTextField();
        jtxtCategoria = new javax.swing.JTextField();
        jcbxUnidadMedida = new javax.swing.JComboBox<>();
        jtxtPRecioDeVenta = new javax.swing.JTextField();
        jcbxMarca = new javax.swing.JComboBox<>();
        jcbxProveedor = new javax.swing.JComboBox<>();
        jbtnReporteProductos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jbtnModificarProducto = new javax.swing.JButton();

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
        jLabel5.setText("REGISTRAR PRODUCTO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 860, 60));

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("@2023-2 by Grupo 3");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1270, 20));

        jtxtCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CODIGO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, 60));

        jtxtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 240, 60));

        jtxtStock.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtStock.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "STOCK DISPONIBLE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 160, 60));

        jtxtNuemeroSerie.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtNuemeroSerie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtNuemeroSerie.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUMERO SERIE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtNuemeroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 330, 60));

        jbtnEliminarProducto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar producto.png"))); // NOI18N
        jbtnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarProductoActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 250, 120, 60));

        jtxtFechaDeAdquisicion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtFechaDeAdquisicion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtFechaDeAdquisicion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA DE ADQUISICION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtFechaDeAdquisicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 220, 60));

        jbtnRegistrarProducto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnRegistrarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo producto.png"))); // NOI18N
        jbtnRegistrarProducto.setText("REGISTRAR");
        jbtnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarProductoActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnRegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, 260, 60));

        jbtnBuscarProducto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar prosucto.png"))); // NOI18N
        jbtnBuscarProducto.setText("BUSCAR");
        jbtnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarProductoActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 180, 260, 60));

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

        jtxtUbicacionAlmancen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtUbicacionAlmancen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtUbicacionAlmancen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UBICACION ALMACEN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtUbicacionAlmancen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 340, 60));

        jtxtDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCRIPCION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 190, 60));

        jtxtCategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CATEGORIA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 190, 60));

        jcbxUnidadMedida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbxUnidadMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Piezas", "Metros", "Litros", "Kilogramos", "Pares", "Cajas", "Bolsas", "Rollos" }));
        jcbxUnidadMedida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UNIDAD MEDIDA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jcbxUnidadMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 190, 60));

        jtxtPRecioDeVenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtxtPRecioDeVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtPRecioDeVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRECIO DE VENTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jtxtPRecioDeVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 180, 60));

        jcbxMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stanley", "Black & Decker", "Bosch", "DeWalt", "Makita", "Hilti", "Craftsman", "Milwaukee", "Irwin", "3M", "Rust-Oleum", "Dremel", "Ridgid", "Sika", "Karcher", "Weber", "PPG", "Benjamin Moore", "Graco", "Loctite" }));
        jcbxMarca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MARCA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jcbxMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 270, 60));

        jcbxProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ferretería XYZ", "Distribuidora ABC", "Proveedor123", "Suministros Industriales", "Ferretería Industrial", "Ferretería Alfa", "Proveedora Beta", "Herramientas y Materiales S.A.", "Distribuidora Ferretera", "Ferretería Eléctrica", "Proveedor de Construcción", "Ferretería Mega", "Suministros Ferreteros", "Ferretería del Sur", "Proveedor de Materiales", "Ferretería Express", "Proveedora de Herramientas", "Ferretería Central", "Distribuidora Ferretera Internacional" }));
        jcbxProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROVEEDOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(jcbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 400, 60));

        jbtnReporteProductos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnReporteProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Abrir.png"))); // NOI18N
        jbtnReporteProductos.setText("REPORTE");
        jbtnReporteProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReporteProductosActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnReporteProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Logo.png"))); // NOI18N
        jLabel7.setText("jLabel4");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 160, 90));

        jbtnModificarProducto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnModificarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modificar cliente.png"))); // NOI18N
        jbtnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarProductoActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, 130, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void LimpiarEntradas() {

        jtxtCodigo.setText("");
        jtxtNombre.setText("");
        jtxtCategoria.setText("");
        jtxtDescripcion.setText("");
        jtxtUbicacionAlmancen.setText("");
        jcbxUnidadMedida.setSelectedItem(0);
        jtxtStock.setText("");
        jtxtNuemeroSerie.setText("");
        jtxtPRecioDeVenta.setText("");
        jcbxMarca.setSelectedItem(0);
        jcbxProveedor.setSelectedItem(0);
        jtxtCodigo.requestFocus();

    }

    //modificado
    private void jbtnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarProductoActionPerformed

        String cod = jtxtCodigo.getText();

        if (cod.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el Codigo del producto que desea eliminar.");
            return;
        }

        int rowIndex = -1;

        if (PRODUCTOS.getRowCount() != 0) {
            for (int i = 0; i < PRODUCTOS.getRowCount(); i++) {
                if (PRODUCTOS.getValueAt(i, 1).equals(cod)) {
                    rowIndex = i;
                }
            }
        }

        boolean eliminado = controladorProducto.eliminar(cod);

        if (eliminado) {
            if (rowIndex != -1) {
                PRODUCTOS.removeRow(rowIndex);
            }
            JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
            LimpiarEntradas();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar al Producto");
        }

    }//GEN-LAST:event_jbtnEliminarProductoActionPerformed

    //modificado
    private void jbtnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarProductoActionPerformed

        String codProducto = jtxtCodigo.getText();
        String nombre = jtxtNombre.getText();
        String categoria = jtxtCategoria.getText();
        String descripcion = jtxtDescripcion.getText();
        String ubicacionAlmacen = jtxtUbicacionAlmancen.getText();
        String unidadMedida = (String) jcbxUnidadMedida.getSelectedItem();
        String stockStr = jtxtStock.getText();
        String numeroSerie = jtxtNuemeroSerie.getText();
        String fechaAdquisicion = jtxtFechaDeAdquisicion.getText();  // Asegúrate de que sea una cadena con formato de fecha válido
        String precioVentaStr = jtxtPRecioDeVenta.getText();
        String marca = (String) jcbxMarca.getSelectedItem();
        String proveedor = (String) jcbxProveedor.getSelectedItem();

        if (codProducto.isEmpty() || nombre.isEmpty() || categoria.isEmpty() || descripcion.isEmpty()
                || ubicacionAlmacen.isEmpty() || unidadMedida.isEmpty() || stockStr.isEmpty()
                || numeroSerie.isEmpty() || fechaAdquisicion.isEmpty() || precioVentaStr.isEmpty()
                || marca.isEmpty() || proveedor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios. Por favor, llene todos los campos.");
            return;
        }

        int stock;
        double precioVenta;
        try {
            stock = Integer.parseInt(stockStr);
            precioVenta = Double.parseDouble(precioVentaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos para Stock y Precio de Venta.");
            return;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = null;

        try {
            fecha = dateFormat.parse(fechaAdquisicion);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una fecha válida en el formato dd-MM-yyyy");
            return;
        }


        if (controladorProducto != null) {
            if (controladorProducto.registrar(codProducto, nombre, descripcion, categoria, precioVenta, unidadMedida, stock, numeroSerie, marca, fecha, ubicacionAlmacen, proveedor)) {
                JOptionPane.showMessageDialog(null, "Producto Registrado");

                Object[] fila = {PRODUCTOS.getRowCount() + 1, codProducto, nombre, descripcion, categoria, precioVenta, stock, proveedor, fechaAdquisicion, ubicacionAlmacen, marca, numeroSerie, unidadMedida};
                PRODUCTOS.addRow(fila);

                LimpiarEntradas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar el Producto");
            }
        }

    }//GEN-LAST:event_jbtnRegistrarProductoActionPerformed

    private void jbtnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarProductoActionPerformed

        String cod = jtxtCodigo.getText();

        if (cod.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el Codigo del producto que desea buscar.");
            return;
        }

        productos = controladorProducto.buscar(cod);

        if (productos != null) {

            JOptionPane.showMessageDialog(null, "Producto encontrado: " + productos.getNombre());

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            jtxtCodigo.setText(productos.getCodProducto());
            jtxtNombre.setText(productos.getNombre());
            jtxtCategoria.setText(productos.getCategoria());
            jtxtDescripcion.setText(productos.getDescripcion());
            jtxtUbicacionAlmancen.setText(productos.getUbicacion());
            jcbxUnidadMedida.setSelectedItem(productos.getUnidadMedida());
            jtxtStock.setText(""+productos.getStock());
            jtxtFechaDeAdquisicion.setText(dateFormat.format(productos.getFechaAdquisicion()));
            jtxtNuemeroSerie.setText(productos.getSerie());
            jtxtPRecioDeVenta.setText(""+productos.getPrecioVenta());
            jcbxMarca.setSelectedItem(productos.getMarca());
            jcbxProveedor.setSelectedItem(productos.getProveedor());

        } else {

            JOptionPane.showMessageDialog(null, "Producto no encontrado");

        }

    }//GEN-LAST:event_jbtnBuscarProductoActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed

        new frm_VentanaPrincipal().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbtnRegresarActionPerformed

    private void jbtnReporteProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReporteProductosActionPerformed

        try {
            new frm_Productos().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frm_RegistroDeProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);

    }//GEN-LAST:event_jbtnReporteProductosActionPerformed

    private void jbtnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarProductoActionPerformed

        String codProducto = jtxtCodigo.getText();
        String nombre = jtxtNombre.getText();
        String categoria = jtxtCategoria.getText();
        String descripcion = jtxtDescripcion.getText();
        String ubicacionAlmacen = jtxtUbicacionAlmancen.getText();
        String unidadMedida = (String) jcbxUnidadMedida.getSelectedItem();
        String stockStr = jtxtStock.getText();
        String numeroSerie = jtxtNuemeroSerie.getText();
        String fechaAdquisicion = jtxtFechaDeAdquisicion.getText();  // Asegúrate de que sea una cadena con formato de fecha válido
        String precioVentaStr = jtxtPRecioDeVenta.getText();
        String marca = (String) jcbxMarca.getSelectedItem();
        String proveedor = (String) jcbxProveedor.getSelectedItem();

        if (codProducto.isEmpty() || nombre.isEmpty() || categoria.isEmpty() || descripcion.isEmpty()
                || ubicacionAlmacen.isEmpty() || unidadMedida.isEmpty() || stockStr.isEmpty()
                || numeroSerie.isEmpty() || fechaAdquisicion.isEmpty() || precioVentaStr.isEmpty()
                || marca.isEmpty() || proveedor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios. Por favor, llene todos los campos.");
            return;
        }

        int stock;
        double precioVenta;
        try {
            stock = Integer.parseInt(stockStr);
            precioVenta = Double.parseDouble(precioVentaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos para Stock y Precio de Venta.");
            return;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = null;

        try {
            fecha = dateFormat.parse(fechaAdquisicion);


            boolean actualizado = controladorProducto.actualizar(codProducto, nombre, descripcion, categoria, precioVenta, unidadMedida, stock, numeroSerie, marca, fecha, ubicacionAlmacen, proveedor);

            if (actualizado) {
                JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");

                // Busca el índice de la fila que contiene el cliente actualizado
                int rowIndex = -1;
                for (int i = 0; i < PRODUCTOS.getRowCount(); i++) {
                    if (PRODUCTOS.getValueAt(i, 1).equals(codProducto)) {
                        rowIndex = i;
                    }
                }

                // Actualiza la fila en la tabla
                if (rowIndex != -1) {
                    PRODUCTOS.setValueAt(codProducto, rowIndex, 1);
                    PRODUCTOS.setValueAt(nombre, rowIndex, 2);
                    PRODUCTOS.setValueAt(descripcion, rowIndex, 3);
                    PRODUCTOS.setValueAt(categoria, rowIndex, 4);
                    PRODUCTOS.setValueAt(precioVenta, rowIndex, 5);
                    PRODUCTOS.setValueAt(unidadMedida, rowIndex, 6);
                    PRODUCTOS.setValueAt(stock, rowIndex, 7);
                    PRODUCTOS.setValueAt(numeroSerie, rowIndex, 8);
                    PRODUCTOS.setValueAt(marca, rowIndex, 9);
                    PRODUCTOS.setValueAt(fechaAdquisicion, rowIndex, 10);
                    PRODUCTOS.setValueAt(ubicacionAlmacen, rowIndex, 11);
                    PRODUCTOS.setValueAt(proveedor, rowIndex, 12);
                }

                LimpiarEntradas();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar al Producto");
            }

        } catch (ParseException e) {
            System.err.println(e);
        }

    }//GEN-LAST:event_jbtnModificarProductoActionPerformed

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
            java.util.logging.Logger.getLogger(frm_RegistroDeProductos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_RegistroDeProductos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_RegistroDeProductos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_RegistroDeProductos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new frm_RegistroDeProductos().setVisible(true);
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
    private javax.swing.JButton jbtnBuscarProducto;
    private javax.swing.JButton jbtnEliminarProducto;
    private javax.swing.JButton jbtnModificarProducto;
    private javax.swing.JButton jbtnRegistrarProducto;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JButton jbtnReporteProductos;
    private javax.swing.JComboBox<String> jcbxMarca;
    private javax.swing.JComboBox<String> jcbxProveedor;
    private javax.swing.JComboBox<String> jcbxUnidadMedida;
    private javax.swing.JTable jtblDatosDeLosClientes;
    private javax.swing.JTextField jtxtCategoria;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtDescripcion;
    private javax.swing.JTextField jtxtFechaDeAdquisicion;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtNuemeroSerie;
    private javax.swing.JTextField jtxtPRecioDeVenta;
    private javax.swing.JTextField jtxtStock;
    private javax.swing.JTextField jtxtUbicacionAlmancen;
    // End of variables declaration//GEN-END:variables
}
