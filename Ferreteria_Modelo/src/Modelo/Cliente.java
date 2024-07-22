package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Cliente {

    private String DNI_Cliente;
    private String NombresAp;
    private String Distrito;
    private int Telefono;
    private String Correo;
    private Date Fecha;

    public Cliente(String DNI_Cliente, String NombresAp, String Distrito, int Telefono, String Correo, Date Fecha) {
        this.DNI_Cliente = DNI_Cliente;
        this.NombresAp = NombresAp;
        this.Distrito = Distrito;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Fecha = Fecha;
    }

    public Cliente() {
    }

    
    
    public String getDNI_Cliente() {
        return DNI_Cliente;
    }

    public void setDNI_Cliente(String DNI_Cliente) {
        this.DNI_Cliente = DNI_Cliente;
    }

    public String getNombresAp() {
        return NombresAp;
    }

    public void setNombresAp(String NombresAp) {
        this.NombresAp = NombresAp;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public boolean Registrar() throws SQLException {

        PreparedStatement ps = null;
        String sql = "{CALL INSERTAR_CLIENTE(?, ?, ?, ?, ?, ?)}";
        Connection con = Conexion.getInstance().getCon();
        try {

            ps = con.prepareCall(sql);

            ps.setString(1, getDNI_Cliente());
            ps.setString(2, getNombresAp());
            ps.setString(3, getDistrito());

            int telefonoValue = getTelefono() != 0 ? getTelefono() : 0;
            ps.setInt(4, telefonoValue);

            if ("".equals(getCorreo())) {
                ps.setString(5, "NO REGISTRA");
            } else {
                ps.setString(5, getCorreo());
            }

            ps.setDate(6, new java.sql.Date(getFecha().getTime()));

            ps.execute();

            return true;

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

        String sql = "{CALL ACTUALIZAR_CLIENTE(?, ?, ?, ?, ?, ?)}";

        try {

            ps = con.prepareCall(sql);

            ps.setString(1, getDNI_Cliente());
            ps.setString(2, getNombresAp());
            ps.setString(3, getDistrito());

            int telefonoValue = getTelefono() != 0 ? getTelefono() : 0;
            ps.setInt(4, telefonoValue);

            if ("".equals(getCorreo())) {
                ps.setString(5, "NO REGISTRA");
            } else {
                ps.setString(5, getCorreo());
            }

            ps.setDate(6, new java.sql.Date(getFecha().getTime()));

            ps.execute();

            return true;

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

    public boolean Eliminar(String DNI_Cliente) throws SQLException {

        PreparedStatement ps = null;
        Connection con = Conexion.getInstance().getCon();
        String sql = "{CALL ELIMINAR_CLIENTE(?)}";

        try {
            ps = con.prepareCall(sql);
            ps.setString(1, DNI_Cliente);

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

    public Cliente Buscar(String DNI_Cliente) throws SQLException {

        PreparedStatement ps = null;
        Connection con = Conexion.getInstance().getCon();

        String sql = "{CALL BUSCAR_CLIENTE(?)}";

        ResultSet rs = null;
        Cliente cliente = null;

        try {
            ps = con.prepareCall(sql);

            ps.setString(1, DNI_Cliente);

            rs = ps.executeQuery();

            if (rs.next()) {
                String dni = rs.getString("DNI");
                String nombresCompletos = rs.getString("NOMBRES_COMPLETOS");
                String distrito = rs.getString("DISTRITO");
                int telefono = rs.getInt("TELEFONO");
                String correo = rs.getString("CORREO");
                java.sql.Date fecha = rs.getDate("FECHA");

                cliente = new Cliente(dni, nombresCompletos, distrito, telefono, correo, fecha);
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

        return cliente;
    }

}
