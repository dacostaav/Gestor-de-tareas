import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear algunas tareas
        Tarea tarea1 = new Tarea("Tarea 1", "Descripción de la tarea 1", 3, new Date(2023, 10, 15));
        Tarea tarea2 = new Tarea("Tarea 2", "Descripción de la tarea 2", 1, new Date(2023, 10, 10));
        Tarea tarea3 = new Tarea("Tarea 3", "Descripción de la tarea 3", 2, new Date(2023, 10, 12));

        // Crear una pila de tareas
        PilaTareas pila = new PilaTareas();
        pila.agregarTarea(tarea1);
        pila.agregarTarea(tarea2);
        pila.agregarTarea(tarea3);

        // Mostrar la tarea más reciente
        System.out.println("Tarea más reciente en la pila:");
        System.out.println(pila.obtenerTareaReciente());
        System.out.println();

        // Completar una tarea de la pila
        Tarea tareaCompletada = pila.completarTarea();
        System.out.println("Tarea completada:");
        System.out.println(tareaCompletada);
        System.out.println();

        // Mostrar la cantidad de tareas restantes en la pila
        System.out.println("Cantidad de tareas en la pila:");
        System.out.println(pila.cantidadTareas());
        System.out.println();

        // Crear una cola de tareas programadas
        ColaTareasProgramadas cola = new ColaTareasProgramadas();
        cola.agregarTarea(tarea1);
        cola.agregarTarea(tarea2);
        cola.agregarTarea(tarea3);

        // Obtener la siguiente tarea en la cola
        System.out.println("Siguiente tarea en la cola:");
        System.out.println(cola.obtenerSiguienteTarea());
        System.out.println();

        // Completar una tarea de la cola
        cola.completarTarea();
        System.out.println("Tarea completada en la cola.");
        System.out.println();

        // Verificar si hay tareas pendientes en la cola
        System.out.println("¿Hay tareas pendientes en la cola?");
        System.out.println(cola.hayTareasPendientes());
        System.out.println();

        // Crear una lista enlazada de prioridad
        ListaEnlazadaPrioridad lista = new ListaEnlazadaPrioridad();
        lista.insertar(tarea1);
        lista.insertar(tarea2);
        lista.insertar(tarea3);

        // Mostrar las tareas en la lista
        System.out.println("Tareas en la lista enlazada de prioridad:");
        lista.mostrarTareas();
        System.out.println();

        // Verificar si la lista está vacía
        System.out.println("¿La lista está vacía?");
        System.out.println(lista.estaVacia());
    }
}
