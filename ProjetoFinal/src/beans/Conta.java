package beans;

public class Conta {

    private String nome;
    private String tipo;
    private float saldo;

    // construtor vazio
    public Conta() {
        super();
    }

    // construtor cheio
    public Conta(String nome, String tipo, float saldo) {
        super();
        this.nome = nome;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    // métodos de lógica
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de: R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(float valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque no valor de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saque não permitido. Por favor verifique o valor.");
        }
    }

    public void consultar() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    // toString
    @Override
    public String toString() {
        return "Informações da Conta" +
                "\nNome: " + nome +
                "\nTipo: " + tipo +
                "\nSaldo: " + saldo;
    }
}
