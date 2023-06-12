
import java.util.Random;
import java.util.Scanner;
public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        System.out.println("""
                Elige:
                1.Piedra
                2.Papel  
                3.Tijeras""");

        int userAnswer = console.nextInt();

        if (userAnswer < 1 || userAnswer > 3) {
            System.out.println("Eleccion incorrecta");
            return;
        }

        String[] options = {"Piedra", "Papel", "Tijeras"};
        int computerAnswer = random.nextInt(3) + 1;

        System.out.println("La computadora eligio: " + options[computerAnswer - 1]);

        System.out.println("Tu has elegido: " + options[userAnswer -1]);

        if (userAnswer == computerAnswer) {
            System.out.println("Empate!");
        } else if ((userAnswer == 1 && computerAnswer == 3) ||
                (userAnswer == 2 && computerAnswer == 1) ||
                (userAnswer == 3 && computerAnswer == 2)) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("Perdiste!");
        }
    }
}

