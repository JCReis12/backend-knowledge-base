
public class ContaBancaria {
    
    // Atributos
    int numero;
    Double saldo;
    String nome;

    public ContaBancaria(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
        saldo = 0.0;
    }

    // Métodos
    public void depositar(double valor){

            if(valor < 0){
                throw new IllegalArgumentException("Valor não autorizado");
            }

            saldo += valor;
    }

    public void sacar(double valor){
        
            if(valor < 0 || valor > saldo){
                throw new IllegalArgumentException("Valor não autorizado");
            }

            saldo -= valor;
    }
}
