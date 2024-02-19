package cositas;

import java.util.ArrayList;

public class PrincipalJugador {

	public static void main(String[] args) {

		System.out.println("♥");
		Jugador danyAlves = new Jugador("Dani Alves", "Barça", Posicion.DEFENSA, 2);
		System.out.println(danyAlves);
		//danyAlves.toString();
		ArrayList<Jugador> equipo = new ArrayList<Jugador>();
		equipo.add(danyAlves);
		ArrayList carcel = new ArrayList();
		carcel.add(danyAlves);
		carcel.remove(0);
		carcel.remove(danyAlves);
		carcel.add("Iker Casillas");
	}

}
