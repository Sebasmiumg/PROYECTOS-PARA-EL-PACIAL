import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int calificacion;

    public Estudiante(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}

class GestionEstudiantes {
    private ArrayList<Estudiante> listaEstudiantes;

    public GestionEstudiantes() {
        listaEstudiantes = new ArrayList<>();
    }

    // Método para agregar estudiantes a la lista
    public void agregarEstudiante(String nombre, int calificacion) {
        Estudiante nuevoEstudiante = new Estudiante(nombre, calificacion);
        listaEstudiantes.add(nuevoEstudiante);
    }

    // Método para mostrar todos los estudiantes
    public void mostrarEstudiantes() {
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + ", Calificación: " + estudiante.getCalificacion());
        }
    }
}
