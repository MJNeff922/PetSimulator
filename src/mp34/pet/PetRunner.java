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

import java.util.Scanner;

public class PetRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year = 2018;
        Scanner prompt = new Scanner(System.in);
        
        Pet Alfie = new Dog();
        System.out.println("You have " + Pet.getNumPets() + " pets.");
        Pet Wally = new Bird();
        System.out.println("You have " + Pet.getNumPets() + " pets.");
        Pet Mero = new Fish();
        System.out.println("You have " + Pet.getNumPets() + " pets.");
        
        System.out.println(Alfie);
        System.out.println(Wally);
        System.out.println(Mero);
            
        do {
            System.out.println("The year is " + year);
            if (Alfie.getStatus().equals("Alive")) {
                System.out.println("Alfie is " + Alfie.getAge() + " years old.");
            }
            if (Wally.getStatus().equals("Alive")) {
                System.out.println("Wally is " + Wally.getAge() + " years old.");
            }
            if (Mero.getStatus().equals("Alive")) {
                System.out.println("Mero is " + Mero.getAge() + " years old.");
            }
            
            System.out.println("Press enter to continue.");
            System.out.println("------------------------------");
            prompt.nextLine();
            
            Alfie.expire();
            Alfie.incAge();
            Wally.expire();
            Wally.incAge();
            Mero.expire();
            Mero.incAge();
            
            year++;
        } while (Pet.getNumPets() > 0);
        System.out.println("All of your pets are dead. RIP.");
        prompt.close();
    }
    
}
