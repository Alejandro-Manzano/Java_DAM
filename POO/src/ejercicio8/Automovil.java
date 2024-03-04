package ejercicio8;

import java.util.Scanner;

public class Automovil {
	
	String modelo;
	int capacidad;
	int combustible;
	double consumo;
	int kilometros;
	int combustibleConsumido;
	
	public Automovil(String modelo, int capacidad, int combustible, double consumo, int kilometros, int combustibleConsumido) {
		setModelo(modelo);
		setCapacidad(capacidad);
		setCombustible(combustibleConsumido);
		setConsumo(consumo);
		setKilometros(0);
		setCombustibleConsumido(0);
	}
	
	public Automovil(String modelo, int capacidad, double consumo) {
		setModelo(modelo);
		setCapacidad(capacidad);
		setCombustible(getCapacidad());
		setConsumo(consumo);
		setKilometros(0);
		setCombustibleConsumido(0);
	}
	
	public void llenarDeposito() {
		setCombustible(getCapacidad());
		System.out.println("Depósito lleno a " + getCombustible());
	}
	
	public void llenarDeposito2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cuantos L deseas llenar?");
		combustible = scanner.nextInt();
		
		if (combustible > getCapacidad()) {
			System.out.println("Deposito lleno y sobra " + getCombustible()-getCapacidad());
		}
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getCombustible() {
		return combustible;
	}
	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public int getKilometros() {
		return kilometros;
	}
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	public int getCombustibleConsumido() {
		return combustibleConsumido;
	}
	public void setCombustibleConsumido(int combustibleConsumido) {
		this.combustibleConsumido = combustibleConsumido;
	}
	
	
}
