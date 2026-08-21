import java.util.Scanner;
public class ObjetoMaisAvancado {
    public static void main(String[] args) throws Exception {
        Scanner jc = new Scanner(System.in);
        int opc = 0;
        
        Arquivo arq1 = new Arquivo();

        arq1.name = "Anotações";
        arq1.size = 32;
        arq1.content = "Conteúdo inicial do meu arquivo primário";

        do{
            System.out.println("");
            System.out.println("O que deseja realizar?");
            System.out.println("1 - Abrir | 2 - Renomear | 3 - Editar conteúdo | 4 - Limpar | 5 - Sair");
            opc = jc.nextInt();

            if(opc == 1){
                System.out.println(arq1.name + " | " + arq1.size);
                System.out.println("Conteúdo: " + arq1.content);
            }
            else if(opc == 2){
                arq1.rename("Anotations");
            }
            else if(opc == 3){
                arq1.edit("New english content to my anotations");
            }
            else if(opc == 4){
                arq1.clear();
            }
        }while(opc != 5);


    }
}
