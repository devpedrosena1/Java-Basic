import java.util.Scanner;
import java.util.Locale;

public class Loop {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        // for -> loop
        // inicio, condição, incremento -> 3 é a quantidade de notas a serem lançadas
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite uma nota para o filme: ");
            nota = sc.nextDouble();
            mediaAvaliacao += nota;
        }

        sc.close();

        System.out.println("Média de avaliação é de: " + mediaAvaliacao/3);

    }

}
