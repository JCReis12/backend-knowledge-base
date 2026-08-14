public class ContaBancaria {
    int numero;
    double saldo;

    public boolean depositar(double valor){
        if(valor <= 0){
            return false;
        }
        saldo += valor;
        return true;
    }
}
