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