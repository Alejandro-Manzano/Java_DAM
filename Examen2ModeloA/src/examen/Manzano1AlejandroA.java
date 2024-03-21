package examen;

import java.util.Scanner;

public class Manzano1AlejandroA {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Cuenta cuenta1 = new Cuenta("897865D", 1234, 245000, 1234);
		Cuenta cuenta2 = new Cuenta("345656K", 4321, 234000, 1234);
		
		Cliente cliente1 = new Cliente("Alex", "897865D", cuenta1);
		Cliente cliente2 = new Cliente("Javi", "345656K", cuenta2);
		
		//métodos para poner a prueba cliente 1
		
		System.out.println("Cuanto dinero quieres sacar ?" +cliente1.getNombre());
		int dinero = scanner.nextInt();
		cliente1.sacarDinero(dinero);
		
		System.out.println("Cuanto dinero quieres meter ?");
		int dinero2 = scanner.nextInt();
		cliente1.meterDinero(dinero2);
		
		System.out.println("Cuanto dinero quieres sacar ?" +cliente2.getNombre());
		int dinero3 = scanner.nextInt();
		cliente1.sacarDinero(dinero3);
		
		System.out.println("Cuanto dinero quieres meter ?");
		int dinero4 = scanner.nextInt();
		cliente1.meterDinero(dinero4);
		
		//Introduzco al banco los clientes
		Banco sabadellBanco = new Banco("Sabadell");
		sabadellBanco.getClientes().add(cliente1);
		sabadellBanco.getClientes().add(cliente2);
		
		//metodo para buscar clientes
		sabadellBanco.buscarClietes();
		
		//tranferencia
		cliente1.transferencia(cliente2, 200);
		cliente2.transferencia(cliente1, 200);
		scanner.close();
	}
	
}
