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
public class Fish extends Pet {
    public Fish() {
        super("Fish");
    }
    /**
     * Increases age of pet by 10.
     */
    @Override
    public void incAge() {
        if(this.getStatus().equals("Dead")) {
            return;
        } else {
            for(int k = 1; k <= 10; k++) {
                super.incAge();
            }
        }
    }
}