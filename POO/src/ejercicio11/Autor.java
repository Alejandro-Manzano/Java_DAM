package ejercicio11;

public class Autor {
	
	String nombre;
	String email;
	String genero;

	public Autor(String nombre, String email, String genero){
		setNombre(nombre);
		setEmail(email);
		setGenero(genero);	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}