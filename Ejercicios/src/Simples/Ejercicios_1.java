package Simples;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class Ejercicios_1 {

public static void main(String[] args) {


//1-
HM();

//2-
String holaMundoString = "¡Hola Mundo!";
seeHolaMundo(holaMundoString);

//3-
//saludarNombre();

//4-
//operacion();

//5-
//horas();

//6-
//enteros();

//7-
//calcularIMC();

//8-
//division();

//9-
//juguetería();

//10-
panadería();

}

//1- Escribir un método que muestre por pantalla la cadena ¡Hola Mundo!
public static void HM() {
System.out.println("¡Hola Mundo!");
}

//2- Escribir un método al que se le pase una cadena ¡Hola Mundo! En una
//variable y luego la muestre por consola.
public static void seeHolaMundo(String a) {
System.out.println(a);
}

//3- Escribir un programa que pregunte el nombre del usuario en la consola y
//después la muestre por pantalla la cadena “Hola nombre"

public static void saludarNombre() {
Scanner saludarPersonaScanner = new Scanner(System.in);
System.out.println("Como te llamas?");
String nameString = saludarPersonaScanner.next();
System.out.println("Hola " + nameString);
}

//4- Escribir un programa que muestre por pantalla el resultado de la siguiente
//operación aritmética ((3+2)/(2*5))

public static void operacion() {
double rest = Math.pow((3.0+2.0)/(2.0*5.0), 2.0);
System.out.println(rest);

}

//5- Escribir un programa que pregunte al usuario por el número de horas
//trabajadas y el coste por hora. Después debe mostrar por pantalla los
//dineros que se le deben.
public static void horas() {
Scanner horasYDineroScanner = new Scanner(System.in);
System.out.println("Cuantas horas trabjaste");
double horas = horasYDineroScanner.nextInt();
System.out.println("Cuanto dinero cobras por hora?");
double dinero = horasYDineroScanner.nextInt();
System.out.println("te deben " +horas*dinero+ " $");

}

// 6- Escribir un programa que lea un entero positivo, n, introducido por el
//usuario y después muestre por consola la suma de todos los enteros
//desde 1 hasta n. La suma de los n enteros puede ser calculada de la
//siguiente forma:
public static void enteros() {
Scanner nEnteroScanner = new Scanner(System.in);
System.out.println("Dime un número entero");
int entero = nEnteroScanner.nextInt();
int suma = 0;
if (entero>=0) {
for (int i = 1; i<=entero; i++) {
suma += i;
}
System.out.println(suma);
} else {
System.out.println("Escribe un númrto entero");
}
}

	//7- Escribir un programa que pida al usuario su peso (en kg) y estatura (en
	//metros), calcule el índice de masa corporal y lo almacene en una variable,
	//y muestre por pantalla la frase “Tu índice de masa corporal es &lt;imc&gt;”
	//donde &lt;imc&gt; es el índice de masa corporal calculado redondeado con dos
	//decimales.

	public static void calcularIMC() {
		Scanner pesoYAlturaScanneerScanner = new Scanner(System.in);
		System.out.println("Dime tu peso en kg");
		double kg = pesoYAlturaScanneerScanner.nextDouble();
		
		System.out.println("Dime tu estatura en metros, ej:1,77m");
		double altura = pesoYAlturaScanneerScanner.nextDouble();
		
		double IMC = kg/altura;
		//método para dejar el double solo con 2 decimales
		BigDecimal numDecimal = new BigDecimal(IMC).setScale(2,RoundingMode.HALF_UP);
		System.out.println("Tu IMC es " +numDecimal);
		
		pesoYAlturaScanneerScanner.close();
	}
	
	//8- Escribir un programa que pida al usuario dos números enteros y muestre
	//por pantalla dividendo entre divisor da un cociente "c" y un resto
	//"r" “ donde &lt;dividendo&gt; y &lt;divisor&gt; son los números introducidos por el
	//usuario, y &lt;c&gt; y &lt;r&gt; son el cociente y el resto de la división entera
	//respectivamente.
	
	public static void division() {
		Scanner divisionScanner = new Scanner(System.in);
		System.out.println("Dime un dividendo");
		double dividendo = divisionScanner.nextDouble();
		System.out.println("Dime un divisor");
		double divisor = divisionScanner.nextDouble();
		
		double cociente = dividendo/divisor;
		double resto = dividendo%divisor;
		
		System.out.println("Has dividido " +dividendo+ " / " +divisor+ " y el resto es " +resto+ " y cociente " +cociente);
		
		divisionScanner.close();
	}
	
	//9- Una juguetería tiene mucho éxito en dos de sus productos: payasos y
	//muñecas. Suele hacer venta por correo y la empresa de logística les cobra
	//por peso de cada paquete así que deben calcular el peso de los payasos y
	//muñecas que saldrán en cada paquete a demanda. Cada payaso pesa 112
	//g y cada muñeca 75 g. Escribir un programa que lea el número de payasos
	//y muñecas vendidos en el último pedido y calcule el peso total del
	//paquete que será enviado.
	
	public static void juguetería() {
		Scanner jugueterScanner = new Scanner(System.in);
		
		System.out.println("Cuantos payasos vendiste en el último envío");
		int payasos = jugueterScanner.nextInt();
		System.out.println("Cuantos pmuñecas vendiste en el último envío");
		int muñecaString = jugueterScanner.nextInt();
		
		int pesoTotal = (payasos*112)+(muñecaString*75);
		System.out.println("El peso total fueron " +pesoTotal+ " g");
		jugueterScanner.close();
	}
	
	//10- Una panadería vende barras de pan a 3.49€ cada una. El pan que no es el
	//día tiene un descuento del 60%. Escribir un programa que comience
	//leyendo el número de barras vendidas que no son del día. Después el
	//programa debe mostrar el precio habitual de una barra de pan, el
	//descuento que se le hace por no ser fresca y el coste final total. Tal que
	//así:
	//“Precio original: 3.49€”
	//“Descuento del 60%: X.XX€”
	//“TOTAL: XX.XX€
	
	public static void panadería() {
		
		System.out.println("Precio original: 3,49€");
		double descuento = (3.49*60) / 100;
		double descuento2 = Math.round(descuento *100.0) / 100.0;
		
		System.out.println("Descuento del 60%: " +descuento2);
		double precioTotal = 3.49 - descuento2;
		
		BigDecimal decimal = new BigDecimal(precioTotal).setScale(2, RoundingMode.FLOOR);
		
		System.out.println("TOTAL: " +decimal);
		
		
	}

}
