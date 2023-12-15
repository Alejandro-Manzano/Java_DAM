package Clase6;

import java.util.Scanner;

public class Ejercicios_if {

	public static void main(String[] args) {
		
		//1
		//edad();
		
		//2-
		password();

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
}
