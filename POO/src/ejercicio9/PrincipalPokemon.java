package ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalPokemon {

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
				continue;//esta instruccion hace que se salte un turno o iteración del bucle donde está
				//es como el Te Salto o el Prohibido en el UNO
			}

			if (!hayTorneo) {//meto entrenador o pokemons
				String[] lineaSplit = linea.split(" ");

				if (entrenadores.size() == 0) {// si el arrayList está vacio meto sin comprobar
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
							// no puedo añadir el entrenador aquí porque si no me da un error en tiempo de
							// ejecución por modificar el array al recorrerlo
							//debo crear un booleano para señalizar que debo añadir a Brock
							existe = false;
						}
					}
					if (existe == false)
						meterEntrenador(lineaSplit);
				}

			}

			else {// si hayTorneo es True y "linea" tendrá solo una palabra
				
				//digamos que linea es "electricidad"
				for (int i = 0; i<entrenadores.size();i++)
				{
					boolean metiInsignia = false;//para evitar meter más de una insignia a la vez
					
					for(int j = 0; j<entrenadores.get(i).getPokemons().size(); j++)
					{
						if (metiInsignia) //(metiInsignia == True)
						{
							break; //nos salimos 
						}
						if (linea.equals(entrenadores.get(i).getPokemons().get(j).getElemento()))
						{
								//entrenadores.get(i).setInsignias(entrenadores.get(i).getInsignias()+1);
								entrenadores.get(i).addInsignias();
								metiInsignia = true; //para evitar meter más de una insignia a la vez
						}
					}
					
					if (metiInsignia == false)
					{
						boolean matarPokemon = false;
						Pokemon p = null;
						int indiceEntrenador = 0;
						for(int j = 0; j<entrenadores.get(i).getPokemons().size(); j++)
						{
							entrenadores.get(i).getPokemons().get(j).bajarPs();
							//entrenadores.get(i).getPokemons().get(j).setPs(entrenadores.get(i).getPokemons().get(j).getPs()-10);
							//si la vida está por debajo de 0
							if (entrenadores.get(i).getPokemons().get(j).getPs()<=0)
							{
								matarPokemon = true;
								p=entrenadores.get(i).getPokemons().get(j); //variable para saber a qué pokemon cargarme
								indiceEntrenador = i; //indice para saber a que entrenador matarle un pokemon
								
							}
						}
						if (matarPokemon)
						{
							entrenadores.get(indiceEntrenador).getPokemons().remove(p);
						}
					}
					
				}
				
				
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
