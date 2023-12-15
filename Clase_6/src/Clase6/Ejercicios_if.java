package Clase6;

import java.util.Scanner;

public class Ejercicios_if {

	public static void main(String[] args) {
		
		//1
		//edad();
		
		//2-
		//password();
		
		//3-
		//resto();
		
		//4-
		//parImpar();
		
		//5-
		tributar();

	}
	
	//1- Escribir un programa que pregunte al usuario su edad y muestre por
	//pantalla si es mayor de edad o no. La edad deberá comparar con una
	//constante que almacene el valor 18. (Recuerda que se declaran donde las
	//variables globales, justo después de declarar la clase)
	
	public static void edad() {
		Scanner edadScanner = new Scanner(System.in);
		System.out.println("Cuantos años tienes ?");
		int edad = edadScanner.nextInt();
		
		int num = 18;
		
		if (edad >= num) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		edadScanner.close();
	}
	
	// 2-Escribir un programa que almacene la cadena de caracteres contraseña en
	//una variable, pregunte al usuario por la contraseña e imprima por pantalla
	//si la contraseña introducida por el usuario coincide con la guardada en la
	//variable sin tener en cuenta mayúsculas y minúsculas.

	
	public static void password() {
		Scanner passwordScanner = new Scanner(System.in);
		System.out.println("Dime tu contraseña");
		
		String passwordString = passwordScanner.next();
		String password2 = "fr234";
		
		if (password2.equalsIgnoreCase(passwordString)) {
			System.out.println("Contraseña correcta");
		} else {
			System.out.println("Contraseña incorrecta");
		}
		
		passwordScanner.close();
	}
	
	//3- Escribir un programa que pida al usuario dos números y muestre por
	//pantalla su división. Si el divisor es cero el programa debe mostrar un
	//error. (Usa System.err en vez de System.out)
	
	public static void resto() {
		Scanner restoScanner = new Scanner(System.in);
		
		System.out.println("Dime el dividendo");
		int dividendo = restoScanner.nextInt();
		
		System.out.println("Dime el divisor");
		int divisor = restoScanner.nextInt();
		
		int resto = dividendo/divisor;
		
		if (divisor == 0) {
			System.err.println("Error divisor 0");
		} else {
			System.out.println(dividendo + " / " +divisor+ " = " +resto);
		}
		
		restoScanner.close();
	}
	
	//4- Escribir un programa que pida al usuario un número entero y muestre por
	//pantalla si es par o impar.
	
	public static void parImpar() {
		Scanner numScanner = new Scanner(System.in);
		
		System.out.println("Dame un número entero");
		int number = numScanner.nextInt();
		
		if (number%2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		numScanner.close();
	}
	
	//5 - Para tributar un determinado impuesto se debe ser mayor de 16 años y
	//tener unos ingresos iguales o superiores a 1000 € mensuales. Escribir un
	//programa que pregunte al usuario su edad y sus ingresos mensuales y
	//muestre por pantalla si el usuario tiene que tributar o no.
	
	public static void tributar() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Edad:");
		int edad = scanner.nextInt();
		
		System.out.println("Ingresos mensuales");
		int ingresos = scanner.nextInt();
		
		if (ingresos >= 1000 && edad > 16) {
			System.out.println("Puedes tributar");
		} else {
			System.out.println("No puedes tributar");
		}
		
		scanner.close();
	}
	
}
