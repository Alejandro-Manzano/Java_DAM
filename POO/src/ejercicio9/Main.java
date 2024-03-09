package ejercicio9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Entrenador>entrenadores = new ArrayList<Entrenador>();
		boolean fin = false;
		
		do {
			
			
			Scanner scanner = new Scanner(System.in);
			
			//pregunto que entrenador es
			System.out.println("Que entrenador eres ?");
			String entrenadorString = scanner.nextLine();
			
			if (entrenadorString.equalsIgnoreCase("fin")) {
				fin = false;
				break;
			}
		
			System.out.println("Que pokemons quieres crear?");
			String nombrePokemon = scanner.nextLine();
			
			if (entrenadorString.equalsIgnoreCase("fin")) {
				fin = false;
				break;
			}
			
			System.out.println("Que elemento es tu pokemon?");
			String elementoPokemon = scanner.nextLine();
			
			if (entrenadorString.equalsIgnoreCase("fin")) {
				fin = false;
				break;
			}
			
			System.out.println("Cuantos puntos de vida tiene tu pokemon?");
			int puntosDeVida = scanner.nextInt();
			
			Pokemon pokemon = new Pokemon(nombrePokemon, elementoPokemon, puntosDeVida);
			Entrenador entrenador = new Entrenador(entrenadorString);
			
			for (int i = 0; i < entrenadores.size(); i++) {
				
				if (entrenadores.get(i).getNombre().equalsIgnoreCase(entrenadorString)) {
					entrenadores.get(i).getPokemons().add(pokemon);				
				} 
				else {
					entrenadores.add(entrenador);
					entrenador.getPokemons().add(pokemon);
				}
			}
			
			
			
		} while (!fin);

		for (Entrenador entrenador : entrenadores) {
			System.out.println(entrenador.toString());
		}
		
		System.out.println("fin");
		
	}

}
