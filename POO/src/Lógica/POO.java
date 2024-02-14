package Lógica;

public class POO {
    
    public static void main(String[] args){
    
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(1, "Alejando", "Manzano");
        
        System.out.println("La id del alumno 2 es " +alu2.getId());
        System.out.println("El apellido es " +alu2.getApellido());
        System.out.println("El nombre es " +alu2.getNombre());
        
        //mete datos a alu1
        alu1.setId(5);
        alu1.setNombre("Alex");
        alu1.setApellido("Genaro");
        
        System.out.println("La id del alumno 2 es " +alu1.getId());
        System.out.println("El apellido es " +alu1.getApellido());
        System.out.println("El nombre es " +alu1.getNombre());
        
        //CAMBIO DE VALOR
        alu2.setId(4);
        System.out.println(alu2.getId());
    }
    
}