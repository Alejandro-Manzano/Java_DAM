package ejercicio11;

import java.util.ArrayList;

import ejercicio3.Autor;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Autor> autores = new ArrayList<Autor>();
		Autor autor1 = new Autor ("Pepe", "asdsadasdsad@com", "masculin");
		Autor autor2 = new Autor ("Pepe2", "asdsadasdsad@com", "masculin");
		Autor autor3 = new Autor ("Pepe3", "asdsadasdsad@com", "masculin");
		
		autores.add(autor1);
		autores.add(autor2);
		autores.add(autor3);
		
		Libro libro1 = new Libro("Harry Potter", autores, 30, 21);

		libro1.toString();
		
	}

}
