public class SuperZombie extends Zombie {


    SuperZombie(){

        setAttack(15);

    }

    SuperZombie(String name){

        this();

        this.name = name;

    }

    SuperZombie(String name, int health){

        this(name);

        this.health = health;

    }

    public int critticalHit(){

        System.out.println("Super zombie made a CRITICAL HIT");
        return (int)((double)(this.getAttack() * 1.2));

    }

    @Override
    public void attack(NPC victim) {
        int d = getAttack();

        int s = (int)(Math.random()*10);

        if( s % 2 == 0 ){
            d = critticalHit();
        }

        victim.takeDamage(d);
    }

    @Override
    public void takeDamage(int damage) {

        damage = (int) (damage*0.8);

        System.out.println("super zombie blev angrebet med "+damage);

        super.takeDamage(damage);
    }
}
