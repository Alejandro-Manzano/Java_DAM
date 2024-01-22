package Exámen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		
		//ex01();
		
		//ex02();
		
		//ex03();
		
		//ex04();
		
	}
	
	//1- Escribir un programa que convierta de euros a dólares. El resultado
	//saldrá por consola con dos decimales redondeados hacia arriba
	
	public static void ex01() {
		
        double tasa = 1.09;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una cantidad en euros");
        double cantidadEuros = scanner.nextDouble();

        // Convertir a dólares y redondear hacia arriba
        double cantidadDolares = Math.ceil(cantidadEuros * tasa * 100) / 100;

        // Mostrar el resultado con dos decimales
        DecimalFormat formato = new DecimalFormat("0.00");
        String resultadoFormateado = formato.format(cantidadDolares);

        Math.round(cantidadDolares);
        
        System.out.println("Cantidad en euros: " + cantidadEuros);
        System.out.println("Cantidad en dólares (redondeado hacia arriba): " + resultadoFormateado+ " $");
        
        scanner.close();
	}
	
	//2- Emplear la fórmula de la gravitación universal
	
	public static void ex02() {
		
		double G = 6.673e-11;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce m1");
		double m1 = scanner.nextDouble();
		
		System.out.println("Dime m2");
		double m2 = scanner.nextDouble();
		
		System.out.println("Dime d");
		double d = scanner.nextDouble();
		double d2 = d*d;
		
		double F = (G * m1 * m2)/ d2;
		
		System.out.println("El resultado es F = " +F+ " N");
		
		scanner.close();
	}
	
	public static void ex03() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Diem tu DNI");
		int DNI = scanner.nextInt();
		
		int letra = DNI%23;
		
		System.out.println(letra);
		
		scanner.close();
		
	}
	
	//4- Escribir un programa que introduzca las edades de una serie de alumnos,
	//y que se detendrá al introducir un número negativo. Se calculara la suma, la media
	//y el número de alumnos con más de 18 años
	
	public static void ex04() {
		
		  Scanner scanner = new Scanner(System.in);

	        int sumaEdades = 0;
	        int cantidadAlumnos = 0;
	        int cantidadAlumnosMayores18 = 0;

	        System.out.println("Introduce las edades de los alumnos (introduce un número negativo para finalizar):");

	        while (true) {
	            System.out.print("Edad del alumno: ");
	            int edad = scanner.nextInt();

	            // Verificar si se debe salir del bucle
	            if (edad < 0) {
	                break;
	            }

	            // Actualizar la suma y la cantidad de alumnos
	            sumaEdades += edad;
	            cantidadAlumnos++;

	            // Verificar si el alumno tiene más de 18 años
	            if (edad > 18) {
	                cantidadAlumnosMayores18++;
	            }
	        }

	        // Calcular la media
	        double mediaEdades = (double)sumaEdades / cantidadAlumnos;
	        

	        // Mostrar resultados
	        System.out.println("Suma de edades: " + sumaEdades);
	        System.out.println("Media de edades: " + mediaEdades);
	        System.out.println("Número de alumnos con más de 18 años: " + cantidadAlumnosMayores18);

	        scanner.close();
	}
	
	
	}
