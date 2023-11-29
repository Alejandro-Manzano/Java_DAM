package Simples;

import java.util.Scanner;

public class Ejercicios_1 {

public static void main(String[] args) {


//1-
HM();

//2-
String holaMundoString = "¡Hola Mundo!";
seeHolaMundo(holaMundoString);

//3-
saludarNombre();

//4-
operacion();

//5-
horas();

//6-
enteros();

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

}
