import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
//Declarar la variable Scanner. 
        Scanner scanner = new Scanner(System.in);
// Solicitar y declarar la variable 1. 
        System.out.print("Ingresa el número: ");
        double numero = scanner.nextDouble();
// Realizar el proceso logico. 
        double resultado = (numero * numero);
// Resultado. 
        System.out.print("El cuadrado de "+numero+ " "+"es: "+resultado);
    }
}
