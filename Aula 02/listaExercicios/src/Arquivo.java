public class Arquivo {
    // Atributos
    String name;
    int size;
    String content;

    // Métodos
    public String open(){
        return "Arquivo ABRIDO com sucesso";
    }

    public void edit(String newContent){
        this.content = newContent;
    }

    public boolean rename(String newName){
        this.name = newName;
        return true;
    }

    public void clear(){
        content = "";
    }
    
    
}
