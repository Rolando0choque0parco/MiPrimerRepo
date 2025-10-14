import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("usted tiene credencial?: ");
        String confirmacion = scanner.nextLine();
        System.out.print("usted vive a no mas de 3 km a la redonda?: ");
        String confirmacion2 = scanner.nextLine();
        boolean resultado = ("si".equals(confirmacion) || "si".equals(confirmacion2));
        System.out.println("se le puede prestar un libro?: " + resultado);
    }
}