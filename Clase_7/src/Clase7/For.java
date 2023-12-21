package Clase7;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		//1-
		//palabra();
		
		//2-
		//edad();
		
		//3-
		//enterosImpares();
		
		//4-
		//esEntero();

	}
	
	//1- Escribir un programa que pida al usuario una palabra y la muestre por
	//pantalla 10 veces.
	
	public static void palabra() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime una palabra");
		String palabraString = scanner.next();
		
		for (int j = 1; j<=10; j++) {
			System.out.println(palabraString);	
		}
		
		scanner.close();
	}
	
	//2- Escribir un programa que pregunte al usuario su edad y muestre por
	//pantalla todos los años que ha cumplido (desde 1 hasta su edad),
	//separados por un espacio.
	
	public static void edad() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime tu edad");
		int edad = scanner.nextInt();
		
		for (int i = 1; i <= edad; i++) {
			System.out.print(i + " años" + " ");
		}
		scanner.close();
	}
	
	//3- Escribir un programa que pida al usuario un número entero positivo y
	//muestre por pantalla todos los números impares desde 1 hasta ese
	//número separados por comas.
	
	public static void enterosImpares() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime un número entero");
		int number = scanner.nextInt();
		
		if (number%1 == 0 && number > 0) {
			
		for (int i = 1; i <=number; i+=2) {
			System.out.print(i + ",");
		}
			
		} else {
			System.out.println(number + " no es entero o positivo o es 0");
		}
		
		scanner.close();
		
	}
	
	//4- Escribir un programa que pida al usuario un número entero y muestre por
	//pantalla si es par o impar.
	
	public static void esEntero() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime un número entero");
		int number = scanner.nextInt();
		
		if (number%1 == 0) {
			if (number%2 == 0) {
				System.out.println(number+ " es par");
			}else {
				System.out.println(number + " es impar");
			}
		} else {
			System.out.println("Dame un entero");
		}
		
		scanner.close();
	}

}
