
package sistema.empleadoDAL;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import sistema.empleadoBL.VariablesDeRetorno;
import sistema.empleadoBL.VariablesDeRetornoServi;

public class metodosservi extends conexion{
    java.sql.Statement st;
    ResultSet rs;
    VariablesDeRetorno var = new VariablesDeRetorno();
    VariablesDeRetornoServi var1 = new VariablesDeRetornoServi();
    
     public void InsertarServicio (String id, String tipo, String costo, String fecha) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO servicio (id_servicio, tipo_servicio, costo_servicio, fecha_servicio)" + "VALUES('" + id + "','" + tipo + "','" + costo + "','"+fecha+"');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente! ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente! " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

    }
     public void buscar(String id_servicio) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from servicio where id_servicio = '"+id_servicio+"';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                var1.setId_servicio(rs.getString("id_servicio"));
                var1.setTipo_servicio(rs.getString("tipo_servicio"));
                var1.setCosto_servicio(rs.getString("costo_servicio"));
                var1.setFecha_servicio(rs.getString("fecha_servicio"));
            } else {
                var1.setId_servicio("");
                var1.setTipo_servicio("");
                var1.setCosto_servicio("");
                var1.setFecha_servicio("");
                JOptionPane.showMessageDialog(null, "No se encontro registro", "Sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de busqueda", "Error busqueda", JOptionPane.ERROR_MESSAGE);

        }

    }
     public void actualizar( String tipo, String costo, String fecha, String id){
         try{
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update servicio set tipo_servicio = '"+tipo+"', costo_servicio = '"+costo+"',fecha_servicio ='"+fecha+"' where id_servicio='"+id+"';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo correctamente! ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error al actualizar", "Error busqueda", JOptionPane.ERROR_MESSAGE);
         }
     }
     public void eliminar(String id){
         try{
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from servicio where id_servicio='"+id+"'";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente! ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error al eliminar", "Error busqueda", JOptionPane.ERROR_MESSAGE);
         }
     }
}
