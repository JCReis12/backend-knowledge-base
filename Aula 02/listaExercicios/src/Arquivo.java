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
        if(newContent == null){
            System.out.println("Novo conteúdo inválido");
        }
        this.content = newContent;
    }

    public boolean rename(String newName){
        if(newName == null){
            System.out.println("Novo nome inválido");
            return false;
        }
        this.name = newName;
        return true;
    }

    public void clear(){
        content = "";
    }
    
    
}
