import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita la longitud del lado del cuadrado: ");
        double LadoDelCuadrado = scanner.nextDouble();
        double Area = LadoDelCuadrado*LadoDelCuadrado;
        double Perimetro = LadoDelCuadrado*4;

        System.out.println("El area del cuadrado es: "+Area);
        System.out.print("El perimetro del cuadrado es: "+Perimetro);

    }
}
