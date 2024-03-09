package ejercicio9;

public class Pokemon {

	String nombre;
	String elementoFundamental;
	int puntosDeSalud;
	
	public Pokemon(String nombre, String elementoFundamental, int puntosDeSalud) {
		this.nombre = nombre;
		this.elementoFundamental = elementoFundamental;
		this.puntosDeSalud = puntosDeSalud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getElementoFundamental() {
		return elementoFundamental;
	}

	public void setElementoFundamental(String elementoFundamental) {
		this.elementoFundamental = elementoFundamental;
	}

	public int getPuntosDeSalud() {
		return puntosDeSalud;
	}

	public void setPuntosDeSalud(int puntosDeSalud) {
		this.puntosDeSalud = puntosDeSalud;
	}
	
	@Override
	public String toString() {
		return "nombre pokemon: " +getNombre()+ " elemento pokemon: " +getElementoFundamental()+ " salud pokemon: " +getPuntosDeSalud();
				
	}
	
}
