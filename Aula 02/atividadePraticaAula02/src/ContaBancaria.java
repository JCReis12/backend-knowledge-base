public class ContaBancaria {
    int numero;
    double saldo;
    

    public ContaBancaria(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }


    public boolean depositar(double valor){
        if(valor <= 0){
            return false;
        }
        saldo += valor;
        System.out.println("Deposito de R$ " + valor + " executado com exito!");
        return true;
    }

    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " executado com exito!");
            return true;
        }
        return false;
    }

}
