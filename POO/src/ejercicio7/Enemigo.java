package ejercicio7;

public class Enemigo {
	 String nombre;
	 boolean esAndroide;
	 int vida, velocidad, ki, fuerza, defensa;
	 static final int KI_MAX = 100;
	 
	 public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEsAndroide() {
		return esAndroide;
	}

	public void setEsAndroide(boolean esAndroide) {
		this.esAndroide = esAndroide;
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

	public void atacar(GuerreroZ guerreroz) {
			
	 }
	 
	 public void OndaKi(GuerreroZ guerreroz) {
		 
	 }
	 
	 public void Transformarse() {
		 if (nombre.equals("Cell"));
	 }
	 
	 public void cargarKi() {
		 setKi(KI_MAX);
	 }
	 
	public Enemigo(String nombre, boolean esAndroide, int vida, int velocidad, int ki, int fuerza, int defensa) {
		setNombre(nombre);
		setEsAndroide(esAndroide);
		setVida(vida);
		setVelocidad(velocidad);
		setKi(ki);
		setFuerza(fuerza);
		setDefensa(defensa);
	}
	
	public Enemigo() {
		setNombre("Cell Jr");
		setEsAndroide(false);
		setVida(500);
		setVelocidad(150);
		setKi(KI_MAX);
		setFuerza(150);
		setDefensa(60);
	}
}

