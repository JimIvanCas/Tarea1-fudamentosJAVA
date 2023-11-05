import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
//Declarar la variable tipo Scanner. 
        Scanner scanner = new Scanner(System.in);
// Solicitar y declarar la variable 1. 
        System.out.print("Digita la longitud del lado del cuadrado: ");
        double LadoDelCuadrado = scanner.nextDouble();
// Realizar el proceso logico. 
        double Area = LadoDelCuadrado*LadoDelCuadrado;
        double Perimetro = LadoDelCuadrado*4;
// Resultado. 
        System.out.println("El area del cuadrado es: "+Area);
        System.out.print("El perimetro del cuadrado es: "+Perimetro);

    }
}
