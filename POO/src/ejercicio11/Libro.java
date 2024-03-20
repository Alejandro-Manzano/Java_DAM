package ejercicio11;

import java.util.ArrayList;

public class Libro {
	
	String titulo;
	String autor;
	float precio;
	int stock;
	String gender;
	
	
	public Libro(String titulo, String autor, float precio, int stock, String gender) {
		this.titulo = titulo; 
		this.autor = autor; 
		this.precio = precio;
		this.stock = stock;
		this.gender = gender;
	}
	
	
	public String toString() {
		return "título: " + getTitulo() + " -- autores:" + getAutor() + " -- precio: " +getPrecio()+ " -- " +getStock() + " -- gender:" +getGender();
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
}