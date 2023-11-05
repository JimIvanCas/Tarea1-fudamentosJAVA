import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
// Declarar la variable de tipo Scanner. 
        Scanner impresion = new Scanner(System.in);
// Solicitar la variable 1. 
        System.out.print("Ingresa el primer número: ");
        double Primernumero = impresion.nextDouble();
// Solicitar la variable 2.
        System.out.print("Ingrese el segundo número: ");
        double Segundonumero = impresion.nextDouble();
// Solicitar la variable 3. 
        System.out.print("Ingrese el tercer número: ");
        double Tecernumero = impresion.nextDouble();
// Realizar el proceso logico. 
        double Promedio = (Primernumero+Segundonumero+Tecernumero)/3;
// Resultado. 
        System.out.print("El promedio de los numeros indicados es: "+Promedio);
    }
}
