import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
// Declarar la variable de tipo Scanner. 
        Scanner scanner = new Scanner(System.in);
// Solicitar y declarar la variable 1. 
        System.out.print("Ingresa el Radio del Cilindro: ");
        double Radio = scanner.nextDouble();
// Solicitar y declarar la variable 2. 
        System.out.print("Ingresa la Altura del Cilindro: ");
        double Altura = scanner.nextDouble();
// Realizar el proceso logico. 
        double Area = 2*3.14159*Radio*(Radio+Altura);
        double Volumen = 3.14159*Radio*Radio*Altura;
// Resultado. 
        System.out.println("El Área total del Cilindro es: "+Area);
        System.out.print("El Volumen del Cilindro es: "+Volumen);
    }
}
