package ex;

public class Automovil {

	String modelo;
	int capacidad;
	double combustibleActual;
	double consumo;
	int kmRecorridos;
	double combustibleConsumido;
	
	public Automovil(String modelo, int capacidad, double combustibleActual, double consumo) {
		
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.combustibleActual = combustibleActual;
		this.consumo = consumo;
		setKmRecorridos(0);
		setCombustibleConsumido(0);
		
	}
	
	public Automovil(String modelo, int capacidad, double consumo) {
		
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.consumo = consumo;
		setCombustibleActual(0);
		setKmRecorridos(0);
		setCombustibleConsumido(0);
		
	}
	
	public void llenarDepositoHastaElLimite() {
		
		if (combustibleActual >= capacidad) {
			System.out.println("El deposito ya esta lleno");
		} else {
			double loQueFaltaDeDeposito = capacidad - combustibleActual;
			double llenoDelTodo = combustibleActual + loQueFaltaDeDeposito;
			System.out.println("Deposito lleno, tienes " +llenoDelTodo+ " L");
			setCombustibleActual(llenoDelTodo);
		}	
	}
	
	public void llenarDeposito(double litros) {
		
		double llenar = combustibleActual + litros;
		
		if (llenar > capacidad) {
			
			double resto = llenar - capacidad;
			System.out.println("El deposito esta lleno y te sobran " +resto);
			
		} else if (llenar < capacidad) {
			double falta = capacidad - llenar;
			
			System.out.println("Tienes ahora " +llenar+ " L, te falta " +falta);
			setCombustibleActual(llenar);
		}	
	}
	
	public void desplazar(double km) {
		//lo km que puedo recorrer con el combustible actual
		double puedeRecorrer = (combustibleActual/consumo) * 100;
		//cuanto combustible necesito para hacer los km q le paso
		double combustibleNecesario = (consumo*km) / 100;
		if (puedeRecorrer < km) {
			System.out.println("Solo tienes " +combustibleActual+ "L para hacer " +km+ " km y necesitas " +combustibleNecesario+ " L");
		} else if (puedeRecorrer > km) {
			double meQueda = combustibleActual-combustibleNecesario;
			System.out.println("Has necesitado " +combustibleNecesario+ " L para hacer los " +km+ " km con tu " +getModelo()+ " y ahora tienes " +meQueda+ " L");
			//cambio el combustible Actual a los L q te qedan
			setCombustibleActual(meQueda);
		}
	}
	
	public String toString() {
		return "modelo: " +getModelo()+ " capacidad: "  +getCapacidad()+ " combustible actual: " +getCombustibleActual()+ " consumo: " +getConsumo();
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

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public double getCombustibleConsumido() {
		return combustibleConsumido;
	}

	public void setCombustibleConsumido(double combustibleConsumido) {
		this.combustibleConsumido = combustibleConsumido;
	}
	
	
	
}
