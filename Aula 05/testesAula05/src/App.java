import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int resultado = 0;
        int divisor = -2;

        System.out.println("Tarefa 1");
        
        try{

            if(divisor < 0){
                throw new Exception("O divisor não pode ser negativo");
            }

            resultado = 10/divisor;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


        System.out.println("Tarefa 2");
        System.out.println("Tarefa 3");
        System.out.println("Tarefa 4");
        System.out.println(resultado);
    }
}
