import java.util.Scanner;
public class twitter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese el nombre de una celebridad");
        String nameCelebrity = console.nextLine();

        System.out.println("https://twitter.com/search?q=" + nameCelebrity);
    }
}