package Controlador;

import Modelo.Cliente;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladorCliente{
     Cliente c;
    public ControladorCliente() {
         this.c = new Cliente();
    }
    
    //Metodo de registrar correcto
    public boolean registrar(String dni, String nomCom,String distrito,int telefono,String correo, Date fecha){
        try {
            Cliente c = new Cliente(dni, nomCom, distrito, telefono, correo, fecha);
            return c.Registrar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    //Metodo de actualizar correcto
    public boolean actualizar(String cod,String nom, String distrito, int tel,String correo, Date fecha){
         try {
             c.setDNI_Cliente(cod);
             c.setNombresAp(nom);
             c.setDistrito(distrito);
             c.setTelefono(tel);
             c.setCorreo(correo);
             c.setFecha(fecha);
             return c.Actualizar();
         } catch (SQLException ex) {
             Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
        
    }
    
    //Metodo de actualizar correcto
    public boolean eliminar(String dni){
        
        try {
            return c.Eliminar(dni);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Metodo de actualizar correcto   
    public Cliente buscar(String dni){
        try {
            return c.Buscar(dni);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}