import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base del triangulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa la altura del triangulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura)/2;

        System.out.print("El area del triangulo es: "+ area);
    }
}
