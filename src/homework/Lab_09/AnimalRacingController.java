package homework.Lab_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalRacingController {
    public static void main(String[] args) {
        Animal tiger = new Animal.Builder().withName("Tiger").withSpeed(100).withWings(false).build();
        Animal horse = new Animal.Builder().withName("Horse").withSpeed(75).withWings(false).build();
        Animal dog = new Animal.Builder().withName("Dog").withSpeed(60).withWings(false).build();
        Animal eagle = new Animal.Builder().withName("Eagle").withSpeed(80).withWings(true).build();

        Animal winner = new AnimalRacingController().getWinner(Arrays.asList(tiger, horse, dog, eagle));
        System.out.printf("The winner is %s, with speed %d ", winner.getName(), winner.getSpeed());
    }

    public Animal getWinner(List<Animal> animalList) {
        Animal winner = null;
        if (animalList == null || animalList.isEmpty()) {
            throw new IllegalArgumentException("Please provide a not null or empty animal list");
        }

        List<Animal> notFlyAbleAnimal = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyAble()) {
                notFlyAbleAnimal.add(animal);
            }
        }
        System.out.println(notFlyAbleAnimal);

        if (notFlyAbleAnimal.isEmpty()) {
            throw new IllegalArgumentException("There is no eligible animal to race!");
        } else if (notFlyAbleAnimal.size() == 1) {
            winner = notFlyAbleAnimal.get(0);
        } else {
            for (Animal animal : notFlyAbleAnimal) {
                if (winner == null) {
                    winner = animal;
                } else {
                    if (winner.getSpeed() < animal.getSpeed())
                        winner = animal;
                }
            }
        }
        return winner;
    }
}
