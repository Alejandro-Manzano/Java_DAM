package ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class principalPokemon {

	static ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>();

	public static void main(String[] args) {
		System.out.println("Empecemos");
		Scanner s = new Scanner(System.in);
		boolean hayTorneo = false;

		while (true) {

			String linea = s.nextLine();// leo la instruccion por consola

			if (linea.equals("fin")) // para salir del bucle
			{
				break;
			}
			if (linea.equals("torneo"))// para la segunda parte
			{
				hayTorneo = true;
			}

			if (!hayTorneo) {//meto entrenador o pokemons
				String[] lineaSplit = linea.split(" ");

				if (entrenadores.size() == 0) {// si el arrayList est� vacio meto sin comprobar
					meterEntrenador(lineaSplit);
				} else {
					
					boolean existe = true;
					for (Entrenador e : entrenadores) {
						if (e.getNombre().equals(lineaSplit[0]))// si el entrenador existe
						{
							System.out.println("Meto a " + lineaSplit[1]);// nombre del pokemon

							int ps = Integer.parseInt(lineaSplit[3]);

							e.getPokemons().add(new Pokemon(lineaSplit[1], lineaSplit[2], ps));
							break;
							// existe = true;
						} else {
							// no puedo a�adir el entrenador aqu� porque si no me da un error en tiempo de
							// ejecuci�n por modificar el array al recorrerlo
							//debo crear un booleano para se�alizar que debo a�adir a Brock
							existe = false;
						}
					}
					if (existe == false)
						meterEntrenador(lineaSplit);
				}

		
			}

			else {// si hayTorneo es True y "linea" tendr� solo una palabra
				
				
			}

		}
		System.out.println("Salimos");

//		for(Entrenador e: entrenadores) {
//			System.out.println(e.toString());
//		}

		for (int i = 0; i < entrenadores.size(); i++) {
			System.out.println(entrenadores.get(i).toString());
		}
	}

//Ash Pikachu electricidad 20
//Brock Onix roca 60
//Ash Charizard fuego 200
//Ash Charizard fuego 200
	private static void meterEntrenador(String[] lineaSplit) {
		String nombre = lineaSplit[0];
		String nombrePokemon = lineaSplit[1];
		String elemento = lineaSplit[2];
		Entrenador entrenador = new Entrenador(nombre); // le pasamos el nombre
		int ps = Integer.parseInt(lineaSplit[3]); // convertimos de String a int
		entrenador.getPokemons().add(new Pokemon(nombrePokemon, elemento, ps));
		entrenadores.add(entrenador);
	}

}
