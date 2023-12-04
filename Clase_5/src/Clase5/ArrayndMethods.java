package Clase5;

public class ArrayndMethods {

public static void main(String[] args) {

String s = "hopad";
String s2 = "d";

//compara
System.out.println(s.compareTo(s2));

//concatena los dos
System.out.println(s.concat(s2));

//une
System.out.println(s + s2);

//comprueba si lo contiene
System.out.println(s.contains(s2));

//compruna el indice
System.out.println(s.indexOf("p"));


System.out.println(s.isEmpty());

//tamaño
System.out.println(s.length());

String prueba = "escuela";

//crea un array desde la e
String[] recogerStrings = prueba.split("e");
System.out.println(recogerStrings.length);
System.out.println(recogerStrings[1]);

System.out.println(prueba.substring(1,5));//scue

System.out.println(String.valueOf(prueba));

}

}