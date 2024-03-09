package ejercicio10;

public class Pokemon {
	String nombre;
	String elemento;
	int ps;
	
	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", elemento=" + elemento + ", ps=" + ps + "]";
	}

	public Pokemon(String nombre, String elemento, int ps) {
		this.nombre = nombre;
		this.elemento = elemento;
		this.ps = ps;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getElemento() {
		return elemento;
	}
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	
	
}