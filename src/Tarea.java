import java.util.Stack;
import java.util.Date;
public class Tarea {
    private String nombre;
    private String descripcion;
    private int prioridad;
    private Date fechaVencimiento;

    public Tarea(String nombre, String descripcion, int prioridad, Date fechaVencimiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Date getFechaVencimiento(){
        return fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Tarea: " + nombre + ", Descripción: " + descripcion + ", Prioridad: " + prioridad + ", Fecha de vencimiento: " + fechaVencimiento;
    }
}

