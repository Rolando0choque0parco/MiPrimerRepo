package paquete;
public abstract class Publicacion {
    String titulo;
    String autor;

    public Publicacion(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    protected abstract String getMostrarInformacion();
}
class Libro extends Publicacion{
    String nombreEditorial;
    int numPaginas;
    public Libro(String nombreEditorial, int numPaginas, String titulo, String autor){
        super(titulo, autor);
        this.nombreEditorial = nombreEditorial;
        this.numPaginas = numPaginas;
    }
    @Override
    protected String getMostrarInformacion(){
        return """ 
                %nInformacion:\s 
                ----------------- 
                \tTitulo: %s 
                \tAutor: %s
                \tNombreEditorial: %s 
                \tNumPaginas: %d 
                """.formatted(titulo, autor, nombreEditorial, numPaginas); 
    }
    protected void prestarLibro(){
        System.out.println("libro " +  titulo + "prestado por 15 dias");
    }
    protected void prestarLibro(int dias){
        System.out.println("libro " + titulo + "prestado por " + dias + " dias");
    }
    protected void prestarLibro(String persona){
        System.out.println("Libro " + titulo + "prestado a " + persona + " por 15 dias");
    }
    protected void prestarLibro(String persona, int dias){
        System.out.println("Libro '" + titulo + "' prestado a " + persona + " por " + dias + " días");
    }
}
class Revista extends Publicacion{
    String nombrePagina;
    int numeroEdicion;

    public Revista(String nombrePagina, int numeroEdicion, String titulo, String autor){
        super(titulo, autor);
        this.nombrePagina = nombrePagina;
        this.numeroEdicion = numeroEdicion;
    }
    @Override
    protected String getMostrarInformacion(){
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
class Articulo extends Publicacion{
    String metodologia;
    int añoPubliacion;

    public Articulo(String metodologia, int añoPubliacion, String titulo, String autor){
        super(titulo, autor);
        this.metodologia = metodologia;
        this.añoPubliacion = añoPubliacion;
    }
    @Override
    protected String getMostrarInformacion(){
        return """ 
                %nInformacion:\s 
                ----------------- 
                \tTitulo: %s 
                \tAutor: %s
                \tMetodologia : %s
                \tAñoPublicacion: %d 
                """.formatted(titulo, autor, metodologia, añoPubliacion); 
    }
}