import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionEstudiantes gestion = new GestionEstudiantes();

        // Ejemplo de agregar y mostrar estudiantes
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el nombre del estudiante:");
            String nombre = scanner.nextLine();
            System.out.println("Introduce la calificación del estudiante:");
            int calificacion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            gestion.agregarEstudiante(nombre, calificacion);
        }

        System.out.println("Lista de estudiantes:");
        gestion.mostrarEstudiantes();

        scanner.close();
    }
}
