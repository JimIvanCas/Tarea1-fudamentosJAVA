import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
// Declarar la variable Scanner.
        Scanner scanner = new Scanner(System.in);
// Solicitar y declarar la variable 1.
        System.out.print("Ingresa la base del triangulo: ");
        double base = scanner.nextDouble();
// Solicitar y declarar la variable 2. 
        System.out.print("Ingresa la altura del triangulo: ");
        double altura = scanner.nextDouble();
// Realizar el proceso logico. 
        double area = (base * altura)/2;
// Resultado. 
        System.out.print("El area del triangulo es: "+ area);
    }
}
