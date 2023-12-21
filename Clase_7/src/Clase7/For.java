package Clase7;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		//1-
		//palabra();
		
		//2-
		//edad();

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

}
