import java.util.HashSet;
public class biblioteca {
    // para duplicadps
    private HashSet<String> libros = new HashSet<>();
   //agregar un libro
    public void agregarLibro(String titulo) {
        boolean agregados = libros.add(titulo);

        if (agregados){
            System.out.println("El libro ha sido agregado" + titulo);
        }else {
            System.out.println("Este libro ya esta agregado" + titulo);
        }
    }

    // libros que esyan disponibles
    public void mostrarLibros() {
        System.out.println("Tus libros en biblioteca: ");

        if (libros.isEmpty()) {
            System.out.println("Tu biblioteca esta vacia");
            return;
        }

        for (String libro : libros) {
            System.out.println("- " + libro);
        }
    }

    public void verificarLibro(String titulo) {
        if (libros.contains(titulo)) {
            System.out.println("El libro " + titulo + " esta disponible.");
        } else {
            System.out.println("El libro " + titulo + " no esta disponible.");
        }
    }

        // sacar la cuenta de cuantos unicos hay
    public void totalLibros() {
        System.out.println("El total de libros unicos en biblioteca: " + libros.size());
    }
}
