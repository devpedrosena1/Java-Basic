import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int palpite = 0;
        int numero = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número entre 0 e 100:");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite == numero) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas.");
                break;
            } else if (palpite < numero) {
                System.out.println("O número gerado é MAIOR que o seu palpite!");
            } else {
                System.out.println("O número gerado é MENOR que o seu palpite!");
            }
        }

        if (tentativas == 5 && palpite != numero) {
            System.out.println("Você não conseguiu acertar o número em 5 tentativas. O número era: " + numero);
        }
    }
}
