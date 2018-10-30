public class NPC {

    int health;
    int attack;

    String name;

    public NPC(){
        health = 100;
    }

    public NPC(int health){
        this.health = health;
    }


    public NPC(String name){
        setName(name);
    }

    public void attack(NPC victim){

        int d = getAttack();

        victim.takeDamage(d);

    }

    public void takeDamage(int damage){
        if (this.health-damage <= 0){
            this.health = 0;
            System.out.println(getName()+" tabte\n");
            System.exit(0);

        }
        else {

            this.health -= damage;
            System.out.println(getName()+" blev angrebet og har nu " + this.health + " liv tilbage...");

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
