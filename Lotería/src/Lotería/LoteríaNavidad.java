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
		décimo = scanner.nextInt();
		scanner.close();
		
		//setDécimo(décimo);
		
		if (décimo >= 0 && décimo <=99999) {
			System.out.println("Tu número es " +getDécimo());
		} else {
			System.out.println("Introduce el número del 0 al 99999");
		}
		
	}
	
	//7- Crear el método comprobarPremiosAltos que muestre por pantalla las siguientes
	//frases según se cumplan:
	
	public static void comprobarPremiosAltos() {
		
			
			if (getDécimo() == gordo[0]) {
				System.out.println("400.000 euros");
			} 
			else if (getDécimo() == gordo[1]) {
				System.out.println("125.000 euros");
			}
			else if (getDécimo() == gordo[2]) {
				System.out.println("50.000 euros");
			}
			else if (getDécimo() == gordo[3]) {
				System.out.println("20.000 euros");
			}
			else if (getDécimo() == gordo[4]) {
				System.out.println("6.000 euros");
			}
			else if (getDécimo() == gordo[0]-1 || getDécimo() == gordo[0]+1) {
				System.out.println("2000 euros");
			}
			else if (getDécimo() == gordo[1]-1 || getDécimo() == gordo[1]+1) {
				System.out.println("1250 euros");
			}
			else if (getDécimo() == gordo[2]-1 || getDécimo() == gordo[2]+1) {
				System.out.println("960 euros");
			} else {
				System.out.println("No tienes premio");
			}
		
	}
	
	
	
	
	//EX1: Modificar crear el método comprarDecimo2() que compruebe lo que sea que el usuario
	//escriba por consola y si lo que introdujo no es un número del 0 al 99999 que vuelva a
	//preguntar por el décimo que se quiera comprar, después de avisar al usuario, tal que así:
	
	//EX2: modificar el método comprobarPremiosAltos para que devuelva un booleano, y en el caso
	//de que sea falso, se llame al método comprobarPremiosBajos. Este método mostrará las
	//siguientes frases según se cumplan:
	//Centenas del 1.º, 2.º, 3.er y 4.º premio: 100 euros
	//Números que coinciden con las dos últimas cifras del 1.º, 2.º y 3.er premio: 100 euros
	//Reintegro (números que terminan en la misma cifra que el Gordo): 20 euro
	//Si no se da ninguno de los casos anteriores, imprimir &quot;Qué mala suerte tienes, ni se te ocurra
	//jugar&quot;
	
	//8-En el método main llamar a los métodos generarGordo(), printGordo() y
	//comprarDecimo(), en ese mismo orden.
	
	public static void main(String[] args) {
		generarGordo();
		printGordo();
		comprarDecimo();
		comprobarPremiosAltos();
		
	}
	
}

