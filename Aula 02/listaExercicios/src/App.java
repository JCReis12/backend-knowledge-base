public class App {
    public static void main(String[] args) throws Exception {
        Arquivo arq1 = new Arquivo();

        arq1.name = "Anotações";
        arq1.size = 32;
        arq1.content = "Conteúdo inicial do meu arquivo primário";

        System.out.println(arq1.name + " | " + arq1.size);
        System.out.println("Conteúdo: " + arq1.content);

        arq1.rename("Anotations");
        
        arq1.edit("New english content to my anotations");

        arq1.clear();
    }
}
