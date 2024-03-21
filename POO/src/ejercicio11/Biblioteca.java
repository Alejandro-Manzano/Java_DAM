package ejercicio11;

import java.util.ArrayList;

public class Biblioteca {

	 private ArrayList<Libro> libros;

	 public Biblioteca() {
	        this.libros = new ArrayList<>();
	 }

	   
	 public void agregarLibro(Libro libro) {
	     libros.add(libro);
	 }
	
}
