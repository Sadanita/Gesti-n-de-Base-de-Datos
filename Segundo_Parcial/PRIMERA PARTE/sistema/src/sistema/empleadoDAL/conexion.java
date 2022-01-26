
package sistema.empleadoDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author PC Masters
 */
public class conexion {
    Connection conn = null;
    String url = "jdbc:postgresql://localhost:5432/ASILO";
    String usuario = "postgres";
    String clave = "sadana";
    public Connection conectar(){
        try{
            Class.forName("org.postgresql.Driver");
            conn=DriverManager.getConnection(url,usuario,clave);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectar"+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    return conn;
    }
}


       
      

