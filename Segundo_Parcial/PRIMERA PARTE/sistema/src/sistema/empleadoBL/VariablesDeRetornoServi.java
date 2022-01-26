
package sistema.empleadoBL;

public class VariablesDeRetornoServi {

    public static String id_servicio;
    public static String tipo_servicio;
    public static String costo_servicio;
    public static String fecha_servicio;


    public String getFecha_servicio() {
        return fecha_servicio;
    }

    public void setFecha_servicio(String fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
    }
    
    public String getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(String id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public String getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(String costo_servicio) {
        this.costo_servicio = costo_servicio;
    }
    
    
}
