
package Paquete;

import java.io.File;
import java.sql.*;

/**
 *
 * @author elamc
 */
public class Conexion {

    

    
    public Connection CearDB () {
        Connection con;
        String barra=File.separator;
        String proyecto= System.getProperty("user.dir")+barra+"Registros";
        File url=new File(proyecto);
        if(url.exists()){
        System.out.println("Base de Datos ya existe");
        }
        else{
            
            try {
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                String db="jdbc:derby:"+proyecto+";create=true";
                con = DriverManager.getConnection(db);
                
               
              
               
                
                System.out.println("Base de datos creada");
                
                return con;
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("Error: "+ ex);
            }
            
                
            } 
           return null;
        }
    public Connection CargarDB(){
    Connection con;   
    String barra=File.separator;
    String proyecto= System.getProperty("user.dir")+barra+"Registros";
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            String db="jdbc:derby:"+proyecto;
            con = DriverManager.getConnection(db);
            System.out.println("Base de datos cargada");
            
            
          return con;  
        } catch (ClassNotFoundException | SQLException ex ) {
            System.out.println("Error:"+ex);
            
        }
    return null;
    }
    }
            

