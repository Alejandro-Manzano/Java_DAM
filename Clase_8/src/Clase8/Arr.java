package Clase8;

import java.util.Arrays;
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
		int numerosGanadores[] = {22678, 22445, 46789};
		ex04(numerosGanadores[0], numerosGanadores[1], numerosGanadores[2]);
		
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
}
