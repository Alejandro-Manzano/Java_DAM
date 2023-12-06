package Clase5;

import java.text.DecimalFormat;
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
		//fraseInvertida();

		//6-
		//correo();

		//7-
		//precio();
		
		//8-
		//date();
		
		//9-
		//cesta();
		
		//10-
		juguetes();

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
		String precio = dineroScanner.next();
		
		String[] parts = precio.split(",");
		
		String precio_1 = parts[0];
		String precio_2 = parts[1];
		
		System.out.println("Euros: " +precio_1+ "$");
		System.out.println("Céntimos de Euro: " +precio_2+ " cts");
		
		dineroScanner.close();

	}
	
	//8- Escribir un programa que pregunte al usuario la fecha de su nacimiento en
	//formato dd/mm/aaaa y muestra por pantalla, el día, el mes y el año.
	//Día:
	//Mes:
	//Año:
	//Adaptar el programa anterior para que también funcione cuando el día o
	//el mes se introduzcan con un solo carácter.
	
	public static void date() {
		Scanner dateScanner = new Scanner(System.in);
		
		System.out.println("Dime tu fecha de nacimiento: dd/mm/aaaa");
		
		String dateString = dateScanner.next();
		
		String[]dateArrayStrings = dateString.split("/");
		
		String day = dateArrayStrings[0];
		String month = dateArrayStrings[1];
		String year = dateArrayStrings[2];
		
		System.out.println("Día: " +day);
		System.out.println("Mes: " +month);
		System.out.println("Año: " +year);
		
		dateScanner.close();
		
	}
	
	//9- Escribir un programa que pregunte por consola por los productos de una
	//cesta de la compra, separados por comas, y muestre por pantalla cada uno
	//de los productos en una línea distinta.
	
	public static void cesta() {
		Scanner cestaScanner = new Scanner(System.in);
		
		System.out.println("Dime los productos de tu cesta separadaos por comas: ");
		String cestaCompraString = cestaScanner.nextLine();
		
		String [] cestaArrayStrings = cestaCompraString.split(",");
		
		
		for (int j = 0; j<cestaArrayStrings.length; j++) {
			System.out.println(cestaArrayStrings[j]);
			
		}
		cestaScanner.close();
		
	}
	
	//10- Escribir un programa que pregunte el nombre de un producto, su precio y
	//un número de unidades y muestre por pantalla una cadena con el nombre
	//del producto seguido de su precio unitario con 6 dígitos enteros y 2
	//decimales, el número de unidades con tres dígitos y el coste total con 8
	//dígitos enteros y 2 decimales, todos estos datos separados por espacios
	//tal que así:
	//Juguete 000008,99 027 00000242,73
	
	public static void juguetes() {
		
		Scanner jugueteScanner = new Scanner(System.in);
		
		System.out.println("Dime el nombre del producto");
		String productoString = jugueteScanner.next();
		
		System.out.println("Dime el precio del producto (8.89$)");
		double precioJuguete = jugueteScanner.nextDouble();
		
		System.out.println("Cuantas unidades has cogido (sin decimal)");
		int unidadesJuguete = jugueteScanner.nextInt();
		
		jugueteScanner.close();
		
		//formateo el precio para que tenga el formato 000000.00
		DecimalFormat formatPrecio = new DecimalFormat("000000.00");
		String numeroFormateado = formatPrecio.format(precioJuguete);
		
		//formatear unidaes con estructura 000
		String formatUnidaes = String.format("%03d", unidadesJuguete);
		
		//formateo precio total
		double costeTotal = precioJuguete*unidadesJuguete;
		DecimalFormat formatCoste = new DecimalFormat("00000000.00");
		String numFormteadoUnidades = formatCoste.format(costeTotal);
		
		System.out.println(productoString+ " " +numeroFormateado+ " " +formatUnidaes+ " " +numFormteadoUnidades);
		
		
	}
	
	}