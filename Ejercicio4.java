import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
// Declarar la variable de tipo Scanner. 
        Scanner scanner = new Scanner(System.in);
// Solicitar y declarar la variable 1. 
        System.out.print("Ingrese la cantidad de Euros: ");
        double Euro = scanner.nextDouble();
// Se declara variable tipo de cambio.
        double TasaDeCambio = 1.06;
// Realizar el proceso logico.
        double Dolares = Euro * TasaDeCambio;
// Resultado. 
        System.out.print(Euro + " "+"Euros Equivalen a "+ Dolares +" "+"dolares.");
    }
}
