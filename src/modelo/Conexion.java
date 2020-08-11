
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    String url = "jdbc:mysql://localhost/bd_sistema_de_venta";
    String user = "root";
    String pass = "";
    
    Connection con;
    
    public Connection conectar(){
    
        try {
            con = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return con;
    }

}
