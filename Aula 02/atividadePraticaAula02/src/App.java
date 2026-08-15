public class App {
    public static void main(String[] args) throws Exception {
        
        ContaBancaria conta01 = new ContaBancaria(12345, 0.0);

        System.out.println(conta01);
        
        conta01.depositar(500);
        conta01.sacar(256);

        System.out.println(conta01);

    }
}
