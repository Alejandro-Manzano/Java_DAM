package hnd;

import java.util.Scanner;

public class L1 {

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calcularMCM(int a, int b) {
        return (a * b) / calcularMCD(a, b);
    }

    public static int calcularMCDLista(int[] numeros) {
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado = calcularMCD(resultado, numeros[i]);
        }
        return resultado;
    }

    public static int calcularMCMLista(int[] numeros) {
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado = calcularMCM(resultado, numeros[i]);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de números
        System.out.print("Ingrese la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();

        // Pedir al usuario los números y almacenarlos en un array
        int[] numeros = new int[cantidadNumeros];
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Calcular y mostrar el MCD
        int mcd = calcularMCDLista(numeros);
        System.out.println("El MCD de los números es: " + mcd);

        // Calcular y mostrar el MCM
        int mcm = calcularMCMLista(numeros);
        System.out.println("El MCM de los números es: " + mcm);

        // Cerrar el scanner
        scanner.close();
        
    }
    }




