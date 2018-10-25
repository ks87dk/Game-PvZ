public class Game {
    // Initialize modstandere
    Plant plante = new Plant();
    Zombie zombie = new Zombie();


    public void start(){
        boolean zombieHit = true;

        while(zombie.getHealth() != 0 || plante.getHealth() != 0){
            if (zombieHit){
                zombie.attack(plante);
            }
            else{
                plante.attack(zombie);
            }
            zombieHit = !zombieHit;
        }

    }
}
