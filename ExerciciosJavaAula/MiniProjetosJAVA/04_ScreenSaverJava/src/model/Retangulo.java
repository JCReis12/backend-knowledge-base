package model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Retangulo extends Forma{

    // Construtor
    public Retangulo(int x, int y, int altura, int largura){
        super(x, y, altura, largura);
    }

    public void desenhar(Graphics2D g){
        g.setColor(cor);
        g.fillRect(x, y, largura, altura);
    }

    public void mover(int WIDTH, int HEIGHT){
        x += velX;
        y += velY;

        if (velX < 0 && x <= 0) {
            x = 0;
            velX *= -1;
            cor = new Color(random.nextInt(0x1000000));
        } else if (velX > 0 && x + largura >= WIDTH) {
            x = WIDTH - largura;
            velX *= -1;
            cor = new Color(random.nextInt(0x1000000));
        }

        if (velY < 0 && y <= 0) {
            y = 0;
            velY *= -1;
            cor = new Color(random.nextInt(0x1000000));
        } else if (velY > 0 && y + altura >= HEIGHT) {
            y = HEIGHT - altura;
            velY *= -1;
            cor = new Color(random.nextInt(0x1000000));
        }

    }

}
