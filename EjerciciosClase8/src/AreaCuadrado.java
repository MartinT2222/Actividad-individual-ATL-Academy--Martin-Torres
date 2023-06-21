import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float sumatoria = 0;
        sumatoria += getcalcularAreaCuadrado(5,5);
        System.out.println("El área del cuadrado es: " + sumatoria);

    }
    public static float getcalcularAreaCuadrado( float ancho, float alto) {
        float area = ancho * alto;
        return area;
    }

}