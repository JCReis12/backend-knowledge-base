public class Arquivo {
    // Atributos
    private String name;
    private String content;
    private int size;

    // Construtores
    public Arquivo(String name){
        this.name = name;
        content = "";
        updateSize();
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
        updateSize();
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
        updateSize();
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


    // Função para calcular automaticamente o tamanho do arquivo
    private void updateSize(){
        size = content.length()*8;
    }

}
