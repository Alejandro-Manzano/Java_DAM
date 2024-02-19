package cositas;

public class Jugador {
	String nombre;
	String equipo;
	Posicion posicion;
	int dorsal;
	
	public Jugador (String n, String e, Posicion p, int d)
	{
		nombre = n;
		equipo = e;
		posicion = p;
		dorsal = d;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", equipo=" + equipo + ", posicion=" + posicion + ", dorsal=" + dorsal
				+ "]";
	}

}
