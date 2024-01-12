package Clase8;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1-
		//ex1();
		
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

}
