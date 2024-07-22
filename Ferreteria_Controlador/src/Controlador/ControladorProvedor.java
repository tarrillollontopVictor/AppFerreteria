package Controlador;

import Modelo.Proveedor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorProvedor{
    Proveedor p;

    public ControladorProvedor() {
        this.p = new Proveedor();
    }
    
      
    //Metodo de registrar correcto
    public boolean registrar(String rucProveedor, String nombre, String direccion, String ciudad, String pais, int telefono, String correo, String sitioWeb){
        try {
            p.setRucProveedor(rucProveedor);
            p.setNombre(nombre);
            p.setDireccion(direccion);
            p.setCiudad(ciudad);
            p.setPais(pais);
            p.setTelefono(telefono);
            p.setCorreo(correo);
            p.setSitioWeb(sitioWeb);
          
            return p.Registrar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    //Metodo de actualizar correcto
    public boolean actualizar(String rucProveedor, String nombre, String direccion, String ciudad, String pais, int telefono, String correo, String sitioWeb){
         try {
           p.setRucProveedor(rucProveedor);
            p.setNombre(nombre);
            p.setDireccion(direccion);
            p.setCiudad(ciudad);
            p.setPais(pais);
            p.setTelefono(telefono);
            p.setCorreo(correo);
            p.setSitioWeb(sitioWeb);
             return p.Actualizar();
         } catch (SQLException ex) {
             Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
        
    }
    
    //Metodo de actualizar correcto
    public boolean eliminar(String dni){
        
        try {
            return p.Eliminar(dni);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Metodo de actualizar correcto   
    public Proveedor buscar(String dni){
        try {
            return p.Buscar(dni);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

   
}
