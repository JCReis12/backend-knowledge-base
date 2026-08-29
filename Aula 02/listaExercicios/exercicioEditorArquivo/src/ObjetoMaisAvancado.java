import java.util.Scanner;

import javax.swing.JOptionPane;
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
        }while(!rsp.equalsIgnoreCase("s") && !rsp.equalsIgnoreCase("sim"));


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



        for(int i = 0; i < 80; i++){
            System.out.println(" ");
        }

        System.out.println("Arquivo " + arquivo.getName() + " está disponível.");
        int opcEdit = 0;
        
        do{
            System.out.println("1 - Abrir");
            System.out.println("2 - Renomear");
            System.out.println("3 - Alterar Conteúdo");
            System.out.println("4 - Limpar");
            System.out.println("5 - Sair");
            opcEdit = jc.nextInt();
        }while(opcEdit < 1 || opcEdit > 5);
        

        switch (opcEdit) {
            case 1:
                JOptionPane.showMessageDialog(null, arquivo.getContent());
                break;

            case 2:
                System.out.println("Qual o novo nome do Arquivo?");
                String nvNome = jc.next();
                while(nvNome.equals(arquivo.getName())){
                    System.out.println("O novo nome não pode ser igual ao anterior, ta chapando?");
                    System.out.println("Qual o novo nome do Arquivo?");
                    nvNome = jc.next();
                }
                arquivo.rename(nvNome);
                break;

            case 3:
                System.out.println("Digite o conteúdo que deseja adicionar:");
                String nvCont = jc.next();
                while(nvCont.equals(arquivo.getContent())){
                    System.out.println("O novo conteúdo não pode ser igual ao anterior, ta chapando?");
                    System.out.println("Digite o conteúdo que deseja adicionar:");
                    nvCont = jc.next();
                }
                arquivo.rename(nvCont);
                break;

            case 4:
                arquivo.clear();
                break;

            default:
                System.out.println("Finalizando Sessão.");
                break;
        }



        






        


    }
}
