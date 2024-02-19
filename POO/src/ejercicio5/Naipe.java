package ejercicio5;

public class Naipe {
	Palo palo;
	String rango; 
	int valor;
	
	public Naipe (Palo p, String r, int v)
	{
		palo = p;
		rango = r;
		valor = v;
	}
	public int getValor() {
		return valor;
	}
	public Naipe (Palo p, String r)
	{
		palo = p;
		rango = r;
	}
	
	@Override //pinchar en Source/Fuente y luego en generar/generate toString()
	public String toString() {
		return "Naipe [palo= " + palo + " "+ palo.getSimbolo() + ", rango=" + rango + ", valor=" + valor + "]";
	}
	public String toString2() {
		return rango + palo.getSimbolo() + "-"+valor;
	}
	
}
