package paquete;

public class Biblioteca {  //clase principal Biblioteca
    public static void main(String[] args) {
        Libro libro1 = new Libro("MIR MOSCU", 1000, "calculo pa berracos", "jose fernaznadez");  //instanciacion
        Libro libro2 = new Libro("MIR Francia", 2000, "calculo pa mbape", "Rolando jordan quispe");  //instanciacion
        Revista revista1 = new Revista("diario ojo", 1, "dina asesina", "gustavo retti");  //instanciacion
        Revista revista2 = new Revista("correo", 2, "dina nadie te quiere", "antauro humala");  //instanciacion
        Revista revista3 = new Revista("chichero", 3, "agua marina esta caliente", "juan salvador");  //instanciacion
        Publicacion [] publicacion = new Publicacion[5];   //arreglo de tipo Publicacion[5]
        publicacion [0] = libro1;   //llenado el arreglo
        publicacion [1] = libro2;   //con instancias
        publicacion [2] = revista1;     //de diferentes
        publicacion [3] = revista2;     //subclases
        publicacion [4] = revista3;
        //viendo polimorfismo
        System.out.println(publicacion[0].getMostrarInformacion());   //llamando al metodo
        System.out.println(publicacion[1].getMostrarInformacion());     //getMostrarInformacion()
        System.out.println(publicacion[2].getMostrarInformacion());     //para cada objeto
        System.out.println(publicacion[3].getMostrarInformacion());     //usando polimorfismo
        System.out.println(publicacion[4].getMostrarInformacion());

        libro1.prestarLibro();                                    //polimorfismo por sobrecarga
        libro1.prestarLibro("rolando");                           //polimorfismo por sobrecarga         
        libro1.prestarLibro(10);                                    //polimorfismo por sobrecarga
        libro1.prestarLibro("rolando", 11);                                    //polimorfismo por sobrecarga

        hacerHablar(revista1);
        hacerHablar(revista2);
        hacerHablar(revista3);
        hacerHablar(libro1);
        hacerHablar(libro2);
    }   
    public static void hacerHablar(Publicacion publica){    //polimorfismo por inclusion
       System.out.println(publica.getMostrarInformacion());
    }
}