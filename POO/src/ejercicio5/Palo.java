package ejercicio5;

public enum Palo {
	CORAZONES("♥"), //alt+3 (el 3 del pad numero) "\u2665"
	PICAS("♠"), //alt+6 "\u2660"
	TREBOLES("♣"), //alt+5 "\u2663"
	DIAMANTES("♦"); //alt+4 "\u2666"

	private final String simbolo;
	
	Palo(String string) {
		this.simbolo = string;
	}
	
	public String getSimbolo()
	{
		return simbolo;
	}
}
