public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 1990;
        boolean incuidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Filme recente.");
        } else {
            System.out.println("Filme antigo");
        }

        if (incuidoNoPlano == true || tipoPlano.equals("plus")) { // || -> OR, && -> AND
            System.out.println("Filme liberado");
        } else {
            System.out.println("Filme bloqueado.");
        }
    }
}
