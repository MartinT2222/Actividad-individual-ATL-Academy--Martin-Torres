import java.util.Scanner;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class buscadorGoogle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un país: ");
        String pais = scanner.nextLine();
        System.out.println("https://www.google.com/maps/search/" + pais);
    }
}
