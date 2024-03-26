/**
 * 
 */
/**
 * 
 */
module ModeloB {
}




//Estás de prácticas en una subcontrata del gobierno qué quiere tener datos de 
//todos los estudiantes de todas las asignaturas de todas las las universidades 
//de España, te toca pringar y hacerlo todo, pero un amigo muy majo te dice cómo 
//podrías empezar a gestionarlo, te dice:

//Lo primero es lo primero, se necesita seguridad, pon todos los atributos para 
//que sean privados, usa getters, setters y toStrings para acceder a los atributos o visualizar clases

//Después, yo crearía 3 clases: Estudiante, Asignatura y Universidad. Ah! No te olvides de la Principal, 
//la que tiene el main pa que puedas ejecutar el programa.

//...mmm yo en asignatura pondría el nombre, el nnúmeroDeCreditos, una nota (double), el nombre de la 
//universidad que oferta la asignatura, y un boolean estaSiendoCursada. Obviamente añádele un constructor.

//...pues en Estudiante lo típico, nombre, DNI (string), un ArrayList con todas las asignaturas de su carrera, y dos métodos matricularse y desmatricularse, que recibirán el nombre de una asignatura por la llamada al método, y si existe, cambiará el valor del boolean a verdadero o falso, según corresponda. También crea un constructor con sus atributos.

//... Nah, la Universidas es fácil, tiene un nombreDeLaUniversidad y un ArrayList de estudiantes. Necesita constructor, genéralo.

//Para poner a prueba la clases a través de la clase principal:
//Crear 2 estudiantes cualesquiera, cada uno con las mimas asignaturas. En uno habrá que meter matricularse en una asignatura y en el otro desmatricularse (por ejemplo, puedes crear Pedro que tiene Base de Datos matriculada y matemáticas desmatriculada, y luego matricularle en matemáticas)

//Finalmente:
//Crear un método buscar estudiantes en Universidad, que devuelva por pantalla un estudiante con el nombre que se le ha pasado (por la llamada al método) o que imprima un mensaje de error si no existe.)
//(2 puntos)


//Ejercicio para el 10:
//Crear un método tranferirExpediente en Universidad que recibirá dos estudiantes, el segundo estudiante ahora tendrá el mismo arraylist de asignaturas que el primer estudiante ( 2,5 puntos)