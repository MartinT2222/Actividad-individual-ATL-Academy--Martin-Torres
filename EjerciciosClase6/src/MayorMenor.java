
import java.util.Scanner;

public class MayorMenor {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Proporcione un numero");
            numbers[i] = console.nextInt();
        }

        int major = numbers[0];
        int minor = numbers [0];

        for (int i = 0; i < 3; i++) {
            if (numbers[i] > major) {
                major = numbers[i];
            }
            if (numbers[i] < minor) {
                minor = numbers[i];
            }
        }

        System.out.println("El numero mayor es: " + major);
        System.out.println("El numero menor es: " + minor);

    }

}