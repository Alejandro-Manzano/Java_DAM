package Clase6;

import java.util.Scanner;

public class Ejercicios_if {

	public static void main(String[] args) {
		
		//1
		edad();

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

}
