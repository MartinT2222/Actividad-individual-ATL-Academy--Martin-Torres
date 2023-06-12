import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();
        System.out.println("Ingrese el tercer número: ");
        double numero3 = sc.nextDouble();
        double promedio = (numero1 + numero2 + numero3) / 3;
        System.out.println("El promedio de los números ingresados es: " + promedio);
        sc.close();
    }
}
