public class Arquivo {
    // Atributos
    String name;
    int size;
    String content;

    // Construtores
    public Arquivo(String name){
        this.name = name;
        size = 0;
        content = "";
    }

    // Métodos
    public String open(){
        return content;
    }

    public void edit(String newContent){
        if(newContent == null){
            System.out.println("Novo conteúdo inválido");
        }
        this.content = newContent;
        size = newContent.length();
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
        size = 0;
    }
    
    
}
