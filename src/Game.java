import java.util.Random;

public class Game {

    // Initialize modstandere
    Plant plante = new Plant("Plante");


    SuperZombie zombie = new SuperZombie("Zombie", 200);


    public void start(){

        Random random = new Random();

        boolean zombieHit = random.nextBoolean(); // Random boolean

        while(zombie.getHealth() != 0 || plante.getHealth() != 0){

            if (zombieHit){
                System.out.println("zombie angreb");
                zombie.attack(plante);
            }
            else{
                System.out.println("plante angreb");
                plante.attack(zombie);
            }

            zombieHit = !zombieHit;
        }

    }
}
