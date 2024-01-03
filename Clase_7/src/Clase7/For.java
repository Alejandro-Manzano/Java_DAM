package Clase7;

import java.text.DecimalFormat;
import java.util.Iterator;
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
		
		//5-
		//invertir();
		
		//6-
		//estrellas();
		
		//7-
		//tabla();
		
		//8-
		//triangulo();
		
		//9-
		password();
		

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
	
	//5- Escribir un programa que pregunte al usuario una cantidad a invertir, el
	//interés anual y el número de años, y muestre por pantalla el capital
	//obtenido en la inversión cada año que dura la inversión.
	//En plan:
	//Inversión inicial: XXXX,XX€
	//Año 1: YYYY,YY
	//Año 2: ZZZZ,ZZ …
	
	public static void invertir() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cantidad a invertir");
		double inversion = scanner.nextDouble();
		
		System.out.println("Dime el interes anual en %");
		double interesAnual = scanner.nextDouble();
		
		System.out.println("Dime el número de años");
		int años = scanner.nextInt();
		
		double capital;
        for (int i = 1; i <= años; ++i) {
        	//igualo el capital a la fórmula del interes compuesto
            capital = inversion * (1 + interesAnual / 100);
            
            //hago que inversión sea igual al capital anterior para emplearlo en la siguiente
            inversion = capital;

            DecimalFormat formato = new DecimalFormat("0.00");
            String total = formato.format(capital);
            
            // Mostrar por pantalla el capital obtenido en cada año
            System.out.println("Año " +i+ ": " +total);
        }
		
        scanner.close();
	}
	
	//6- Escribir un programa que pida al usuario un número entero y muestre por
	//pantalla un triángulo rectángulo como el de más abajo, de altura el
	//número introducido.
	//*
	//**
	//***
	//****
	//*****
	
	public static void estrellas() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime un número");
		int number = scanner.nextInt();
		
		//que el número sea positivo y entero
		if (number>=0 && number%number == 0) {
			
			for (int i = 1; i <= number; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			
		}else {
			System.out.println("Escribe un número entero");
		}
		
		scanner.close();
	}
	
	//7- Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10.
	
	public static void tabla() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("1 * " +i+ " = " +1*i);
		}
	}
	
	//8- Escribir un programa que pida al usuario un número entero y muestre por
	//pantalla un triángulo rectángulo como el de más abajo.
	//1
	//3 1
	//5 3 1
	//7 5 3 1
	//9 7 5 3 1
	
	public static void triangulo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime un número entero");
		int number = scanner.nextInt();
		
		scanner.close();
		
		if (number>=0 && number%number == 0) {
			
			 for (int i = 1; i <= number; i += 2) {
		            for (int j = i; j >= 1; j -= 2) {
		                System.out.print(j + " ");
		            }
		            System.out.println();
		        }
			
		} else {
			System.out.println("Introduce un número entero y positivo");
		}
	
	}
	
	
	//9- Escribir un programa que almacene la cadena de caracteres contraseña en
	//una variable, pregunte al usuario por la contraseña hasta que introduzca
	//la contraseña correcta.
	
	public static void password() {
		String passwordString = "1234";
		
		Scanner scanner = new Scanner(System.in);
		
		   do {
			   System.out.println("Introduce la contraseña");
			   String passwordTwoString1 = scanner.next();

	            // Verificar si la contraseña ingresada es correcta
	            if (!passwordTwoString1.equals(passwordString)) {
	                System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
	            } else {
	                System.out.println("Contraseña correcta");
	                break; // Salir del bucle si la contraseña es correcta
	            }
	        } while (true);
		   
		  scanner.close();
	}

}
