package Lotería;

import java.util.Random;
import java.util.Scanner;

public class LoteríaNavidad {
	
	//1- Crear una variable global llamada “gordo” que almacenará los 5 primeros premios, que
	//son números enteros.
	static int [] gordo = new int[5];
	
	//2- Crear una variable global llamada “decimo” que almacenará un número entero.
	static int décimo;
	
	//3- Generar solamente getters para ambas variables globales y el setter de decimo.
	public static int[] getGordo() {
		return gordo;
	}

	public static int getDécimo() {
		return décimo;
	}

	public static void setDécimo(int a) {
		LoteríaNavidad.décimo = a;
	}

	//4-Crear el método “generarGordo” que rellene la variable gordo con 5 números
	//generados aleatoriamente de entre el 00000 al 99999.
	public static void generarGordo() {
		for (int i = 0; i < gordo.length; i++) {
			
			Random random = new Random();
			//Formula para generar un aleatorio entre 0 y 100000 exclusive
			int aleatorio = random.nextInt(100000);
			
			gordo[i] = aleatorio;
			
		}
	}
	
	//5- Crear el método printGordo() que al llamarlo muestre los 5 premios de la siguiente
	//manera
	
	public static void printGordo() {
		
		for (int i = 0; i < gordo.length; i++) {
			
			System.out.println("Premio " +i+ ": " +gordo[i]);
			
		}
	}
	
	//6- Crear el método “comprarDecimo” que pida por consola el número de décimo que se
	//desea comprar, pasárselo a la variable decimo llamando a setDecimo() y luego
	//muestre por pantalla en número comprado llamando al método getDecimo()
	
	public static void comprarDecimo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime que número de lotería quieres comprar");
		int decimo2 = scanner.nextInt();
		scanner.close();
		
		setDécimo(decimo2);
		
		System.out.println(getDécimo());
		
	}
	
	public static void main(String[] args) {
		generarGordo();
		printGordo();
		comprarDecimo();
		
	}
	
}

