package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Proveedor {

    private String rucProveedor;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String pais;
    private int telefono;
    private String correo;
    private String sitioWeb;

    public Proveedor(String rucProveedor, String nombre, String direccion, String ciudad, String pais, int telefono, String correo, String sitioWeb) {
        this.rucProveedor = rucProveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.telefono = telefono;
        this.correo = correo;
        this.sitioWeb = sitioWeb;
    }

    public Proveedor() {
    }

    
    public String getRucProveedor() {
        return rucProveedor;
    }

    public void setRucProveedor(String rucProveedor) {
        this.rucProveedor = rucProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public boolean Registrar() throws SQLException {

        PreparedStatement ps = null;
        Connection con = Conexion.getInstance().getCon();

        String sql = "{CALL INSERTAR_PROVEEDOR(?, ?, ?, ?, ?, ?, ?, ?)}";

        try {

            ps = con.prepareCall(sql);

            ps.setString(1, getRucProveedor());
            ps.setString(2, getNombre());
            ps.setString(3, getDireccion());
            ps.setString(4, getCiudad());
            ps.setString(5, getPais());
            ps.setInt(6, getTelefono());
            ps.setString(7, getCorreo());
            ps.setString(8, getSitioWeb());

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

    public boolean Actualizar() throws SQLException {

        PreparedStatement ps = null;
        Connection con = Conexion.getInstance().getCon();


        String sql = "{CALL ACTUALIZAR_PROVEEDOR(?, ?, ?, ?, ?, ?, ?, ?)}";

        try {

            ps = con.prepareCall(sql);

            ps.setString(1, getRucProveedor());
            ps.setString(2, getNombre());
            ps.setString(3, getDireccion());
            ps.setString(4, getCiudad());
            ps.setString(5, getPais());
            ps.setInt(6, getTelefono());
            ps.setString(7, getCorreo());
            ps.setString(8, getSitioWeb());

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

    public boolean Eliminar(String RUC) throws SQLException {

        PreparedStatement ps = null;
        Connection con = Conexion.getInstance().getCon();

        String sql = "{CALL ELIMINAR_PROVEEDOR(?)}";

        try {
            
            ps = con.prepareCall(sql);
            ps.setString(1, RUC);

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

    public Proveedor Buscar(String RUC) throws SQLException {

        PreparedStatement ps = null;
        Connection con = Conexion.getInstance().getCon();

        String sql = "{CALL BUSCAR_PROVEEDOR(?)}";

        ResultSet rs = null;
        Proveedor proveedor = null;

        try {

            ps = con.prepareCall(sql);

            ps.setString(1, RUC);

            rs = ps.executeQuery();

            if (rs.next()) {
                String ruc = rs.getString("RUC");
                String nombre = rs.getString("NOMBRE_EMPRESA");
                String direccion = rs.getString("DIRECCION");
                String ciudad = rs.getString("CIUDAD");
                String pais = rs.getString("PAIS");
                int telefono = rs.getInt("TELEFONO");
                String correo = rs.getString("CORREO");
                String sitioWeb = rs.getString("PAGINA_WEB");

                proveedor = new Proveedor(ruc, nombre, direccion, ciudad, pais, telefono, correo, sitioWeb);
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

        return proveedor;

    }


}