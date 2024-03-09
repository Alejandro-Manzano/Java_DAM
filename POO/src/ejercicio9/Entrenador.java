package ejercicio9;

import java.util.ArrayList;

public class Entrenador {
	
	String nombre;
	int numeroDeInsignias;
	ArrayList<Pokemon>pokemons = new ArrayList<Pokemon>();

	public Entrenador(String nombre) {
		this.nombre = nombre;
		setNumeroDeInsignias(0);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDeInsignias() {
		return numeroDeInsignias;
	}

	public void setNumeroDeInsignias(int numeroDeInsignias) {
		this.numeroDeInsignias = numeroDeInsignias;
	}

	public ArrayList<Pokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(ArrayList<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}
	
	public String toString() {
		return "Nombre entrenador: " +getNombre()+ "Pokemons: " +getPokemons().toString();
	}
	
}
