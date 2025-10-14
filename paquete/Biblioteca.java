package paquete;

public class Biblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("MIR MOSCU", 1000, "calculo pa berracos", "jose fernaznadez");
        Libro libro2 = new Libro("MIR Francia", 2000, "calculo pa mbape", "Rolando jordan quispe");
        Revista revista1 = new Revista("diario ojo", 1, "dina asesina", "gustavo retti");
        Revista revista2 = new Revista("correo", 2, "dina nadie te quiere", "antauro humala");
        Revista revista3 = new Revista("chichero", 3, "agua marina esta caliente", "juan salvador");
        Publicacion [] publicacion = new Publicacion[5];
        publicacion [0] = libro1;
        publicacion [1] = libro2;
        publicacion [2] = revista1;
        publicacion [3] = revista2;
        publicacion [4] = revista3;
        // //viendo polimorfismo
        // System.out.println(publicacion[0].getMostrarInformacion());
        // System.out.println(publicacion[1].getMostrarInformacion());
        // System.out.println(publicacion[2].getMostrarInformacion());
        // System.out.println(publicacion[3].getMostrarInformacion());
        // System.out.println(publicacion[4].getMostrarInformacion());
        for (Publicacion publicacio: publicacion){
            System.out.println(publicacio.getMostrarInformacion());
        }
    }
}
