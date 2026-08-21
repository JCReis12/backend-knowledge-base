public class Character {
    String name;
    int life;
    int attack;
    int defense;

    public void attack(Character opponent){
        int damage = this.attack - opponent.defense;

        if(damage > 0){
            opponent.life -= damage;
            System.out.println(opponent.name + " recebeu dano de " + damage);
        }
        System.out.println("Ataque de " + this.name + " defendido!");

    }
}