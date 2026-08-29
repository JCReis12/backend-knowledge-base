public class Arquivo {
    // Atributos
    private String name;
    private int size;
    private String content;

    // Construtores
    public Arquivo(String name){
        this.name = name;
        size = 0;
        content = "";
    }

    // Métodos
    public String open(){
        return name + " | " + content + " | " + size;
    }

    public void edit(String newContent){
        newContent = newContent.trim();
        if(newContent.isEmpty()){
            System.out.println("Novo conteúdo inválido");
        }
        this.content = newContent;
        size = newContent.length()*8;
    }

    public boolean rename(String newName){
        newName = newName.trim();
        if(newName.isEmpty()){
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

    // Getters e Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

}
