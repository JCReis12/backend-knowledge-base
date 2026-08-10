package diagramaCarro;
public class Carro{
    String marca;
    String modelo;
    String cor;
    int velocidade;

    void acelerar(int valor){
        if(velocidade<200)
            velocidade+=valor;
    }

    void frear(int valor){
        if(velocidade>0)
            velocidade-=valor;
    }
}