import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner impresion = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double Primernumero = impresion.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double Segundonumero = impresion.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        double Tecernumero = impresion.nextDouble();

        double Promedio = (Primernumero+Segundonumero+Tecernumero)/3;
        System.out.print("El promedio de los numeros indicados es: "+Promedio);

    }
}
