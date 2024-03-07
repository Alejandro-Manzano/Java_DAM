package ejercicio8;

public class Automovil extends Main {
	
	String modelo;
	int capacidad;
	double combustibleActual;
	double consumo;
	int kilometrosRecorridos;
	int combustibleConsumido;
	
	public Automovil(String modelo, int capacidad, double combustibleActual, double consumo) {
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.combustibleActual = combustibleActual;
		this.consumo = consumo;
		setKilometrosRecorridos(0);
		setCombustibleConsumido(0);
	}
	
	public Automovil(String modelo, int capacidad, double consumo) {
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.consumo = consumo;
		setCombustibleActual(getCapacidad());
		setKilometrosRecorridos(0);
		setCombustibleConsumido(0);
	}
	
	public void llenarDepositoAlMaximo() {
		if (getCapacidad() == getCombustibleActual()) {
			System.out.println("Ya tienes el depósito lleno");
		} else {
			double litrosAllenar = capacidad - combustibleActual;
			System.out.println("Tenias " +getCombustibleActual()+ " y has llenado al maximo, (" +getCapacidad()+ "L) has echado " +litrosAllenar+ " l");
			setCombustibleActual(litrosAllenar);
		}
	}
	
	public void llenarDeposito(double litros) {
		double total = litros + getCombustibleActual();
		if (total > getCapacidad()) {
			double sobra = total - getCapacidad();
			System.out.println("Has llenado el depósito al máximo y te sobran " +sobra+ " litros");
			setCombustibleActual(getCapacidad());
		} else if (total <= getCapacidad()) {
			System.out.println("Has echado " +litros+ " L a tu " +getModelo()+ " y ahora el deposito tiene " +total+ " L / " +getCapacidad()+ " L de capacidad");
			setCombustibleActual(total);
		}
	}
	
	public void desplzar(double kmARecorrer) {
		double puedeRecorrer = (combustibleActual/consumo) * 100;
		double combustibleNecesario = (consumo*kmARecorrer) / 100;
		if (puedeRecorrer < kmARecorrer) {
			System.out.println("Solo tienes " +combustibleActual+ "L para hacer " +kmARecorrer+ " km y necesitas " +combustibleNecesario+ " L");
		} else if (puedeRecorrer > kmARecorrer) {
			double meQueda = combustibleActual-combustibleNecesario;
			System.out.println("Has necesitado " +combustibleNecesario+ " L para hacer los " +kmARecorrer+ " km con tu " +getModelo()+ " y ahora tienes " +meQueda+ " L");
			setCombustibleActual(meQueda);
		}
	}
	
	@Override
	public String toString() {
		return "modelo: " +getModelo()+ ", capacidad: " +getCapacidad()+ "L , combustible actual: " +getCombustibleActual()+ "L , consumo: " +getConsumo()+ "L";
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

	public double getCombustibleActual() {
		return combustibleActual;
	}

	public void setCombustibleActual(double combustibleActual) {
		this.combustibleActual = combustibleActual;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	public int getCombustibleConsumido() {
		return combustibleConsumido;
	}

	public void setCombustibleConsumido(int combustibleConsumido) {
		this.combustibleConsumido = combustibleConsumido;
	}
}
