package Ejercicio1;

import java.time.LocalDate;

public class Animal {
		
		String nombre;
		LocalDate date;

		public Animal(String nombre, LocalDate date) {
			setNombre(nombre);
			setDate(date);
		}
		
		public Animal(String mote) {
			setNombre(mote);
			LocalDate hoyDate = LocalDate.of(2024, 02, 01);
			setDate(hoyDate);
		}
		
		public String toString() {
			return "Nombre: - " + getNombre() + " - Edad: - " + getDate();
		}
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

}
