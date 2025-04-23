import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int qtdeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite uma nota ou '-1' para parar a aplicação: ");
            nota = sc.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                qtdeNotas++;
            }
        }

        System.out.println("Média das avaliações: " + mediaAvaliacao/qtdeNotas);
    }
}
