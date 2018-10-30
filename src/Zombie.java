public class Zombie {

    int health;
    int attack;


    public Zombie(){
        this.health = 100;
    }

    public void attack(Plant plante){
        plante.takeDamage();
    }

    public void takeDamage(){
        int randomDamage = (int)(Math.random() * ((15 - 10) + 1));
        if (this.health-randomDamage <= 0){
            this.health = 0;
            System.out.println("Plante vandt\nVICTORY");
            System.exit(0);

        }
        else {

            this.health -= randomDamage;
            System.out.println("Zombie blev angrebet og har nu " + this.health + " liv tilbage...");

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
