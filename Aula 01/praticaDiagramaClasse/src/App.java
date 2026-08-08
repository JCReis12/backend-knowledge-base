public class App{
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro();
        c1.cor = "Vermelho";
        c1.velocidade = 0;

        for(int i=0; i<21; i++){
            System.out.println("Cor = " + c1.cor +
                            " Velocidade = " + c1.velocidade);
            c1.acelerar(10);
        }
    }
}
