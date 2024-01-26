package Exámen;

import java.util.Arrays;
import java.util.Random;

public class Repaso {

	public static void main(String[] args) {
		
		//ex01();
		ex02();

	}
	
	//1- En una clase llamada Ejercicio1 escribe un programa que realice las acciones siguientes definiendo, además del método main, todos los métodos adicionales que se consideren necesarios:

	//Almacenar en una variable de tipo long un número aleatorio comprendido entre dos valores cualesquiera usando la clase Math.
	//Sin convertir el número a cadena, determinar si el número obtenido me gusta. Un número sólo me gusta si:
	//La suma de los dígitos cuyo valor es impar es mayor que la suma del resto de dígitos.
	//No se cumple la condición anterior, pero el número es impar y la suma de todos sus dígitos también lo es.
	//Almacenar en un array de caracteres cada uno de los dígitos del número sin usar sentencias repetitivas.
	//Mostrar en la consola los resultados obtenidos en cada uno de los apartados anteriores.
	
	public static void ex01() {
			
		//Generar número aleatorio
		long numero = (long) Math.floor(Math.random() * 1000000000L);

        boolean gusta = false;
        int sumaImpares = 0;
        int sumaPares = 0;
        for (int i = 0; i < Long.toString(numero).length(); i++) {
            int digito = Long.toString(numero).charAt(i) - '0';
            if (digito % 2 == 1) {
                sumaImpares += digito;
            } else {
                sumaPares += digito;
            }
        }
        if (sumaImpares > sumaPares) {
            gusta = true;
        } else if (sumaImpares == sumaPares && numero % 2 == 1) {
            gusta = true;
        }

        // Almacenar los dígitos del número
        char[] digitos = Long.toString(numero).toCharArray();
		
	}
	
	//2- En una clase llamada Ejercicio2 escribe un programa Java que realice las acciones siguientes definiendo, además del método main,
	//todos los métodos adicionales que se consideren necesarios:
	//Crear un array de un tamaño aleatorio entre 10 y 50.
	//Usando la clase Math, almacenar en el array números aleatorios comprendidos entre -1000 y 1000 y con una precisión de dos decimales.
	//Obtener el resultado de procesar el contenido del array de la forma siguiente:
	//Se sumarán los valores almacenados comenzando desde la posición cero en adelante.
	//Si en cualquier momento del proceso de cálculo de la suma ésta supera la mitad del valor máximo posible, el resultado final será el 33,33% 
	//del valor obtenido hasta ese momento, y no se sumarán el resto de los números almacenados en el array.
	//Si no se produce la situación anterior, el resultado final será el 66,66% de la suma obtenida.

	
	public static void ex02() {
		
		//Número aleatorio paar el array , random genera entre 0 y 1 , floor lo redondea y 41 lo ultiplica
		int tamañoArray = (int) Math.floor(Math.random() * 41) + 10;
		
		int [] array = new int[tamañoArray];
		
		int sumaNumeros = 0;

		for (int i = 0; i < array.length; i++) {
			
			//Número aleatorio en -1000 y 1000
			int numAleatorio = (int)Math.floor(Math.random() * 2001) -1000;
			
			array[i] = numAleatorio;
			sumaNumeros += array[i];
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(sumaNumeros);
	}
	
	//3- En una clase llamada Ejercicio3 escribe un programa Java que lea de la consola una secuencia de cadenas y la procese según las especificaciones siguientes:

	//Una vez leída la secuencia, se mostrará de nuevo en la consola imprimiendo cada palabra en una línea y en orden alfabético.
	//Cada palabra irá acompañada en la misma línea de un cifrado que se obtendrá con un método llamado cifrar de la forma siguiente:
	//Cada vocal se multiplica por la longitud de la cadena.
	//Cada consonante se divide por la longitud de la cadena.
	//Se suman todos los resultados obtenidos y esa será el resultado del cifrado.
	//Para llevar a cabo la lectura de los datos que el usuario escribe en la consola se asumen los supuestos siguientes:

	//En la primera línea el usuario escribe el número N de palabras que escribirá a continuación.
	//En la primera línea siempre escribe un número entero y nunca se equivoca.
	//A continuación, escribe N palabras, cada una en una nueva línea.
	//El usuario no está obligado a introducir las palabras en orden alfabético.
	//No escribirá más palabras de las especificadas.
	//La solución del problema deberá estar basada en el uso de las clases Integer, String y Arrays.
	
	public static void ex03() {
		
	}
}
