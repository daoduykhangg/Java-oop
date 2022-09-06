package homework.Lab_08_2;

import java.util.ArrayList;
import java.util.List;

public class Race {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Animal horse = new Horse(76);
        animalList.add(horse);

        Animal tiger = new Tiger(101);
        animalList.add(tiger);

        Animal dog = new Dog(61);
        animalList.add(dog);

        finWinner(animalList);
    }

    public static void finWinner(List<Animal> animalList) {
        int maxSpeed = 0;
        String animalName = null;
        for (Animal animal : animalList) {
            int speed = animal.getSpeed();
            if (speed > maxSpeed) {
                maxSpeed = speed;
                animalName = animal.getClass().getSimpleName();
            }
        }
        System.out.println("Winer is " + animalName + ", with speed: " + maxSpeed);
    }
}
