package examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

	Scanner scanner = new Scanner(System.in);
	private ArrayList<Cliente>clientes = new ArrayList<Cliente>();
	private String nombreBanco;
	
	public Banco(String nombreBanco) {
		
		this.nombreBanco = nombreBanco;
		
	}
	
	//método para buscar clientes
	public void buscarClietes() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Como se llama el cliente ?");
		String clienteBuscadoString = scanner.next();
		
		boolean creado = false;
		for (Cliente cliente : clientes) {
			
			if (cliente.getNombre().equals(clienteBuscadoString)) {
				System.out.println(cliente.toString());
				creado = true;
			}
			
		}
		if (creado == false) {
			System.out.println("Cliente no encontrado");
		}
		scanner.close();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
		
	
	
}
