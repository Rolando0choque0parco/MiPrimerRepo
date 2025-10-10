public abstract class EstadoDeAnimo {

    public abstract void obtenerEstadDeAnimo();

    public void consultarEstadoDeAnimo(){
        System.out.println("me siento " + obtenerEstadDeAnimo() + " hoy!!!.");
    }
}
class ObjetoFeliz extends EstadoDeAnimo{
    //redefinir el metodo obtener estado de animo
    @Override
    public void obtenerEstadoDeAnimo(){
        System.out.println("soy feliz");
    }
}
class Main {
    public static void main(String[] args) {
        ObjetoFeliz felicita = new ObjetoFeliz();
        felicita.obtenerEstadoDeAnimo();
    }
}
