package Controlador;

import Modelo.Productos;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladorProducto{

    Productos p;

    public ControladorProducto() {
        this.p = new Productos();
    }
    
      
    //Metodo de registrar correcto
    public boolean registrar(String codProducto, String nombre, String descripcion, String categoria, double precioVenta, String unidadMedida, int stock, String serie, String marca, Date fechaAdquisicion, String ubicacion, String proveedor){
        try {
            p.setCodProducto(codProducto);
            p.setNombre(nombre);
            p.setDescripcion(descripcion);
            p.setCategoria(categoria);
            p.setPrecioVenta(precioVenta);
            p.setUnidadMedida(unidadMedida);
            p.setStock(stock);
            p.setSerie(serie);
            p.setMarca(marca);
            p.setFechaAdquisicion(fechaAdquisicion);
            p. 
      
setUbicacion(ubicacion);
            p.setProveedor(proveedor);
            return p.Registrar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    //Metodo de actualizar correcto
    public boolean actualizar(String codProducto, String nombre, String descripcion, String categoria, double precioVenta, String unidadMedida, int stock, String serie, String marca, Date fechaAdquisicion, String ubicacion, String proveedor){
         try {
            p.setCodProducto(codProducto);
            p.setNombre(nombre);
            p.setDescripcion(descripcion);
            p.setCategoria(categoria);
            p.setPrecioVenta(precioVenta);
            p.setUnidadMedida(unidadMedida);
            p.setStock(stock);
            p.setSerie(serie);
            p.setMarca(marca);
            p.setFechaAdquisicion(fechaAdquisicion);
            p.setUbicacion(ubicacion);
            p.setProveedor(proveedor);
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
    public Productos buscar(String dni){
        try {
            return p.Buscar(dni);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

   
}
