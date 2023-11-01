import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el Radio del Cilindro: ");
        double Radio = scanner.nextDouble();
        System.out.print("Ingresa la Altura del Cilindro: ");
        double Altura = scanner.nextDouble();
        double Area = 2*3.14159*Radio*(Radio+Altura);
        double Volumen = 3.14159*Radio*Radio*Altura;

        System.out.println("El Área total del Cilindro es: "+Area);
        System.out.print("El Volumen del Cilindro es: "+Volumen);


    }
}
