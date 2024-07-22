package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Productos {

    private String codProducto;
    private String nombre;
    private String descripcion;
    private String categoria;
    private double precioVenta;
    private String unidadMedida;
    private int stock;
    private String serie;
    private String marca;
    private Date fechaAdquisicion;
    private String ubicacion;
    private String proveedor;

    public Productos(String codProducto, String nombre, String descripcion, String categoria, double precioVenta, String unidadMedida, int stock, String serie, String marca, Date fechaAdquisicion, String ubicacion, String proveedor) {
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
        this.stock = stock;
        this.serie = serie;
        this.marca = marca;
        this.fechaAdquisicion = fechaAdquisicion;
        this.ubicacion = ubicacion;
        this.proveedor = proveedor;
    }

    public Productos() {
    }

    
    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public boolean Registrar() throws SQLException {

        PreparedStatement ps = null;
        Connection con = Conexion.getInstance().getCon();

        String sql = "{CALL INSERTAR_PRODUCTOS(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";

        try {

            ps = con.prepareCall(sql);

            ps.setString(1, getCodProducto());
            ps.setString(2, getNombre());
            ps.setString(3, getDescripcion());
            ps.setString(4, getCategoria());
            ps.setDouble(5, getPrecioVenta());
            ps.setString(6, getUnidadMedida());
            ps.setInt(7, getStock());
            ps.setString(8, getSerie());
            ps.setString(9, getMarca());
            ps.setDate(10, new java.sql.Date(getFechaAdquisicion().getTime()));
            ps.setString(11, getUbicacion());
            ps.setString(12, getProveedor());

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
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

    }

    public boolean Actualizar( ) throws SQLException {

        PreparedStatement ps = null;
        Connection con = Conexion.getInstance().getCon();


        String sql = "{CALL ACTUALIZAR_PRODUCTO(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";

        try {

            ps = con.prepareCall(sql);

            ps.setString(1, getCodProducto());
            ps.setString(2, getNombre());
            ps.setString(3, getDescripcion());
            ps.setString(4, getCategoria());
            ps.setDouble(5, getPrecioVenta());
            ps.setString(6, getUnidadMedida());
            ps.setInt(7, getStock());
            ps.setString(8, getSerie());
            ps.setString(9, getMarca());
            ps.setDate(10, new java.sql.Date(getFechaAdquisicion().getTime()));
            ps.setString(11, getUbicacion());
            ps.setString(12, getProveedor());


            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
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

    }

    public boolean Eliminar(String Cod_Producto) throws SQLException {

        PreparedStatement ps = null;
        Connection con = Conexion.getInstance().getCon();

        String sql = "{CALL ELIMINAR_PRODUCTO(?)}";

        try {

            ps = con.prepareCall(sql);
            ps.setString(1, Cod_Producto);

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
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

    }

    public Productos Buscar(String Cod_Producto) throws SQLException {

        PreparedStatement ps = null;
        Connection con = Conexion.getInstance().getCon();

        String sql = "{CALL BUSCAR_PRODUCTO(?)}";

        ResultSet rs = null;
        Productos productos = null;

        try {

            ps = con.prepareCall(sql);

            ps.setString(1, Cod_Producto);

            rs = ps.executeQuery();

            if (rs.next()) {
                String cod = rs.getString("COD_PRODUCTO");
                String nombre = rs.getString("NOMBRE");
                String descripcion = rs.getString("DESCRIPCION");
                String categoria = rs.getString("CATEGORIA");
                double precioVenta = rs.getDouble("PRECIO_VENTA");
                String unidadmedida = rs.getString("UNIDAD_MEDIDA");
                int stock = rs.getInt("STOCK");
                String serie = rs.getString("SERIE");
                String marca = rs.getString("MARCA");
                java.sql.Date fechaAdq = rs.getDate("FECHA_ADQUISICION");
                String ubicacion = rs.getString("UBICACION");
                String proveedor = rs.getString("PROVEEDOR");

                productos = new Productos(cod, nombre, descripcion, categoria, precioVenta, unidadmedida, stock, serie, marca, fechaAdq, ubicacion, proveedor);
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

        return productos;

    }

}
