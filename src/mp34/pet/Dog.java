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
public class Dog extends Pet {
    public Dog() {
        super("Dog");
    }
    /**
     * Increases age of pet by 7.
     */
    @Override
    public void incAge() {
        if(this.getStatus().equals("Dead")) {
            return;
        } else {
            for(int k = 1; k <= 7; k++) {
                super.incAge();
            }
        }
    }
}
