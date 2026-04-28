public class Main {

    public static void main(String[] args) {


        // --- Parte 1: lista de tareas

        listaTareas lista = new listaTareas();

        lista.nuevaTarea("Estudiar Java");
        lista.nuevaTarea("Salir a caminar con mis mascotas");
        lista.nuevaTarea("Leer un libro");
        lista.nuevaTarea("Repasar las clases");

        lista.mostraTareas();
        lista.tareaTerminada("Jugar un ratito");
        lista.tareaTerminada("Salir a caminar con mis mascotas");
        lista.mostraTareas();
        lista.tareaPendientes();


        // ---- Parte 2: biblioteca


        biblioteca bib = new biblioteca();

        bib.agregarLibro("El Quijote");
        bib.agregarLibro("Cien años de soledad");
        bib.agregarLibro("El Quijote"); // duplicado, no se agrega
        bib.agregarLibro("Harry Potter");

        bib.mostrarLibros();
        bib.totalLibros();


        // --- Parte 3: Directorio de trabajadores



        directorio dir = new directorio();

        dir.agregarEmpleado("Ana Lopez", 2500000);
        dir.agregarEmpleado("Juancito Ruiz", 3200000);
        dir.agregarEmpleado("Valeri Vargas", 2800000);

        dir.mostrarEmpleados();
        dir.actualizarSalario("Juancito Ruiz", 3500000);
        dir.mostrarEmpleados();
        dir.calcularPromedio();
    }
}