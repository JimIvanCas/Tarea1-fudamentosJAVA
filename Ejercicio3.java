import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número: ");
        double numero = scanner.nextDouble();

        double resultado = (numero * numero);

        System.out.print("El cuadrado de "+numero+ " "+"es: "+resultado);
    }
}
