package Clase7;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		//1-
		palabra();

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

}
