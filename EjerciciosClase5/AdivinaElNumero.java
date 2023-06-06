package EjerciciosClase5;
import java.util.Scanner;
public class AdivinaElNumero {
    public static void main(String[] args) {
        double numeroRandom = Math.random() * 100;
        //Le pedimos al usuario que adivine el número
        System.out.println("Ingresa un número del 1 al 100: ");
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        System.out.println(numeroRandom);
        if (numero == numeroRandom){
            System.out.println("El número es correcto. Acertaste");
        }else if (numero != numeroRandom){
            System.out.println("El numero es INCORRECTO ");
        }
    }
}
