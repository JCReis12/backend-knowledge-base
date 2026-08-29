public class App {
    public static void main(String[] args) throws Exception {
        Arquivo arq1 = new Arquivo("Arquivo 01");

        System.out.println(arq1.getName() + " | " + arq1.getSize());
        System.out.println("Conteúdo: " + arq1.getContent());

        arq1.rename("Anotations");
        
        arq1.edit("New english content to my anotations");

        arq1.clear();
    }
}
