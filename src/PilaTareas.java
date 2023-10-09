import java.util.Stack;

public class PilaTareas {
    private Stack<Tarea> pila;

    public PilaTareas() {
        pila = new Stack<>();
    }

    public void agregarTarea(Tarea tarea) {
        pila.push(tarea);
    }

    public Tarea obtenerTareaReciente() {
        return pila.peek();
    }

    public Tarea completarTarea() {
        return pila.pop();
    }

    public boolean hayTareasPendientes() {
        return !pila.isEmpty();
    }

    public int cantidadTareas() {
        return pila.size();
    }
}
