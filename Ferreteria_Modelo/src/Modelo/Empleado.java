package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Empleado {

    private String DNI_Empleado;
    private String nombres;
    private String apellidosP;
    private String apellidosM;
    private int edad;
    private String genero;
    private String distrito;
    private int telefono;
    private String correo;
    private Date fechaContrato;
    private double salario;
    private String departamento;
    private String cargo;

    public Empleado(String DNI_Empleado, String nombres, String apellidosP, String apellidosM, int edad, String genero, String distrito, int telefono, String correo, Date fechaContrato, double salario, String departamento, String cargo) {
        this.DNI_Empleado = DNI_Empleado;
        this.nombres = nombres;
        this.apellidosP = apellidosP;
        this.apellidosM = apellidosM;
        this.edad = edad;
        this.genero = genero;
        this.distrito = distrito;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaContrato = fechaContrato;
        this.salario = salario;
        this.departamento = departamento;
        this.cargo = cargo;
    }

    public Empleado() {
    }

    
    public String getDNI_Empleado() {
        return DNI_Empleado;
    }

    public void setDNI_Empleado(String DNI_Empleado) {
        this.DNI_Empleado = DNI_Empleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidosP() {
        return apellidosP;
    }

    public void setApellidosP(String apellidosP) {
        this.apellidosP = apellidosP;
    }

    public String getApellidosM() {
        return apellidosM;
    }

    public void setApellidosM(String apellidosM) {
        this.apellidosM = apellidosM;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
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

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean Registrar() throws SQLException {

        PreparedStatement ps = null;
        Connection con = Conexion.getInstance().getCon();

        String sql = "{CALL INSERTAR_EMPLEADO(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";

        try {

            ps = con.prepareCall(sql);

            ps.setString(1, getDNI_Empleado());
            ps.setString(2, getNombres());
            ps.setString(3, getApellidosP());
            ps.setString(4, getApellidosM());
            ps.setInt(5, getEdad());
            ps.setString(6, getGenero());
            ps.setString(7, getDistrito());
            ps.setInt(8, getTelefono());
            ps.setString(9, getCorreo());
            ps.setDate(10, new java.sql.Date(getFechaContrato().getTime()));
            ps.setDouble(11, getSalario());
            ps.setString(12, getDepartamento());
            ps.setString(13, getCargo());

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

        String sql = "{CALL ACTUALIZAR_EMPLEADO(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";

        try {

            ps = con.prepareCall(sql);

            ps.setString(1, getDNI_Empleado());
            ps.setString(2, getNombres());
            ps.setString(3, getApellidosP());
            ps.setString(4,getApellidosM());
            ps.setInt(5, getEdad());
            ps.setString(6, getGenero());
            ps.setString(7, getDistrito());
            ps.setInt(8, getTelefono());
            ps.setString(9, getCorreo());
            ps.setDate(10, new java.sql.Date(getFechaContrato().getTime()));
            ps.setDouble(11, getSalario());
            ps.setString(12, getDepartamento());
            ps.setString(13, getCargo());

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

    public boolean Eliminar(String DNI_Empleado) throws SQLException {

        PreparedStatement ps = null;
        Connection con = Conexion.getInstance().getCon();

        String sql = "{CALL ELIMINAR_EMPLEADO(?)}";

        try {
            ps = con.prepareCall(sql);
            ps.setString(1, DNI_Empleado);

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

    public Empleado Buscar(String DNI_Empleado) throws SQLException {

        PreparedStatement ps = null;
        Connection con = Conexion.getInstance().getCon();

        String sql = "{CALL BUSCAR_EMPLEADO(?)}";

        ResultSet rs = null;
        Empleado empleado = null;

        try {

            ps = con.prepareCall(sql);

            ps.setString(1, DNI_Empleado);

            rs = ps.executeQuery();

            if (rs.next()) {
                String dni = rs.getString("DNI_EMPLEADO");
                String nombre = rs.getString("NOMBRES");
                String apellidoPaterno = rs.getString("APELLIDO_PATERNO");
                String apellidoMaterno = rs.getString("APELLIDO_MATERNO");
                int edadEm = rs.getInt("EDAD");
                String generoEm = rs.getString("GENERO");
                String distritoEm = rs.getString("DISTRITO");
                int tel = rs.getInt("TELEFONO");
                String correoEm = rs.getString("CORREO");
                java.sql.Date fechContrato = rs.getDate("FECHA_CONTRATO");
                double salarioEm = rs.getDouble("SALARIO");
                String departamentoEm = rs.getString("DEPARTAMENTO");
                String cargoEm = rs.getString("CARGO");

                empleado = new Empleado(dni, nombre, apellidoPaterno, apellidoMaterno, edadEm, generoEm, distritoEm , tel, correoEm, fechContrato, salarioEm, departamentoEm, cargoEm);
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

        return empleado;

    }

}
