import java.util.HashMap;
import java.util.Map;
public class directorio {

    private HashMap<String, Double> directorioEmpleados = new HashMap<>();

    //agrega empleado con salario
    public void agregarEmpleado(String nombre, double salario){
        directorioEmpleados.put(nombre, salario);
        System.out.println("Trabajador agregado: " + nombre + " -- Salario: $" + salario);
    }

    public void mostrarEmpleados() {
        System.out.println("Todos los trabajadores");

        if (directorioEmpleados.isEmpty()) {
            System.out.println("No hay trabajadores agregados");
            return;
        }

        for (Map.Entry<String, Double> entrada : directorioEmpleados.entrySet()) {
            System.out.println(entrada.getKey() + " - $" + entrada.getValue());
        }
    }


    // Actualizar salarios por trabajador
    public void actualizarSalario(String nombre, double nuevoSalario) {
        if (directorioEmpleados.containsKey(nombre)) {
            directorioEmpleados.put(nombre, nuevoSalario);
            System.out.println("Salario actualizado de: " + nombre + " a $" + nuevoSalario);
        } else {
            System.out.println("No existe el trabajador " + nombre);
        }
    }


    // promedio de salario
    public void calcularPromedio() {
        if (directorioEmpleados.isEmpty()) {
            System.out.println("No hay trabajadores para hacer el calculo");
            return;
        }

        double suma = 0;

        // sumamos todos los salarios
        for (double salario : directorioEmpleados.values()) {
            suma = suma + salario;
        }

        double promedio = suma / directorioEmpleados.size();
        System.out.println("El salario promedio es:$" + promedio);
    }
}
