public class Plant {

    int health;
    int attack;


    public Plant(){
        this.health = 100;
    }

    public void attack(Zombie zombie){
        zombie.takeDamage();
    }

    public void takeDamage(){
        int randomDamage = 5 + (int)(Math.random() * ((10 - 5) + 1));
        if (this.health-randomDamage <= 0){
            this.health = 0;
            System.out.println("Zombie vandt\nVICTORY");
            System.exit(0);
        }
        else {
            this.health -= randomDamage;
            System.out.println("Plante blev angrebet og har nu " + this.health + " liv tilbage...");
        }
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
