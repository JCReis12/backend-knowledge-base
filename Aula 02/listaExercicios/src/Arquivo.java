public class Arquivo {
    // Atributos
    String name;
    int size;
    String Content;

    // Métodos
    public String open(){
        return "Arquivo ABRIDO com sucesso";
    }

    public void edit(String newContent){
        Content = newContent;
    }

    public boolean rename(String newName){
        name = newName;
        return true;
    }

    public void clear(){
        Content = "";
    }
    
    
}
