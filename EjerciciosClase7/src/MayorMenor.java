import java.util.Scanner;
public class MayorMenor {
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

        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);

    }
}
