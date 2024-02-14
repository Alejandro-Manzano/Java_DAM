package Lógica;


public class Alumno {
    
    int id;
    String nombre;
    String apellido;
    
    public Alumno(){
        
    }

    public Alumno(int iid, String nombre, String apellido) {
        //el de la izquierda son la variables de arriba y el de la drcha son las de la funciín
        this.id = iid;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //get = traer (obtienes los datos, por ejemplo pasra hacer una operación)
    public int getId() {
        return id;
    }

    //set = colocar (establecer valores)(casos en que crees un objeto vacio o quieras modificar un valor)
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    //void se emplea cuando se realiza algo pero no devuelve nada
    public void mostrarNombre(){
        
        System.out.print("Hola soy un alumno");
                
    }
    
    public void saberAprobado(double calificación){
        
        if(calificación >= 6){
            System.out.print("Aprobe la materia");
        }
        else{
           System.out.print("No aprobe"); 
        }
    }
    
}