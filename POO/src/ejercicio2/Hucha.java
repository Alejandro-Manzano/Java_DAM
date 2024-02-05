package ejercicio2;

public class Hucha {
	
	//int uno = 0;
	//int dos = 0;
	//int cinco = 0;
	//int diez = 0;
	//int veinte = 0;
	//int cincuenta = 0;
	
	boolean estaAbierta = true;

	String passwordString = "contraseña";
	
	//el valor dentro de los indices sera el numero de cada moneda
	int [] monedas = new int [2];
	
	//el valor dentro de los indices sera el numero de cada mondea
	int [] billetes = new int [4];
	
	public Hucha() {
		monedas[0] = 2;
		monedas[1] = 6;
		billetes[0] = 3;
	}
	
	public void retirarDinero(int dinero) {
		if (dinero <= 0) {
			System.out.println("introduzca un númro positivo");
		} else if (dinero > dineroTotal()) {
			System.out.println("No tienes suficiente dinero, se procederá a sacar todo el dinero que tengas");
			System.out.println("Retiraste " + dineroTotal()+ " $");
			vaciarCuenta();
		}
		
	}
	
	public void dineroHucha() {
		
		System.out.println("Tengo " + getMonedas()[0] + " monedas de 1$ ");
		System.out.println("Tengo " + getMonedas()[1] + " monedas de 2$ ");
		System.out.println("Tengo " + getBilletes()[0] + " billetes de 5$ ");
		System.out.println("Tengo " + getBilletes()[1] + " billetes de 10$ ");
		System.out.println("Tengo " + getBilletes()[2] + " billetes de 20$ ");
		System.out.println("Tengo " + getBilletes()[3] + " billetes de 50$ ");
		System.out.println("Tengo " + getMonedas() + " $ en la ducha ");
		
	}
	
	private void vaciarCuenta() {
		for (int moneda: monedas) {
			moneda = 0;
		}
		for (int billete : billetes) {
			billete=0;
		}
	}
	
	public void cambiarConstraseña(String passwordActual, String passwordNueva) {
		if (getPasswordString() == passwordActual) {
			this.passwordString = passwordNueva;
		} else {
			System.out.println("Contraseña incorrecta");
		}
	}
	
	public void abrirHucha(String passwotString) {
		
		if (isEstaAbierta() == true) {
			System.out.println("Ya está abierta burro");
		} else if (passwotString.equals(getPasswordString())) {
			setEstaAbierta(true);
		} else {
			System.out.println("Contraseá incorrecta");
		}
		
	}
	
	public void cerrarHucha(String passwotString) {
		
		if (isEstaAbierta() == false) {
			System.out.println("Ya está cerrado burro");
		} else if (passwotString.equals(getPasswordString())) {
			setEstaAbierta(false);
		} else {
			System.out.println("Contraseña incorrecta");
		}
		
	}
	
	private int dineroTotal() {
		int total = getMonedas()[0]*1 + getMonedas()[1]*2 + getMonedas()[0]*5 + 
				getBilletes()[1] + getBilletes()[2]*20 + getBilletes()[3]*50;
		return total;
	}
	
	
	public boolean isEstaAbierta() {
		return estaAbierta;
	}

	public void setEstaAbierta(boolean estaAbierta) {
		this.estaAbierta = estaAbierta;
	}

	public String getPasswordString() {
		return passwordString;
	}

	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}

	public int[] getMonedas() {
		return monedas;
	}

	public void setMonedas(int[] monedas) {
		this.monedas = monedas;
	}

	public int[] getBilletes() {
		return billetes;
	}

	public void setBilletes(int[] billetes) {
		this.billetes = billetes;
	}
	
}
