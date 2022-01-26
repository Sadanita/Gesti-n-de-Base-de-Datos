
package sistema.empleadoDAL;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import sistema.empleadoBL.VariablesDeRetorno;

public class metodotransdos extends conexion{
    java.sql.Statement st;
    ResultSet rs;
    VariablesDeRetorno var = new VariablesDeRetorno();
     public void EjecutarTransaccionDos(String id, String fecha_factura, String forma_pago, String estado_factura, String costo_total, String cancelado) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "call facturacion_factura('"+id+"','"+fecha_factura+"','"+forma_pago+"','"+estado_factura+"','"+costo_total+"','"+cancelado+"');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "La transacción se ejecuto correctamente ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en la transaccion!" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
}
}
