public class ListaEnlazadaPrioridad {
    private Nodo head;

    private class Nodo {
        Tarea tarea;
        Nodo siguiente;

        public Nodo(Tarea tarea) {
            this.tarea = tarea;
            this.siguiente = null;
        }
    }

    public void insertar(Tarea tarea) {
        Nodo nuevoNodo = new Nodo(tarea);

        if (head == null || tarea.getPrioridad() > head.tarea.getPrioridad()) {
            nuevoNodo.siguiente = head;
            head = nuevoNodo;
            return;
        }

        Nodo actual = head;
        while (actual.siguiente != null && tarea.getPrioridad() <= actual.siguiente.tarea.getPrioridad()) {
            actual = actual.siguiente;
        }

        nuevoNodo.siguiente = actual.siguiente;
        actual.siguiente = nuevoNodo;
    }

    public void mostrarTareas() {
        Nodo actual = head;
        while (actual != null) {
            System.out.println(actual.tarea);
            actual = actual.siguiente;
        }
    }

    public boolean estaVacia() {
        return head == null;
    }
}
