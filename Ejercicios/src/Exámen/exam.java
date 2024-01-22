package Exámen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		
		ex01();
		
	}
	
	//Escribir un programa que convierta de euros a dólares. El resultado
	//saldrá por consola con dos decimales redondeados hacia arriba
	
	public static void ex01() {
		
        double tasa = 1.09;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una cantidad en euros");
        double cantidadEuros = scanner.nextDouble();

        // Convertir a dólares y redondear hacia arriba
        double cantidadDolares = Math.ceil(cantidadEuros * tasa * 100) / 100;

        // Mostrar el resultado con dos decimales
        DecimalFormat formato = new DecimalFormat("#.##");
        String resultadoFormateado = formato.format(cantidadDolares);

        System.out.println("Cantidad en euros: " + cantidadEuros);
        System.out.println("Cantidad en dólares (redondeado hacia arriba): " + resultadoFormateado+ " $");
	}
}
