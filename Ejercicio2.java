import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
//Declarar la variable Scanner.
        Scanner scanner = new Scanner(System.in);
// Solicitar y declarar la variable 1.
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();
// Solicitar y declarar la variable 2. 
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();
// Realizar el proceso logico. 
        int suma = (numero1 + numero2);
// Resultado. 
        System.out.print("La suma de los números es: "+ suma);
    }
}
