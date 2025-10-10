public class ObjetoPersonalidad {
    public String hablar(){
        return "soy un objeto.";
    }
    public void hacerHablar(ObjetoPersonalidad obj){
    System.out.println(obj.hablar());
    }
}
class ObjetoPesimista extends ObjetoPersonalidad {
    public String hablar(){
        return "el vaso esta medio vacio.";
    }
}
class ObjetoOptimista extends ObjetoPersonalidad {
    public String hablar(){
        return "el vaso esta medio lleno.";
    }
}
class ObjetoIntrovertido extends ObjetoPersonalidad {
    public String hablar(){
        return "hola...";
    }
}
class ObjetoExtrovertido extends ObjetoPersonalidad {
    public String hablar(){
        return "hola, bla, bla, bla....";
    }
    public static void main(String[] args) {
        ObjetoExtrovertido extrovertido = new ObjetoExtrovertido();
        ObjetoIntrovertido introvertido = new ObjetoIntrovertido();
        extrovertido.hacerHablar(extrovertido);
        introvertido.hacerHablar(introvertido);
        new ObjetoOptimista().hacerHablar(new ObjetoOptimista());// lo mismo
        new ObjetoPesimista().hacerHablar(new ObjetoPesimista());

    }
}