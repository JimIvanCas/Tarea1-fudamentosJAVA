import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
// Declarar la variable tipo Scanner. 
        Scanner scanner = new Scanner(System.in);
// Solicitar y declarar la variable 1. 
        System.out.print("Ingresa el radio de la Circunferencia: ");
        double Radio = scanner.nextDouble();
// Realizar el proceso logico. 
        double Longitud = 2*3.14159*Radio;
        double Area = 3.14159*Radio*Radio;
// Resultado. 
        System.out.println("La longitud de la Circunferencia es: "+Longitud);
        System.out.print("El Área del Circulo es: "+Area);
    }
}
