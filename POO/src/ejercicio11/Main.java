package ejercicio11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		ArrayList<Autor> autores = new ArrayList<Autor>();
		//ArrayList<Biblioteca> biblio = new ArrayList<Biblioteca>();
		String [] genderStrings = {"ficción", "fantasía", "terror"};
		
		Autor autor1 = new Autor ("Pepe", "pepe@com", "masculino");
		Autor autor2 = new Autor ("Gustavo", "gustavo@com", "masculino");
		Autor autor3 = new Autor ("Felipe", "felipe@com", "masculino");
		autores.add(autor1);
		autores.add(autor2);
		autores.add(autor3);
		
		for (int i = 0; i < 6; i++) {
			
			int aleatorio = random.nextInt(3);
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Cual es el titulo?");
			String titleString = scanner.nextLine();
			
			Libro libro  = new Libro(titleString, autores.get(aleatorio).getNombre(), 30, 20, genderStrings[aleatorio]);
			
			
			
		}
		
		
	}

}
