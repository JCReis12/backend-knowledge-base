package model;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public abstract class Forma {
    Random random = new Random();

    // Atributos
    protected int x;
    protected int y;
    protected int altura;
    protected int largura;
    protected int velX;
    protected int velY;
    protected Color cor;

    int randomColor = random.nextInt(16777215);

    // Construtor
    public Forma(int x, int y, int altura, int largura){
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.largura = largura;
        velX = 3;
        velY = 3;
        cor = new Color(randomColor);
    }

    // Método
    public void trocarCor(){
        cor = new Color(random.nextInt(0x1000000));
    }

    public abstract void desenhar(Graphics2D g);

    public abstract void mover(int WIDTH, int HEIGHT);



}
