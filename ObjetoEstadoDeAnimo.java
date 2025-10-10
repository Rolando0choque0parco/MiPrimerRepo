public class ObjetoEstadoDeAnimo {
    //retorna el estado de animo 
    //protected String obtenerEstadoDeAnimo(){
        return "Humor cambiante";
    }
    //pregunta al objeto como se siente
    //public void consultarEstadoDeAnimo(){
        System.out.println("me siento " + obtenerEstadoDeAnimo() + " hoy!!!.");
    }
}
class ObjetoFeliz extends ObjetoEstadoDeAnimo {
    //redefine el estado de animo de la clase
    @Override
    protected String obtenerEstadoDeAnimo(){
        return "Feliz";
    }
    //especializacion
    public void reir(){
        System.out.println("jeeeeeeeeeeeeeeeeeeeejeeeeeeeee");
    }
}
