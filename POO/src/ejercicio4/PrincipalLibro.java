package ejercicio4;

import java.util.ArrayList;

import ejercicio3.Autor;

public class PrincipalLibro {

	public static void main(String[] args) {
		Autor autora = new Autor("JK Rowling", "jk@hola.com", "femenino");
		ArrayList<Autor> autores = new ArrayList<Autor>();
		autores.add(autora);

		Libro hp = new Libro("Harry Potter y la Cámara de los Secretos", autores, 17.95f);
		hp.toString();
		
		Autor autor = new Autor("George RR Martin", "jk@hola.com", "masculino");
		Autor autor2 = new Autor("Tolkien", "jk@hola.com", "masculino");
		ArrayList<Autor> autores2 = new ArrayList<Autor>();
		autores2.add(autor);
		autores2.add(autor2);
		
		Libro fs = new Libro("Fantasía súper épica", autores2, 17.95f, 1000);
		fs.toString();

	}

}
