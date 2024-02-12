package ejercicio4;

import java.util.ArrayList;

import ejercicio3.Autor;

public class Libro {
	String titulo;
	ArrayList<Autor> autores = new ArrayList<Autor>();
	float precio;
	int stock = 0;
	
	public Libro(String t, ArrayList<Autor> as, float p) //constructor 1 con 3 parametros
	{
		titulo = t; //aquí usamos asignación
		autores = as; //aquí usamos asignación
		setPrecio(p); //aquí usamos un setter
		setStock(10); //valor por defecto, por ejemplo
	}
	public Libro(String t, ArrayList<Autor> as, float p, int s) //constructor 2 con 4 parametros
	{
		titulo = t; //aquí usamos asignación
		autores = as; //aquí usamos asignación
		setPrecio(p); //aquí usamos un setter
		setStock(s); //aquí usamos un setter
	}
	
	//toString
	@Override
	public String toString() {
		System.out.println(getTitulo() + " (" + autores.toString() + ") " +
		getPrecio() + " € - " + getStock());
		return "";
	}
	
	
	
	//getters
	public String getTitulo() {
		return titulo;
	}
	public ArrayList<Autor> getAutores() {
		return autores;
	}
	public float getPrecio() {
		return precio;
	}
	public int getStock() {
		return stock;
	}
	
	//setters para precio y stock
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
