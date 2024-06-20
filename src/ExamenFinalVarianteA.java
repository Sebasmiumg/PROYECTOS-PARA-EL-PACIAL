import java.util.Scanner;

public class ExamenFinalVarianteA {

    // Método para encontrar el máximo de tres números
    public int findMax(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    // Método para concatenar tres cadenas de texto
    public void concatText(String text1, String text2, String text3) {
        String resultado = text1 + text2 + text3;
        System.out.println(resultado);
    }

    // Método para mostrar la tabla de multiplicar de un número
    public void tablaMultiplicar(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // Método que recibe dos números y un operador, realiza la operación correspondiente
    public void calculadora(int num1, int num2, char operador) {
        int resultado = 0;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
        }
        System.out.println("Resultado: " + resultado);
    }

    // Método para determinar si un número es primo o no
    public boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

