package atividadeContaBancaria;

public class ObjetosContaBancaria{
    public static void main(String[] args) {
        ContaBancaria contaX = new ContaBancaria();
        ContaBancaria contaY = new ContaBancaria();
        ContaBancaria contaZ = new ContaBancaria();

        contaX.titular = "João Silva";
        contaX.agencia = "Bradesco";
        contaX.numConta = 11111;
        contaX.saldo = 30300.0;
        contaX.senha = 123;

        contaY.titular = "Maria Santos";
        contaY.agencia = "Itaú";
        contaY.numConta = 22222;
        contaY.saldo = 40015.0;
        contaY.senha = 456;

        contaZ.titular = "Matheus Souza";
        contaZ.agencia = "Santander";
        contaZ.numConta = 33333;
        contaZ.saldo = 22700.0;
        contaZ.senha = 789;
    }
}