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

        System.out.println("======== Operações do cliente " + contaX.titular + " ========");
        System.out.println("Conta " + contaX.agencia + " de " + contaX.titular + ": ");
        System.out.println("Saldo: " + contaX.saldo);
        contaX.depositar(11111, 1000.0, 123);
        System.out.println("Saldo: " + contaX.saldo);
        contaX.sacar(11111, 560.0, 123);
        System.out.println("Saldo: " + contaX.saldo);

        System.out.println("");

        System.out.println("======== Operações do cliente " + contaY.titular + " ========");
        System.out.println("Conta " + contaY.agencia + " de " + contaY.titular + ": ");
        System.out.println("Saldo: " + contaY.saldo);
        contaY.depositar(22222, 1000.0, 456);
        System.out.println("Saldo: " + contaY.saldo);
        contaY.sacar(22222, 560.0, 456);
        System.out.println("Saldo: " + contaY.saldo);
        
        System.out.println("");

        System.out.println("======== Operações do cliente " + contaZ.titular + " ========");
        System.out.println("Conta " + contaZ.agencia + " de " + contaZ.titular + ": ");
        System.out.println("Saldo: " + contaZ.saldo);
        contaZ.depositar(33333, 1000.0, 789);
        System.out.println("Saldo: " + contaZ.saldo);
        contaZ.sacar(33333, 560.0, 789);
        System.out.println("Saldo: " + contaZ.saldo);






    }
}