public class ContaBancaria {

    // Atributos
    private int numero;
    private double saldo;
    private String nome;


    // Construtor
    public ContaBancaria(int numero, double saldo, String nome){
        this.numero = numero;
        this.saldo = saldo;
        this.nome = nome;
    }

    public ContaBancaria(int numero, String nome){
        this(numero, 0, nome);
    }


    // Métodos
    public boolean depositar(double valor){
        if(valor <= 0){
            return false;
        }
        saldo += valor;
        System.out.println("Deposito de R$ " + valor + " executado com exito!");
        return true;
    }

    public boolean depositar(int numero, double valor){
        if(numero != this.numero){
            return false;
        }
        return depositar(valor);
    }

    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " executado com exito!");
            return true;
        }
        return false;
    }

    public double checkBalance(int numero){
        if(numero == this.numero){
            return saldo;
        }
        return 0;
    }


    // Getters e Setters
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


    // toString
    @Override
    public String toString(){
        return "Conta " + numero + " | Titular: " + nome + " | Saldo: R$ " + saldo + "0";
    }






}
