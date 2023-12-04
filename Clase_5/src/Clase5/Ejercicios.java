package Clase5;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {

		//1-
		//name();

		//2-
		//mayusculas();

		//3-
		//name2();

		//4-
		//telefono();

		//5-
		fraseInvertida();

		//6-
		//correo();

		//7-



	}

	//1- Escribir un programa que pregunte el nombre del usuario en la consola y
	//un número entero e imprima por pantalla en líneas distintas el nombre del
	//usuario tantas veces como el número introducido.

	public static void name() {
			Scanner preguntaScanner = new Scanner(System.in);

			System.out.println("Dime tu nombre");
			String nameString = preguntaScanner.next();

			System.out.println("Dime un número entero");
			int repetir = preguntaScanner.nextInt();

			for (int i = 0; i<repetir; i++) {
				System.out.println(nameString);
			}
			
			preguntaScanner.close();
	}

	//2- Escribir un programa que pregunte el nombre completo del usuario en la
	//consola y después muestre por pantalla el nombre completo del usuario
	//dos veces, una con todas las letras minúsculas y otra con todas las letras
	//mayúsculas. El usuario puede introducir su nombre combinando
	//mayúsculas y minúsculas como quiera.

	public static void mayusculas() {
		Scanner pregScanner = new Scanner(System.in);

		System.out.println("Dime tu nombre");
		String nameString = pregScanner.next();

		System.out.println(nameString.toLowerCase());
		System.out.println(nameString.toUpperCase());

		pregScanner.close();
	}

	//3- Escribir un programa que pregunte el nombre del usuario en la consola y
	//después de que el usuario lo introduzca muestre por pantalla NOMBRE
	//tiene n letras, donde NOMBRE es el nombre de usuario en
	//mayúsculas y n es el número de letras que tienen el nombre.


	public static void name2() {
		Scanner name2 = new Scanner(System.in);

		System.out.println("Dime tu nombre");
		String namString = name2.next();

		String nameMayString = namString.toUpperCase();
		int longitudNombre = namString.length();

		System.out.println("Tu nombre en mayusculas es " +nameMayString+ " y tiene " +longitudNombre+ " letras");
		name2.close();
	}

	//4- Los teléfonos de una empresa tienen el siguiente formato prefijo-número-
	//extension donde el prefijo es el código del país +34, y la extensión tiene
	//dos dígitos (por ejemplo +34-913724710-56).
	//Escribir un programa que pregunte por un número de teléfono con este
	//formato y muestre por pantalla el número de teléfono sin el prefijo y la
	//extensión.

	public static void telefono() {
		Scanner telefonoScanner = new Scanner(System.in);
		System.out.println("Dime un número con prefijo y extension ej: +34-913724710-56");
		String input = telefonoScanner.next();

		String[] parts = input.split("-");
		String prefijo = parts[0];
		String number = parts[1];
		String extension = parts[2];
		System.out.println("Número de teléfono: " + number + " Prefijo: " +prefijo+ ", Extensión: " + extension);
       
       telefonoScanner.close();
	}

	//5- Escribir un programa que pida al usuario que introduzca una frase en la
	//consola y muestre por pantalla la frase invertida.

	public static void fraseInvertida() {
		Scanner fraseInvertidaScanner = new Scanner(System.in);

		System.out.println("Escribe una frase");
		String original = fraseInvertidaScanner.nextLine();

		String invertido = "";
 
		for (int i = original.length() - 1; i >= 0; i--) {
			invertido += original.charAt(i);
		}

		System.out.println("Original: " + original);
		System.out.println("Invertido: " + invertido);

		fraseInvertidaScanner.close();

	}

	//6 -Escribir un programa que pregunte el correo electrónico del usuario en la
	//consola y muestre por pantalla otro correo electrónico con el mismo
	//nombre (la parte antes del arroba @) pero con dominio ces.net.

	public static void correo() {
		Scanner correoScanner = new Scanner(System.in);

		System.out.println("Dime un correo, ej: alexperez@gmail.com");
		String correoOriginalString = correoScanner.next();

		String[] parts = correoOriginalString.split("@");
        String prefijo = parts[0];
        String prefijo2 = parts[1];
        prefijo2 = "ces.net";
       
        String correoTotal = prefijo + "@" +prefijo2;
        System.out.println(correoTotal);

        correoScanner.close();
}

	//7- Escribir un programa que pregunte por consola el precio de un producto
	//en euros con dos decimales y muestre por pantalla el número de euros y
	//el número de céntimos del precio introducido tal que así:
	//Euros: X
	//Céntimos de Euro: XX

	public static void precio() {
		Scanner dineroScanner = new Scanner(System.in);

		System.out.println("Dime un precio con dos decimales, ej: 2,35$");

	}
	}