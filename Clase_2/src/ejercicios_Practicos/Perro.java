package ejercicios_Practicos;

public class Perro {

private int patas;
private String nombre;
private int edad;

public int getPatas() {
return patas;
}

public void setPatas(int patas) {
this.patas = patas;
}

public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
this.nombre = nombre;
}

public int getEdad() {
return edad;
}

public void setEdad(int edad) {
this.edad = edad;
}


public Perro(String nombre, int patas, int edad) {
setNombre(nombre);
setPatas(patas);
setEdad(edad);

}

public void ladrar() {
System.out.println("guau guau");
}


}