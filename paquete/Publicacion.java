package paquete;
public abstract class Publicacion { //clase abstracta Publicacion
    String titulo;   //atributo titulo
    String autor;    //atributo autor

    public Publicacion(String titulo, String autor){  //metodo constructor
        this.titulo = titulo;
        this.autor = autor;
    }
    protected abstract String getMostrarInformacion(); //metodo abstracto getMostrarInformacion()
}
class Libro extends Publicacion{  //subclase Libro
    String nombreEditorial;   //atributo propio
    int numPaginas;     //atributo propio
    public Libro(String nombreEditorial, int numPaginas, String titulo, String autor){
        super(titulo, autor);
        this.nombreEditorial = nombreEditorial;
        this.numPaginas = numPaginas;
    }
    @Override                          //polimorfismo por redifinicion con @override
    protected String getMostrarInformacion(){   //propia version del metodo getMostrarInformacion() o una redifinicion
        return """ 
                %nInformacion:\s 
                ----------------- 
                \tTitulo: %s 
                \tAutor: %s
                \tNombreEditorial: %s 
                \tNumPaginas: %d 
                """.formatted(titulo, autor, nombreEditorial, numPaginas); 
    }
    protected void prestarLibro(){                                     //polimorfismo por sobrecarga
        System.out.println("libro " +  titulo + "prestado por 15 dias");
    }
    protected void prestarLibro(int dias){                                    //polimorfismo por sobrecarga
        System.out.println("libro " + titulo + "prestado por " + dias + " dias");
    }
    protected void prestarLibro(String persona){                                    //polimorfismo por sobrecarga
        System.out.println("Libro " + titulo + "prestado a " + persona + " por 15 dias");
    }
    protected void prestarLibro(String persona, int dias){                                    //polimorfismo por sobrecarga
        System.out.println("Libro '" + titulo + "' prestado a " + persona + " por " + dias + " días");
    }
}
class Revista extends Publicacion{   //subclase Revista
    String nombrePagina;  //atributo propio
    int numeroEdicion;      //atributo propio

    public Revista(String nombrePagina, int numeroEdicion, String titulo, String autor){  //metodo constructor
        super(titulo, autor);
        this.nombrePagina = nombrePagina;
        this.numeroEdicion = numeroEdicion;
    }
    @Override      //polimorfismo por redifinicion con @override
    protected String getMostrarInformacion(){    //propia version del metodo getMostrarInformacion() o una redifinicion
        return """ 
                %nInformacion:\s 
                ----------------- 
                \tTitulo: %s 
                \tAutor: %s
                \tNombrePagina: %s
                \tNumeroEdicion: %d 
                """.formatted(titulo, autor, nombrePagina, numeroEdicion); 
    }
}
class Articulo extends Publicacion{   //nueva subclase
    String metodologia;
    int añoPubliacion;

    public Articulo(String metodologia, int añoPubliacion, String titulo, String autor){
        super(titulo, autor);
        this.metodologia = metodologia;
        this.añoPubliacion = añoPubliacion;
    }
    @Override
    protected String getMostrarInformacion(){  //polimorfismo por redifinicion con @override
        return """ 
                %nInformacion:\s 
                ----------------- 
                \tTitulo: %s 
                \tAutor: %s
                \tMetodologia : %s
                \tAñoPublicacion: %d 
                """.formatted(titulo, autor, metodologia, añoPubliacion); 
    }
    protected void descargarArticulo(){    //herencia por diferencia o especializacion
        System.out.println("se esta descargando el articulo");
    }
}