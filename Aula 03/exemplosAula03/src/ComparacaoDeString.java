public class ComparacaoDeString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        // Modo errado de compara String(pois == compara o ponteiro do objeto, não o conteúdo)
        if(str1 == str2){
            System.out.println("Igual");
        }else{
            System.out.println("Diferente");
        }

        // Modo correto de compara String(pois .equals(obj) compara o conteúdo)
        if(str1.equals(str2)){
            System.out.println("Igual");
        }else{
            System.out.println("Diferente");
        }


    }
}
