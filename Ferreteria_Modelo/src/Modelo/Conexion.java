package Modelo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//Junior utilizare un patron de diseño llamado Singleton para poder crear una sola instancia de la base de datos
public class Conexion {
    
    
    private static final String URL = "jdbc:postgresql://localhost:5432/prueba";
    private static final String USER = "postgres";
    private static final String PASSWORD = "993200912";
    private Connection con;
    private static Conexion cnx;
    
    private Conexion(){
        setCon();
    }
    
    
    public static synchronized Conexion getInstance() throws SQLException{
        if(cnx == null){
            cnx = new Conexion();
        }else if (cnx.getCon().isClosed()) {
            cnx = new Conexion();
        }
        return cnx;
    }

    public Connection getCon() {
        return con;
    }
    

    private void setCon() {
        try {
            this.con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa");
        } catch (SQLException ex) {
            throw new RuntimeException("Error al conectarte con la base de datos");
        }
    }
    
    
    
}
