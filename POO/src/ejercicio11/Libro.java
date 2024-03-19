package ejercicio11;

import java.util.ArrayList;

public class Libro {
	
	String titulo;
	ArrayList<Autor> autores = new ArrayList<Autor>();
	float precio;
	int stock;
	String gender;
	
	
	
	public Libro(String titulo, ArrayList<Autor> autores, float precio, int stock, String gender) {
		this.titulo = titulo; 
		this.autores = autores; 
		this.precio = precio;
		this.stock = stock;
		this.gender = gender;
	}
	
	
	public String toString() {
		return "título: " + getTitulo() + " -- autores: (" + autores.toString() + ")" +getPrecio()+ " -- " +getStock();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Autor> getAutores() {
		return autores;
	}

	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}