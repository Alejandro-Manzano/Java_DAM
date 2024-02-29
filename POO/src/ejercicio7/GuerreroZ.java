package ejercicio7;

public class GuerreroZ {
	String nombre;

	boolean esSaiyan;
	int vida, velocidad, ki, fuerza, defensa;
	static final int KI_MAX = 100;
	
	public void atacar(Enemigo enemigo) {
		
	}
	
	public void kamehameHa(Enemigo enemigo) {
		
	}
	
	public void trasformarse() {
		
		if (esSaiyan==true) {
			System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		}
		
	}
	
	public void  cargarKi() {
		setKi(KI_MAX);
	}
	
	public GuerreroZ (String nombre, boolean esSaiyan, int vida,int velocidad,int ki,int fuerza,int defensa) {
		
		setNombre(nombre);
		setEsSaiyan(esSaiyan);
		setVida(vida);
		setVelocidad(velocidad);
		setKi(ki);
		setFuerza(fuerza);
		setDefensa(defensa);
	}
	
	public GuerreroZ (String nombre, int vida,int velocidad,int ki,int fuerza,int defensa) {
		
		esSaiyan = true;
		
		setNombre(nombre);
		setVida(vida);
		setVelocidad(velocidad);
		setKi(ki);
		setFuerza(fuerza);
		setDefensa(defensa);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "GuerreroZ [nombre=" + nombre + ", esSaiyan=" + esSaiyan + ", vida=" + vida + ", velocidad=" + velocidad
				+ ", ki=" + ki + ", fuerza=" + fuerza + ", defensa=" + defensa + "]";
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean isEsSaiyan() {
		return esSaiyan;
	}
	
	public void setEsSaiyan(boolean esSaiyan) {
		this.esSaiyan = esSaiyan;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public int getKi() {
		return ki;
	}
	
	public void setKi(int ki) {
		this.ki = ki;
	}
	
	public int getFuerza() {
		return fuerza;
	}
	
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
	public int getDefensa() {
		return defensa;
	}
	
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	public static int getKiMax() {
		return KI_MAX;
	}
}
