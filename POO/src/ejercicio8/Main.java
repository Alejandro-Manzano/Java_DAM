package ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Automovil>automoviles = new ArrayList<Automovil>();
		
		
		//cocheAutomovil.desplzar(300);
		//cocheAutomovil.llenarDeposito(15);
		//cocheAutomovil.desplzar(300);
		//cocheAutomovil.desplzar(100);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cuantos coches quieres crear ?");
		int index = scanner.nextInt();
		
		for (int i = 0; i < index; i++) {
			
			System.out.println("Que modelo de coche quieres");
			String modelo = scanner.next();
			System.out.println("Que capacidad tiene el deposito?");
			int capacidad = scanner.nextInt();
			System.out.println("Cuanto combustble hay actualmente?");
			double combustibleActual = scanner.nextDouble();
			System.out.println("Cuanto consume el coche?");
			double consumo = scanner.nextDouble();
			
			Automovil cocheAutomovil = new Automovil(modelo, capacidad, combustibleActual, consumo);
			automoviles.add(cocheAutomovil);
			
		}
		
		for (Automovil automovil : automoviles) {
			System.out.println(automovil.toString());
		}
	}

}
