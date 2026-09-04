public class App {
    public static void main(String[] args) throws Exception {
        int resultado = 0;

        System.out.println("Tarefa 1");
        
        try{
            resultado = 10/0;
        }
        catch(Exception e){
            System.out.println("Não foi possível calcular");
        }


        System.out.println("Tarefa 2");
        System.out.println("Tarefa 3");
        System.out.println("Tarefa 4");
        System.out.println(resultado);
    }
}
