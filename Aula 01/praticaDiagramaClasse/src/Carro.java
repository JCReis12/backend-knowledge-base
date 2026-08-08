public class Carro{
    // Atributos
    String cor;
    int velocidade;

    // Metodos
    void acelerar(int valor){
        if(velocidade<200)
            velocidade+=valor;
    }

    void frear(int valor){
        if(velocidade>0)
            velocidade-=valor;
    }
}