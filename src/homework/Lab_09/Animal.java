package homework.Lab_09;

import java.security.SecureRandom;

public class Animal {
    private int speed;
    private boolean flyAble;
    private String name;

    public Animal(Builder builder) {
        this.speed = builder.speed;
        this.flyAble = builder.flyAble;
        this.name = builder.name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public boolean isFlyAble() {
        return flyAble;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                ", flyAble=" + flyAble +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean flyAble;

        public Builder withName(String animalName) {
            this.name = animalName;
            return this;
        }

        public Builder withSpeed(int maxSpeed) {
            this.speed = new SecureRandom().nextInt(maxSpeed);
            return this;
        }

        public Builder withWings(boolean withWings) {
            this.flyAble = withWings;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
