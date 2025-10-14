public class Alumno {
    int id;
    String nombre;
    String apellido;
    
    //metodo constructor vacio
    public Alumno(){
    }
    //metodo constructor con parametros
    public Alumno(int id, String nombres, String apellido){
        this.id = id;
        this.nombre = nombres;
        this.apellido = apellido;
    }
    // metodo
    public void mostarNombre(){
        System.out.println("hola, soy un alumno y sé mostrar mi nombre");
    }

}
