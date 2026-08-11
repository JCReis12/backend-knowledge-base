package atividadeContaBancaria;

public class ContaBancaria {

    String titular;
    String agencia;
    int numConta;
    Double saldo;
    int senha;

    void depositar(int numContap, Double valor, int senhap){
        if (senhap == senha) {
            if (valor > 0){
                saldo += valor;
                System.out.println("Deposito realizado com sucesso!");
            }
        }
    }

    void sacar(int numContap, Double valor, int senhap){
        if (senhap == senha) {
            if (valor <= saldo){
                saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            }
        }
    }
}
