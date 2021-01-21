package isp.lab5.exercise5;

import java.util.Arrays;
import java.util.Random;

public class Simulator {
    private Jungle jungle;
    private Herbivorous[] herbivores = new Herbivorous[20];
    private Carnivorous[] carnivores = new Carnivorous[20];
    private Random random = new Random();

    public Simulator() {

        for (int i = 0; i < herbivores.length; i++) {
            herbivores[i] = generateHerbivorous();
        }

        for (int i = 0; i < carnivores.length; i++) {
            carnivores[i] = generateCarnivorous();
        }

        jungle = new Jungle(herbivores, carnivores);
    }

    private Herbivorous generateHerbivorous() {
        int number = random.nextInt(10) + 1;
        int age = random.nextInt(50) + 1;

        if (number % 2 == 0) {
            return new Elk("Elk " + number, age);
        } else {
            return new Deer("Deer " + number, age);
        }
    }

    private Carnivorous generateCarnivorous() {
        int number = random.nextInt(10) + 1;
        int age = random.nextInt(50) + 1;

        if (number % 2 == 0) {
            return new Lion("Lion " + number, age);
        } else {
            return new Tiger("Tiger " + number, age);
        }
    }

    public void simulate() {

        while (herbivores.length != 0 && carnivores.length != 0) {
            int randomHerbivore = (int) (Math.random() * (herbivores.length));
            int randomCarnivore = (int) (Math.random() * (carnivores.length));
            System.out.println(Arrays.toString(herbivores));
            System.out.println(Arrays.toString(carnivores));

            if (herbivores[randomHerbivore].getChancesToRunSuccessfully() == carnivores[randomCarnivore].getChancesToHuntSuccessfully()) {
                System.out.println("This round we have a draw");
            }

            if (herbivores[randomHerbivore].getChancesToRunSuccessfully() > carnivores[randomCarnivore].getChancesToHuntSuccessfully()) {
                herbivores[randomHerbivore].runSuccessfully();
                carnivores[randomCarnivore].huntFailed();
                carnivores = jungle.removeAnimalFromCarnivores(randomCarnivore);
            } else {
                carnivores[randomCarnivore].huntSuccessfully();
                herbivores[randomHerbivore].runFailed();
                herbivores = jungle.removeAnimalFromHerbivores(randomHerbivore);
            }

            System.out.println("----------");
            System.out.println("----------");
            System.out.println("----------");
        }

        if (herbivores.length == carnivores.length) {
            System.out.println("Wow, that was a nice draw");
        } else if (herbivores.length > carnivores.length) {
            System.out.println("Herbivores have won");
        } else {
            System.out.println("Carnivores have won");
        }

    }
}
