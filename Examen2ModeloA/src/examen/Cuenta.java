package examen;

public class Cuenta {

	private String dni;
	private int numeroDeCuenta;
	private double dineros;
	private int pin;
	
	
	public Cuenta(String dni, int numeroDeCuenta, double dineros, int pin) {
		this.dni = dni;
		this.numeroDeCuenta = numeroDeCuenta;
		this.dineros = dineros;
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "DNI del propietario de la cuenta: " +getDni()+ " Número de cuenta: " +getNumeroDeCuenta()+ " Dinero en la cuenta " +getDineros()+ "$ Pin de la cuenta: " +getPin();
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getNumeroDeCuenta() {
		return numeroDeCuenta;
	}
	public void setNumeroDeCuenta(int numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}
	public double getDineros() {
		return dineros;
	}
	public void setDineros(double dineros) {
		this.dineros = dineros;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
