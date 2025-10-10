// Clase abstracta - NO se puede instanciar directamente
public abstract class Animal {
    protected String nombre;
    protected int edad;
    
    // Constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Método abstracto - DEBE ser redefinido por las hijas
    public abstract void hacerSonido();
    
    // Método concreto - puede ser usado por todas las hijas
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}
class Perro extends Animal {
    private String raza;
    
    // Constructor
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);  // Llama al constructor del padre
        this.raza = raza;
    }
    
    // REDEFINIMOS el método abstracto
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau! 🐕");
    }
    
    // Método propio de Perro
    public void moverCola() {
        System.out.println(nombre + " está moviendo la cola");
    }
}
class Main {
    public static void main(String[] args) {
        
        // Creamos un arreglo de tipo Animal
        // pero guardamos objetos de las clases hijas
        Animal[] animales = new Animal[3];
        
        animales[0] = new Perro("Rex", 5, "Labrador");
        animales[1] = new Gato("Michi", 3);
        animales[2] = new Vaca("Lola", 4);
        
        // ¡POLIMORFISMO! Mismo método, diferente comportamiento
        System.out.println("=== Todos los animales hacen sonido ===");
        for (Animal animal : animales) {
            animal.mostrarInfo();
            animal.hacerSonido();  // Cada uno hace su propio sonido
            System.out.println();
        }
        
        // También podemos usar el método específico
        Perro miPerro = new Perro("Bobby", 2, "Beagle");
        miPerro.hacerSonido();
        miPerro.moverCola();  // Método solo de Perro
    }
}