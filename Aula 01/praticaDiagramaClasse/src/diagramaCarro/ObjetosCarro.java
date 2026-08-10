package diagramaCarro;
public class ObjetosCarro{
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro();
        c1.marca = "Chevrolet";
        c1.modelo = "Opala";
        c1.cor = "Preto";
        c1.velocidade = 0;

        System.out.println(c1.marca + " " + c1.modelo + " " + c1.cor);
        
        for (int i = 0; i<10; i++){
            System.out.println("Velocidade: " + c1.velocidade + "km/h");
            c1.acelerar(10);
        }

    }
}
