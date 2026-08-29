import java.util.Scanner;
public class ObjetoMaisAvancado {
    public static void main(String[] args) throws Exception {
        Scanner jc = new Scanner(System.in);
        String rsp = "s";

        for(int i = 0; i < 80; i++){
            System.out.println(" ");
        }

        System.out.println("============== BEM-VINDO AO BLOCO DE NOTAS ==============");
        do{
            System.out.print("Deseja criar um arquivo? (s/n) ");
            rsp = jc.next();
        }while(!rsp.equalsIgnoreCase("s"));


        for(int i = 0; i < 80; i++){
            System.out.println(" ");
        }

        System.out.print("Qual o nome do seu novo arquivo: ");
        String arqNome = jc.next();

        Arquivo arquivo = new Arquivo(arqNome);

        for(int i = 0; i < 3; i++){
            System.out.print(". ");
            Thread.sleep(800);
        }

        System.out.println("");

        System.out.println("Arquivo '" + arquivo.getName() + "' criado com sucesso!");

        






        


    }
}
