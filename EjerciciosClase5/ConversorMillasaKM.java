package EjerciciosClase5;

import java.util.Scanner;

public class ConversorMillasaKM {
    public static void main(String[] args) {
        //Le pedimos al usuario que ingrese la distancia en millas
        System.out.println("Ingresa la distancia en millas");
        Scanner sc = new Scanner(System.in);
        double millas = sc.nextDouble();

        double kilometros = millas * 1.60934;

        System.out.println( "El total en Kilometros (KM) es: " + kilometros);
    }
}
