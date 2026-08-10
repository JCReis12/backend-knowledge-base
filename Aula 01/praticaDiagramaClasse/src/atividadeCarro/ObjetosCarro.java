package atividadeCarro;
public class ObjetosCarro{
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.marca = "Chevrolet";
        c1.modelo = "Opala";
        c1.cor = "Preto";
        c1.velocidade = 0;

        c2.marca = "Chevrolet";
        c2.modelo = "Celta";
        c2.cor = "Azul Marinho";
        c2.velocidade = 0;

        System.out.println(c1.marca + " " + c1.modelo + " " + c1.cor);
        
        for (int i = 0; i<10; i++){
            System.out.println("Velocidade: " + c1.velocidade + "km/h");
            c1.acelerar(10);
        }

        System.out.println(" ");
        System.out.println("===============================================");
        System.out.println(" ");

        System.out.println(c2.marca + " " + c2.modelo + " " + c2.cor);
        
        for (int i = 0; i<10; i++){
            System.out.println("Velocidade: " + c2.velocidade + "km/h");
            c2.acelerar(30);
        }

    }
}
