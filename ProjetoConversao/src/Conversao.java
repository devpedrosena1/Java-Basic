public class Conversao {

    public static void main(String[] args) {

        double temperaturaCelsius = 30.7;
        int temperaturaFahrenheit = (int) ((temperaturaCelsius * 1.8) + 32);

        String mensagem = """
                Seja bem vindo ao sistema de conversão de temperatura da Alura!
                A tempeatura em graus Celsius é: %.2f
                Já a temperatura em Fahrenheit é: %d
                """.formatted(temperaturaCelsius, temperaturaFahrenheit);

        System.out.println(mensagem);



    }

}
