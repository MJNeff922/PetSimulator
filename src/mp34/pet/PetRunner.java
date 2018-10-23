package mp34.pet;

import java.util.Scanner;

/**
 *
 * @author MJNeff18579
 */
public class PetRunner {

    /**
     * Simulates the life of three pets, giving their average age each year until they die.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year = 2018;
        Scanner prompt = new Scanner(System.in);
        
        //Initialize pets.
        Pet Alfie = new Dog();
        System.out.println("You have " + Pet.getNumPets() + " pets.");
        Pet Wally = new Bird();
        System.out.println("You have " + Pet.getNumPets() + " pets.");
        Pet Waluigi = new Fish();
        System.out.println("You have " + Pet.getNumPets() + " pets.");
        
        System.out.println(Alfie);
        System.out.println(Wally);
        System.out.println(Waluigi);
        
        //Runs simulation loop.
        do {
            System.out.println("The year is " + year);
            if (Alfie.getStatus().equals("Alive")) {
                System.out.println("Alfie is " + Alfie.getAge() + " years old.");
            }
            if (Wally.getStatus().equals("Alive")) {
                System.out.println("Wally is " + Wally.getAge() + " years old.");
            }
            if (Waluigi.getStatus().equals("Alive")) {
                System.out.println("Waluigi is " + Waluigi.getAge() + " years old.");
            }
            System.out.println("You have " + Pet.getNumPets() + " pets and their average age is " + ((Alfie.getAge() + Wally.getAge() + Waluigi.getAge())/Pet.getNumPets()));
            System.out.println("Press enter to continue.");
            System.out.println("------------------------------");
            prompt.nextLine();
            
            //Death check and age increase.
            Alfie.expire();
            Alfie.incAge();
            Wally.expire();
            Wally.incAge();
            Waluigi.expire();
            Waluigi.incAge();
            
            year++;
        } while (Pet.getNumPets() > 0);
        System.out.println("All of your pets are dead. RIP.");
        prompt.close();
    }
    
}
