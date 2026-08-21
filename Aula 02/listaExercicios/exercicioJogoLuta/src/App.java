public class App {
    public static void main(String[] args) throws Exception {
        Character p1 = new Character();
        Character p2 = new Character();

        p1.name = "Faria Senior";
        p1.life = 1000;
        p1.attack = 950;
        p1.defense = 1200;

        p2.name = "Tucci Boy";
        p2.life = 1000;
        p2.attack = 1300;
        p2.defense = 900;

        // Jogo
        System.out.println("");
        System.out.println("======== APRESENTAÇÃO ========");
        System.out.println("Personagem 1: " + p1.name + " | Vida: " + p1.life + " | Ataque: " + p1.attack + " | Defesa: " + p1.defense);
        System.out.println("Personagem 2: " + p2.name + " | Vida: " + p2.life + " | Ataque: " + p2.attack + " | Defesa: " + p2.defense);
        System.out.println("");

        Thread.sleep(2000);

        System.out.println("======== INICIO DE JOGO ========");
        do{
            p1.attack(p2);
            System.out.println("Vida atual de " + p2.name + ": " + p2.life);
            System.out.println("");
            Thread.sleep(800);
            p2.attack(p1);
            System.out.println("Vida atual de " + p1.name + ": " + p1.life);
            System.out.println("");
        }while(p1.life != 0 && p2.life != 0);


        




    }
}
