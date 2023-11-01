import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio de la Circunferencia: ");
        double Radio = scanner.nextDouble();
        double Longitud = 2*3.14159*Radio;
        double Area = 3.14159*Radio*Radio;

        System.out.println("La longitud de la Circunferencia es: "+Longitud);
        System.out.print("El Área del Circulo es: "+Area);
    }
}
