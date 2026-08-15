public class App {
    public static void main(String[] args) throws Exception {
        
        ContaBancaria conta01 = new ContaBancaria(12345, 0.0, "Vinicius Souza");

        System.out.println(conta01);
        System.out.println("");
        conta01.depositar(500);
        System.out.println(conta01);
        System.out.println("");
        conta01.sacar(256);
        System.out.println(conta01);
        System.out.println("");
        System.out.println(conta01.checkBalance(12345));
        System.out.println(conta01);
        System.out.println("");


    }
}
