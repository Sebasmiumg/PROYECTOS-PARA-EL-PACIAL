import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExamenFinalVarianteA examen = new ExamenFinalVarianteA();

        // Ejemplo de ejecución de método findMax
        System.out.println("Introduce tres números:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("El mayor es: " + examen.findMax(a, b, c));

        // Ejemplo de ejecución de concatText
        System.out.println("Introduce tres cadenas de texto:");
        scanner.nextLine(); // Limpiar buffer
        String t1 = scanner.nextLine();
        String t2 = scanner.nextLine();
        String t3 = scanner.nextLine();
        examen.concatText(t1, t2, t3);

        // Ejemplo de ejecución de tablaMultiplicar
        System.out.println("Introduce un número para ver su tabla de multiplicar:");
        int n = scanner.nextInt();
        examen.tablaMultiplicar(n);

        // Ejemplo de ejecución de calculadora
        System.out.println("Introduce dos números y un operador (+, -, *, /):");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        char operador = scanner.next().charAt(0);
        examen.calculadora(num1, num2, operador);

        // Ejemplo de determinar si un número es primo
        System.out.println("Introduce un número para determinar si es primo:");
        int primo = scanner.nextInt();
        boolean esPrimo = examen.esPrimo(primo);
        System.out.println("¿Es primo? " + esPrimo);

        scanner.close();
    }
}
