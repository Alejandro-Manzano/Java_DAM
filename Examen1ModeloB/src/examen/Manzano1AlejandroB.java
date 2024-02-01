package examen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Manzano1AlejandroB {

	public static void main(String[] args) {
		
		ex01();
		
		//ex02();
		
		//ex03();
		
		//ex04();
		
		//ex05();
		
		//ex06();

	}
	
	//1-
	public static void ex01() {
		
        double div = 1234.0;
        double divisor = 532.0;
        
        double res = div / divisor;
        res = Math.round(res * 100000000000.0) / 100000000000.0;

        System.out.println("1234 / 532 = " + res);
	}
	
	//2-
	public static void ex02() {
		int velocidadInicial = 5;
		int aceleración = 2;
		int espacioInicial = 5;
		int tiempoCuadrado = 10*10;
		
		int S = (velocidadInicial+espacioInicial + (aceleración*tiempoCuadrado)/2);
		System.out.println(S);
		
	}
	
	public static void ex03() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime la n");
		int n = scanner.nextInt();

		 
		double [] array = new double [n];
		array [0] = 1;
		
		double constante = 0.5;
		double sumaTotal = 1;
		
		for (int i = 1; i < array.length; i++) {
			array[i] = (array[i-1]) * constante;
			sumaTotal += array[i];
		}
		
		System.out.println("Array completo " + Arrays.toString(array));
		System.out.println("Suma de los primeros " +n+ " términos " +sumaTotal);
		
		scanner.close();
	}
	
	public static void ex04() {
		
		int [] array = new int [20];
		
		for (int i = 0; i < array.length; i++) {
			
			int aleatorio = (int) Math.floor(Math.random() * 41) + 10;
			array[i] = aleatorio;
			
		}
		
		Arrays.sort(array);
		
		System.out.println("El array completo es " + Arrays.toString(array));
		System.out.println("El mayor número es " + array[19] + " y está en la posición 19");
		
	}
	
	public static void ex05() {
		
		Random aleatorio = new Random();
		int numeroAleatorio = aleatorio.nextInt(101);
		
		Scanner scanner = new Scanner(System.in);
		
		int acc = 0;
		System.out.println(numeroAleatorio);
		
		while (true) {
			
			System.out.println("Escribe un número entre 1 y 100");
			int aleatorio2 = scanner.nextInt();
			
			if (numeroAleatorio - aleatorio2 > 40 || aleatorio2 -numeroAleatorio > 40) {
				if(numeroAleatorio > aleatorio2) {
					System.out.println("Te congelas tu número es menor");
				}
				if (numeroAleatorio < aleatorio2) {
					System.out.println("Te congelas tu número es mayor");
				}				
			}
			else if (numeroAleatorio - aleatorio2 > 30 || aleatorio2 -numeroAleatorio > 30) {
				if(numeroAleatorio > aleatorio2) {
					System.out.println("Frío tu número es menor");
				}
				if (numeroAleatorio < aleatorio2) {
					System.out.println("Frío tu número es mayor");
				}
			}
			else if (numeroAleatorio - aleatorio2 >= 21 || aleatorio2 -numeroAleatorio >= 21) {
				if(numeroAleatorio > aleatorio2) {
					System.out.println("Templadito, templadito tu número es menor");
				}
				if (numeroAleatorio < aleatorio2) {
					System.out.println("Templadito, templadito tu número es mayor");
				}
			}
			else if (numeroAleatorio - aleatorio2 >= 11 || aleatorio2 -numeroAleatorio >= 11) {
				if(numeroAleatorio > aleatorio2) {
					System.out.println("Caliente, caliente tu número es menor");
				}
				if (numeroAleatorio < aleatorio2) {
					System.out.println("Caliente, caliente tu número es mayor");
				}
			}else {
				if(numeroAleatorio > aleatorio2) {
					System.out.println("Te quemas tu número es menor");
				}
				if (numeroAleatorio < aleatorio2) {
					System.out.println("Te quemas tu número es mayor");
				}
			} 
			
			acc++;
			
			if (numeroAleatorio == aleatorio2) {
				System.out.println("Felicidades ganaste, lo intentaste " +acc+ " veces");
				break;
			}
			
		}
		scanner.close();
	}
	
	public static void ex06() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número 1");
		int n1 = scanner.nextInt();
		
		System.out.println("Introduce el número 2");
		int n2 = scanner.nextInt();
		
		int [] array1 = new int[1000];
		int [] array2 = new int[1000];
		scanner.close();
		
		int x = 1;
		int y = 1;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = n1*x;
			x++;
		}
		for (int i = 0; i < array2.length; i++) {
			array2[i] = n2*y;
			y++;
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
			for (int i = 0; i < array2.length; i++) {
				for (int j = 0; j < array1.length; j++) {
					if (array1[i] == array2[j]) {
						System.out.println(array1[i]);
						break;
					}
				}
			}
			
			
			
	}

}
