package Clase8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1-
		//ex1();
		
		//2-
		//ex2();
		
		//3-
		//ex3();
		
		//4-
		//int numerosGanadores[] = {22678, 22445, 46789};
		//ex04(numerosGanadores[0], numerosGanadores[1], numerosGanadores[2]);
		
		//5-
		//ex05();
		
		//6-
		//ex06();
		
	}
	
	//1- Escribir un programa que almacene las asignaturas de un curso (por
	//ejemplo: Matemáticas, Física, Química, Historia y Lengua) en un array y la
	//muestre por pantalla. Las asignaturas deberán introducirse por consola en
	//una misma línea, separadas por espacios.
	
	public static void ex1() {
		
		String asignaturas[] = {"Física", "Química", "Historia", "Lengua"};
		
		for (int i = 0; i < asignaturas.length; i++) {
			System.out.print(asignaturas[i] + " ");
		}
		
	}
	
	
	//2- Copia y pega el ejercicio anterior y haz los cambios pertinentes para que
	//imprima por pantalla “Yo estudio asignatura;, donde ;asignatura; es
	//cada una de las asignaturas almacenadas en el array.
	
	public static void ex2() {
		
		String asignaturas[] = {"Física", "Química", "Historia", "Lengua"};
		
		for (int i = 0; i < asignaturas.length; i++) {
			System.out.println("Yo estudio " +asignaturas[i]);
		}
		
	}
	
	//3-Modifica el programa anterior para que te pregunte “¿Qué nota sacaste
	//en &lt;asignatura&gt;?, el usuario introduzca la nota, y finalmente imprima por
	//pantalla: “Sacaste un &lt;nota&gt; en &lt;asignatura&gt;”.

	
	public static void ex3() {
		
		String asignaturas[] = {"Física", "Química", "Historia", "Lengua"};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < asignaturas.length; i++) {
			
			System.out.println("Que nota sacaste en " +asignaturas[i]);
			int respuesta = scanner.nextInt();
			System.out.println("Has sacado un " +respuesta+ " en " +asignaturas[i]);
		}
		
		scanner.close();
		
	}
	
	//4- Escribir un programa en el que se le pase en la llamada al método los 3
	//números ganadores de la lotería, los almacene en un array, y los muestre
	//por pantalla ordenados de menor a mayor. (Hay que usar una clase de
	//java.util)
	
	public static void ex04(int x, int y, int z) {
		
		int[] ganadores = new int[3];

		ganadores[0] = x;
		ganadores[1] = y;
		ganadores[2] = z;
		
		
		Arrays.sort(ganadores);
		
		//Esto imprime todo el array directamente
		System.out.println("Números ganadores ordenados de menor a mayor: " + Arrays.toString(ganadores));
		
	}
	
	//5 - Escribir un programa que cree e inicialice un array con los números del 1 al
	//10 y los muestre por pantalla en orden inverso separados por comas. (Hay
	//que usar dos clases de java.util)
	
	public static void ex05() {
		Integer[] numbers = new Integer[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		//1ª opción
		//for (int i = numbers.length-1; i >=0; i--) {
			//System.out.print(numbers[i] + ", ");
		//}
		
		//2ª opción
		//Lo imprimo del reves con el método Collections.reverseOrder()
		Arrays.sort(numbers, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(numbers));
	}
	
	//6- Escribe un programa que en el que cree un array bidimensional cuyo
	//número de filas y columnas se le pase al método en la llamada. El método
	//rellenará el array con números aleatorios (del 0 a 9). Finalmente, debe
	//imprimir la tabla tal que así
	//0123
	//1234
	//2345
	
	public static void ex06() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime el número de filas");
		int filas = scanner.nextInt();
		
		System.out.println("Dime el número de columnas");
		int columnas = scanner.nextInt();
		
		int [][] aleatorios = new int [filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				
				//Genero un número aleatorio hasta el 9
				Random random = new Random();
				int numeroAleatorio = random.nextInt(10);
				
				System.out.print(aleatorios[i][j] = numeroAleatorio);
				
			}
			System.out.println();
		}
		scanner.close();
	}
	
	//7- Usando un array bidimensional, escribir un programa que almacena las
	//asignaturas de un curso en el array, y luego pregunte al usuario por su
	//nota y, finalmente, el programa muestre por pantalla solo las asignaturas
	//que el usuario deba repetir.
	
	public static void ex07() {
		
	}
	
}
