package sistema.empleadoDAL;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import sistema.empleadoBL.VariablesDeRetorno;

public class metodos extends conexion {

    java.sql.Statement st;
    ResultSet rs;
    VariablesDeRetorno var = new VariablesDeRetorno();

    public void InsertarEmpleado(String id, String nombre, String apellido, String especializacion) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO empleado (id_empleado, nombre_empleado, apellido_empleado, especializacion_empleado)" + "VALUES('" + id + "','" + nombre + "','" + apellido + "','" + especializacion + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente! ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente! " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

    }

   
     public void buscar(String id_empleado) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from empleado where id_empleado = '"+id_empleado+"';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                var.setId_empleado(rs.getString("id_empleado"));
                var.setNombre_empleado(rs.getString("nombre_empleado"));
                var.setApellido_empleado(rs.getString("apellido_empleado"));
                var.setEspecializacion_empleado(rs.getString("especializacion_empleado"));
            } else {
                var.setId_empleado("");
                var.setNombre_empleado("");
                var.setApellido_empleado("");
                var.setEspecializacion_empleado("");
                JOptionPane.showMessageDialog(null, "No se encontro registro", "Sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de busqueda", "Error busqueda", JOptionPane.ERROR_MESSAGE);

        }

    }
     public void actualizar(String nombre, String apellido, String especializacion, String id){
         try{
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update empleado set nombre_empleado = '"+nombre+"', apellido_empleado = '"+apellido+"',especializacion_empleado ='"+especializacion+"' where id_empleado='"+id+"';";
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
            String sql = "delete from empleado where id_empleado='"+id+"'";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente! ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error al eliminar", "Error busqueda", JOptionPane.ERROR_MESSAGE);
         }
     }
}
