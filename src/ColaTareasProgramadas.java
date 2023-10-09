import java.util.PriorityQueue;

public class ColaTareasProgramadas {
    private PriorityQueue<Tarea> cola;

    public ColaTareasProgramadas() {
        cola = new PriorityQueue<>((t1, t2) -> t1.getFechaVencimiento().compareTo(t2.getFechaVencimiento()));
    }

    public void agregarTarea(Tarea tarea) {
        cola.offer(tarea);
    }

    public Tarea obtenerSiguienteTarea() {
        return cola.peek();
    }

    public void completarTarea() {
        cola.poll();
    }

    public boolean hayTareasPendientes() {
        return !cola.isEmpty();
    }
}