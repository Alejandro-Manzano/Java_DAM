package ejercicio6;

import java.util.ArrayList;

import ejercicio5.Naipe;
import ejercicio5.Palo;

public class Mazo {
	ArrayList<Naipe> coleccionNaipes = new ArrayList<Naipe>();
	
	public Mazo(int n)
	{
		int i = 0;
		while (i<n)
		{
			aniadirUnaBaraja("");
			i++;
		}
	}
	
	/*
	 * en este constructor hay que generar los 52 naipes de una
	baraja, y a�adirlos a la variable coleccionNaipes
	*/
	public Mazo() {
		aniadirUnaBaraja("");
	}
	
	
	public Mazo(String string) {
			aniadirUnaBaraja(string);
	}

	public Naipe get() {
		int tamao = coleccionNaipes.size();
		int random = (int) (Math.random()*tamao);
		return coleccionNaipes.get(random);
	}
	public Naipe remove() {
		int tamao = coleccionNaipes.size();
		int random = (int) (Math.random()*tamao);
		return coleccionNaipes.remove(random);
	}
	
	public void add(Naipe n) {
		coleccionNaipes.add(n);
	}
	public void addAll(Mazo mazo2) {
//		for (Naipe carta : mazo2.coleccionNaipes)
//		{
//			this.add(carta);
//		}
		this.coleccionNaipes.addAll(mazo2.coleccionNaipes);//la alternativa m�s eficiente
 		mazo2.coleccionNaipes.removeAll(coleccionNaipes);

	}
	
	public void tamanio()
	{
		System.out.println(coleccionNaipes.size());
	}
	public void get2() {
		int tamao = coleccionNaipes.size();
		int random = (int) (Math.random()*tamao);
		System.out.println(coleccionNaipes.get(random).toString2());
	}

	private void aniadirUnaBaraja(String string) {
		int i = 1 ;
		while (i<=4)
		{
//			switch(i) //condicional, para el valor que tenga la 
//			//variable i (que ser� de 1 a 4)
//			{
//			case 1:
//				a�adirPaloEntero(Palo.CORAZONES);
//				break;
//			case 2:
//				a�adirPaloEntero(Palo.PICAS);
//				break;
//			case 3:
//				a�adirPaloEntero(Palo.TREBOLES);
//				break;
//			case 4:
//				a�adirPaloEntero(Palo.DIAMANTES);
//				break;
//			}
			if (string.equals("cartaAlta")) {
				if (i == 1){
					addadirPaloEnteroAlto(Palo.CORAZONES);
				}
				else if(i == 2) {
					addadirPaloEnteroAlto(Palo.PICAS);
				}
				else if(i == 3) {
					addadirPaloEnteroAlto(Palo.TREBOLES);
				}
				else {
					addadirPaloEnteroAlto(Palo.DIAMANTES);
				}
			}
			
			else
			{
				if (i == 1){
					addadirPaloEntero(Palo.CORAZONES);
				}
				else if(i == 2) {
					addadirPaloEntero(Palo.PICAS);
				}
				else if(i == 3) {
					addadirPaloEntero(Palo.TREBOLES);
				}
				else {
					addadirPaloEntero(Palo.DIAMANTES);
				}
			}
		i++;}
	}
	private void addadirPaloEntero(Palo palo) {
		String listin = "A,2,3,4,5,6,7,8,9,10,J,Q,K";
		String[] rangos = listin.split(",");
		for (int i = 0; i < rangos.length; i++)
		{
			coleccionNaipes.add(new Naipe(palo,rangos[i]));	
		}
//		String lista2 = "A234567891JQK";
		
//		for (int i = 0; i < lista2.length(); i++)
//		{
//			if (i == 9) {
//				coleccionNaipes.add(new Naipe(palo,"10"));	
//			}
//			else
//			{
//				coleccionNaipes.add(new Naipe(palo,Character.toString(lista2.charAt(i))));	
//				
//			}
//		}
		
//		for (String valor: valores) {//bucle for each
//			coleccionNaipes.add(new Naipe(palo,valor));		
//		}

	
	}
	
	private void addadirPaloEnteroAlto(Palo palo) {
		String listin = "2,3,4,5,6,7,8,9,10,J,Q,K,A";
		String[] rangos = listin.split(",");
		for (int i = 0; i < rangos.length; i++)
		{
			coleccionNaipes.add(new Naipe(palo,rangos[i],i+2));	//esto llama al constructor 
			//de 3 argumentos
		}
	}
	
	
	@Override
	public String toString() {
		return "Mazo [coleccionNaipes=" + coleccionNaipes + "]";
	}
	public void mostrar() {
		for (Naipe naipe : coleccionNaipes)
		{
			System.out.println(naipe.toString2());
		}
	}
	
	
}
