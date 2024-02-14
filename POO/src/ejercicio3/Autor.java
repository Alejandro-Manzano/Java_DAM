package ejercicio3;

import java.util.Scanner;

public class Autor {
	
	String nombre;
	String email;
	String genero;

	public Autor(String nombre, String email, String genero)
	{
		setNombre(nombre);
		setEmail(email);
		setGenero(genero);
	}
	
	public String toString()
	{
		return getNombre() + " (" + getGenero() + ") "+ getEmail();
	}
	
	public void setEmail(String email) {
		if (email.matches("^(.+)@(.+)$"))
			this.email = email;
		else
		{
			Scanner s = new Scanner(System.in);
			String input = "";
			while (!input.matches("^(.+)@(.+)$"))
			{
				System.out.println("Introduce un email valido");
				input = s.nextLine();
			}
			s.close();
			this.email = input;
		}
		
	}
	
	
	public void setGenero(String genero) {
		if (genero.toLowerCase().equals("masculino")||genero.equalsIgnoreCase("femenino"))
			this.genero = genero;
		else
		{
			Scanner s = new Scanner(System.in);
			String input = "";
			while (!input.equalsIgnoreCase("masculino")&&!input.equalsIgnoreCase("femenino"))
			{
				System.out.println("Introduce uno de los siguientes g�neros v�lidos: \"masculino\" o \"femenino\"");
				input = s.nextLine();
			}
			s.close();
			this.genero = input;
		}
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	public String getGenero() {
		return genero;
	}
	
}
