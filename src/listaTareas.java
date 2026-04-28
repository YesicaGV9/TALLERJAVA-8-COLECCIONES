import java.util.ArrayList;
public class listaTareas {

    // para la lista tareas, aqui guardamos
    private ArrayList<String> tareas = new ArrayList<>();


    // agregar tareas a la lista
    public void nuevaTarea(String tarea) {
        tareas.add(tarea);
        System.out.println("La tarea ha sido agregada: " + tarea);
    }

    // todas las tareas
    public void mostraTareas() {
        System.out.println("teras por hacer: ");

        if (tareas.isEmpty()) {
            System.out.println("Lista de tareas vacia");
            return;
        }

        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
    }



    // completar tarea y eliminar
    public void tareaTerminada(String tarea) {
        boolean terminada = tareas.remove(tarea);

        if (terminada) {
            System.out.println("Tarea completada " + tarea);
        } else {
            System.out.println("No existe esa tarea " + tarea);
        }
    }

    // La tareas que quedan por hacer
    public void tareaPendientes(){
        System.out.println("Tareas que quedan por hacer: " + tareas.size());
    }
}






