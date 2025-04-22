import java.util.Locale;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        // usando o locale para 'mostrar' para o java, qual a linguagem que queremos usar dentro do programa

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu filme favorito: ");
        String filme = scanner.nextLine(); // nextLine() -> é a forma do scanner receber uma String

        System.out.println("Informe o ano de lançamento: ");
        int anoDeLancamento = scanner.nextInt(); // nextInt() -> é a forma do scanner receber um int

        System.out.println("Informe a sua avaliação para o filme: ");
        double avaliacao = scanner.nextDouble(); // nextDouble() -> é a forma do scanner receber um double

        scanner.close();

        System.out.println("Nome do filme: " + filme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Avaliação do usuário: " + avaliacao);

    }
}
