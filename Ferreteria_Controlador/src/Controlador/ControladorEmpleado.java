package Controlador;
import Modelo.Empleado;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladorEmpleado{
    Empleado em;
    public ControladorEmpleado() {
        this.em = new Empleado();
    }
    
    
    
    //Metodo de registrar correcto
    public boolean registrar(String dni, String nombres, String apellidosP, String apellidosM, int edad, String genero,String distrito, int tel, String correo, Date fecha, double salario, String departamento, String cargo){
        try {
            em.setDNI_Empleado(dni);
            em.setNombres(nombres);
            em.setApellidosP(apellidosP);
            em.setApellidosM(apellidosM);
            em.setEdad(edad);
            em.setGenero(genero);
            em.setDistrito(distrito);
            em.setTelefono(tel);
            em.setCorreo(correo);
            em.setFechaContrato(fecha);
            em.setSalario(salario);
            em.setDepartamento(departamento);
            em.setCargo(cargo);
            
            return em.Registrar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    //Metodo de actualizar correcto
    public boolean actualizar(String dni, String nombres, String apellidosP, String apellidosM, int edad, String genero,String distrito, int tel, String correo, Date fecha, double salario, String departamento, String cargo){
         try {
            em.setDNI_Empleado(dni);
            em.setNombres(nombres);
            em.setApellidosP(apellidosP);
            em.setApellidosM(apellidosM);
            em.setEdad(edad);
            em.setGenero(genero);
            em.setDistrito(distrito);
            em.setTelefono(tel);
            em.setCorreo(correo);
            em.setFechaContrato(fecha);
            em.setSalario(salario);
            em.setDepartamento(departamento);
            em.setCargo(cargo);
             return em.Actualizar();
         } catch (SQLException ex) {
             Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
        
    }
    
    //Metodo de Eliminar correcto
    public boolean eliminar(String dni){
        
        try {
            return em.Eliminar(dni);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Metodo de Buscar correcto   
    public Empleado buscar(String dni){
        try {
            return em.Buscar(dni);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
