package mp34.pet;

/**
 *
 * @author MJNeff18579
 */
public class Pet {
    //Fields
    private int age;
    private String type;
    private String status;
    private static int numPets;
    
    //Constructor
    /**
     * Creates a pet object with an age of 0, Alive status, and chosen type.
     * @param t - The type of pet (Bird, Dog, or Fish).
     */
    public Pet(String t) {
    type = t;
    age = 0;
    status = "Alive";
    
    numPets++;
    }
    
    //Methods
    /**
     * Runs a random chance test to see if pet dies, chance increases with age.
     */
    public void expire() {
        if(status.equals("Dead")) {
            return;
        }
        double chance = (double)age/1000 + Math.random();
        if (chance > 1) {
            this.status = "Dead";
            System.out.println("Your " + this.type + " died at age " + this.age + ". :(");
            this.age = 0;
            numPets--;
            
        }
    }
    /**
     * Gets age of pet.
     * @return age
     */
    public double getAge() {
        return age;
    }
    /**
     * Gets number of pets.
     * @return numPets
     */
    public static int getNumPets() {
        return numPets;
    }
    /**
     * Gets status of pet.
     * @return status
     */
    public String getStatus() {
        return status;
    }
    /**
     * Gets type of pet.
     * @return type
     */
    public String getType() {
        return type;
    }
    /**
     * Increases age of pet by 1.
     */
    public void incAge(){
        this.age++;
    }
    /**
     * Returns pet's age, status, and type.
     * @return age, status, type
     */
    @Override
    public String toString() {
    return(this.age + ", " + this.status + ", " + this.type);
    } 
}
