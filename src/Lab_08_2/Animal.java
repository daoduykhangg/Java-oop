package Lab_08_2;

import java.security.SecureRandom;

public class Animal {
    protected int speed;

    public Animal(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public int getSpeed() {
        return speed;
    }
}
