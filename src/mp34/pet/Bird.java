package mp34.pet;

/**
 *
 * @author MJNeff18579
 */
public class Bird extends Pet {
    public Bird() {
        super("Bird");
    }
    /**
     * Increases age of pet by 5.
     */
    @Override
    public void incAge() {
        if(this.getStatus().equals("Dead")) {
            return;
        } else {
            for(int k = 1; k <= 5; k++) {
                super.incAge();
            }
        }
    }
}
