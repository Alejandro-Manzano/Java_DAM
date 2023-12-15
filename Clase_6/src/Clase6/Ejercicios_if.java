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
		//tributar();
		
		//6- 
		//clases();
		
		//7-
		puntuacion();
		
		//8-
		//name();
		
		//9-
		
		
		

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
	
	//6- Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al
	//sexo y el nombre. El grupo A esta formado por las mujeres con un nombre
	//anterior a la M y los hombres con un nombre posterior a la N y el grupo B
	//por el resto. Escribir un programa que pregunte al usuario su nombre y
	//sexo, y muestre por pantalla el grupo que le corresponde.
	
	public static void clases() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime tu nombre");
		String nombre = scanner.next();
		System.out.println("Eres hombre o mujer");
		String sexo = scanner.next();
		
		char primeraLetra = Character.toLowerCase(nombre.charAt(0));
		
		if ( ((sexo.equals("mujer"))&&(primeraLetra >= 'a' && primeraLetra <= 'm')) || ((sexo.equals("hombre"))&&(primeraLetra >= 'n' && primeraLetra <= 'z'))) {
			System.out.println("Nombre: " +nombre);
			System.out.println("Sexo: " +sexo);
			System.out.println("Perteneces al grupo A");
		} else {
			System.out.println("Nombre: " +nombre);
			System.out.println("Sexo: " +sexo);
			System.out.println("Perteneces al grupo B");
		}
		scanner.close();
	}
	
	//7- En una determinada empresa, sus empleados son evaluados al final de
	//cada año. Los puntos que pueden obtener en la evaluación comienzan en
	//0.0 y pueden ir aumentando, traduciéndose en mejores beneficios. Los
	//puntos que pueden conseguir los empleados pueden ser 0.0, 0.4 o 0.6,
	//pero no valores intermedios entre las cifras mencionadas. A continuación
	//se muestra una tabla con los niveles correspondientes a cada puntuación.
	//La cantidad de dinero conseguida en cada nivel es de 2.400€ multiplicada
	//por la puntuación del nivel.

	//Nivel Puntuación % a multiplicar
	//Inaceptable 0,0 1,00
	//Aceptable 0,4 1,05
	//Meritorio 0,6 1,10
	//Escribe un programa que lea la puntuación del usuario e indique su nivel
	//de rendimiento, así como la cantidad de dinero que recibirá el usuario.
	
	private static void puntuacion() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime tu puntuación");
		double score = scanner.nextDouble();
		
		int dinero = 2400;
		
		if (score == 0.0) {
			System.out.println("El nivel es inaceptable");
			System.out.println("Tu bono es: " +dinero);
		} if (score == 0.4) {
			System.out.println("El nivel es aceptable");
			System.out.println("Tu bono es: " +dinero * 1.05);
		} if (score == 0.6) {
			System.out.println("El nivel es meritorio");
			System.out.println("Tu bono es: " +dinero * 1.10);
		} 
		
		scanner.close();
		
		
	}
	
	//8- Escribir un programa para una empresa que tiene salas de juegos para
	//todas las edades y quiere calcular de forma automática el precio que debe
	//cobrar a sus clientes por entrar. El programa debe preguntar al usuario la
	//edad del cliente y mostrar el precio de la entrada. Si el cliente es menor de
	//4 años puede entrar gratis, si tiene entre 4 y 18 años debe pagar 5€ y si es
	//mayor de 18 años, 10€.
	
	public static void name() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime tu edad");
		int edad = scanner.nextInt();
		
		if (edad < 4) {
			System.out.println("Puedes entrar gratis");
		} if (edad >=4 && edad <=18) {
			System.out.println("Tienes que pagar 5$");
		} else {
			System.out.println("Tienes que pagar 10$");
		} 
		
		scanner.close();
	}
	
	//9- La pizzería Bella Pedara ofrece pizzas vegetarianas y no vegetarianas a sus
	//clientes. Los ingredientes para cada tipo de pizza aparecen a continuación.

	//Ingredientes vegetarianos: Pimiento y tofu.
	//Ingredientes no vegetarianos: Salami, Jamón y Salmón.
	//Escribir un programa que pregunte al usuario si quiere una pizza
	//vegetariana o no, y en función de su respuesta le muestre un menú con
	//los ingredientes disponibles para que elija. Solo se puede elegir un
	//ingrediente además de la mozzarella y el tomate que están en todas la
	//pizzas. Al final se debe mostrar por pantalla si la pizza elegida es
	//vegetariana o no y todos los ingredientes que lleva.
	
}
