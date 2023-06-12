
import java.util.Scanner;
public class whatsaps {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese un numero de telefono sin espacios");
        String cellPhone = console.nextLine();
        System.out.println("https://api.whatsapp.com/send?phone=" + cellPhone);
    }

}