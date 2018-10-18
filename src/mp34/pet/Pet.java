/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public Pet(String t) {
    type = t;
    age = 0;
    status = "Alive";
    
    numPets++;
    }
    
    //Methods
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
    
    public double getAge() {
        return age;
    }
    public static int getNumPets() {
        return numPets;
    }
    public String getStatus() {
        return status;
    }
    public String getType() {
        return type;
    }
    
    public void incAge(){
        this.age++;
    }
    @Override
    public String toString() {
    return(this.age + ", " + this.status + ", " + this.type);
    } 
}
