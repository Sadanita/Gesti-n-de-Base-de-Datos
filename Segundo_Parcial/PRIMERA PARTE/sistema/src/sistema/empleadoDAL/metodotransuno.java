/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.empleadoDAL;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import sistema.empleadoBL.VariablesDeRetorno;
import sistema.empleadoBL.VariablesDeRetornoServi;

public class metodotransuno extends conexion{
     java.sql.Statement st;
    ResultSet rs;
    VariablesDeRetorno var = new VariablesDeRetorno();
     public void EjecutarTransaccionUno(String id, String tipo, String costo, String fecha) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "call servicio_total('"+id+"','"+tipo+"','"+costo+"','"+fecha+"');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "La transacción se ejecuto correctamente ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en la transaccion!" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
}

}
   