
import java.util.Scanner;
public class MostrarCincoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 números:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Los números ingresados son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

    }
}
