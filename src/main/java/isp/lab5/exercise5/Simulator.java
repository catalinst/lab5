package isp.lab5.exercise5;

import java.util.ArrayList;
import java.util.Random;

public class Simulator {
    private Jungle jungle;
    private ArrayList<Herbivorous> herbivores = new ArrayList<>();
    private ArrayList<Carnivorous> carnivores = new ArrayList<>();
    private Random random = new Random();

    public Simulator() {

        for (int i = 0; i < 20; i++) {
            herbivores.add(generateHerbivorous());
        }

        for (int i = 0; i < 20; i++) {
            carnivores.add(generateCarnivorous());
        }

        jungle = new Jungle(herbivores, carnivores);
    }

    private Herbivorous generateHerbivorous() {
        int number = random.nextInt(10) + 1;
        int age = random.nextInt(50) + 1;

        if (number % 2 == 0) {
            return new Elk("Elk" + number, age, "Herbivore");
        } else {
            return new Deer("Deer" + number, age, "Herbivore");
        }
    }

    private Carnivorous generateCarnivorous() {
        int number = random.nextInt(10) + 1;
        int age = random.nextInt(50) + 1;

        if (number % 2 == 0) {
            return new Lion("Lion" + number, age , "Carnivore");
        } else {
            return new Tiger("Tiger" + number, age, "Carnivore");
        }
    }

    public void simulate() {

        while (herbivores.size() != 0 && carnivores.size() != 0) {
            int randomHerbivore = (int) (Math.random() * (herbivores.size()));
            int randomCarnivore = (int) (Math.random() * (carnivores.size()));
            System.out.println(herbivores);
            System.out.println(carnivores);

            if (herbivores.get(randomHerbivore).getChancesToRunSuccessfully() == carnivores.get(randomCarnivore).getChancesToHuntSuccessfully()) {
                System.out.println("This round we have a draw");
            }

            if (herbivores.get(randomHerbivore).getChancesToRunSuccessfully() > carnivores.get(randomCarnivore).getChancesToHuntSuccessfully()) {
                herbivores.get(randomHerbivore).runSuccessfully();
                carnivores.get(randomCarnivore).huntFailed();
                jungle.removeAnimalFromCarnivores(randomCarnivore);
            } else {
                carnivores.get(randomCarnivore).huntSuccessfully();
                herbivores.get(randomHerbivore).runFailed();
                jungle.removeAnimalFromHerbivores(randomHerbivore);
            }

            System.out.println("----------");
            System.out.println("----------");
            System.out.println("----------");
        }

        if (herbivores.size() == carnivores.size()) {
            System.out.println("Wow, that was a nice draw");
        } else if (herbivores.size() > carnivores.size()) {
            System.out.println("Herbivores have won");
        } else {
            System.out.println("Carnivores have won");
        }

    }
}
