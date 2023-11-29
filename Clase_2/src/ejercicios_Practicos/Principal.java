
package ejercicios_Practicos;


public class Principal {

public static void main(String[] args) {

System.out.println("Vamosa empezar a practicar");

Perro Perro1 = new Perro("Yuma",4,12);

System.out.println(Perro1.getNombre());
System.out.println(Perro1.getEdad());
System.out.println(Perro1.getPatas());

Perro1.ladrar();
System.out.println(suma(5));
System.out.println(sumaI(7));
}

public static int suma(int A) {
return A;
}

static int sumaI(int b) {
return b;
}

}
