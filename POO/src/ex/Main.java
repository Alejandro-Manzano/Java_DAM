package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Automovil>juanjogay = new ArrayList<Automovil>();

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cuantos coches quieres crear puta?");
		int crear = scanner.nextInt();
		
		for (int i = 1; i <= crear; i++) {
			
			System.out.println("Que modelo de coche quieres");
			String modeloString = scanner.next();
			
			System.out.println("Que capacidad tiene tu coche?");
			int capacidad = scanner.nextInt();
			
			System.out.println("Cuanto combustible tienes ahora mismo ?");
			double combustibleActual = scanner.nextDouble();
			
			System.out.println("Cuanto consume el coche ?");
			double consumo = scanner.nextDouble();
			
			Automovil coche = new Automovil(modeloString, capacidad, combustibleActual, consumo);
			juanjogay.add(coche);
			
		}
		
		
		for (int i = 0; i < juanjogay.size(); i++) {
			
			System.out.println(juanjogay.get(i).toString());
			
		}
		
		
		System.out.println("Cuantos litros quieres echar ?");
		double l = scanner.nextDouble();
		juanjogay.get(0).llenarDeposito(l);
		
		System.out.println("Cuantos km quieres desplazarte ?");
		double km = scanner.nextDouble();
		juanjogay.get(0).desplazar(km);
		
	}

}
