package ejercicio2;

public class principalHucha {
	
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
	
	public principalHucha() {
		
	}
	
	public void dineroHucha() {
		
		System.out.println("Tengo " + getMonedas()[0] + " monedas de 1$ ");
		System.out.println("Tengo " + getMonedas()[1] + " monedas de 2$ ");
		
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
