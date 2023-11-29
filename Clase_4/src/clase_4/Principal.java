package clase_4;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		probarIf(7, 9);
		contarHasta10();
		genAl(9, 30);
		aleatorio2();
	}
	
	//Bucle for
	public static void probarIf(int a, int b) {
		
		if (a>b) {
			System.out.println("a mayor q b");
		} else if (a==b) {
			System.out.println("Iguales");
		} else {
			System.out.println("a menor q b");
		}
		
	}
	
	public static void contarHasta10() {
		int c = 1;
		int limite = 10;
		while (c <= limite) {
			System.out.println(c + " ");
			
		}
		for (int j = 1; j<=limite; j++) {
			System.out.println(j + " ");
			
		}
	}
	
	//Generar nº aleatorios
	public static void genAl(int minimo, int maximo) {
		Random alteaRandom = new Random();
		int ran = alteaRandom.nextInt((maximo-minimo)+1)+minimo;
		System.out.println(" " + ran);
	}
	
	//aleatorio entre clqr
	public static void aleatorio2() {
		Scanner scannerP = new Scanner(System.in);
		System.out.println("Máximo");
		int max = scannerP.nextInt();
		System.out.println("Mínimo");
		int min = scannerP.nextInt();
		genAl(min, max);
	}
	
}
