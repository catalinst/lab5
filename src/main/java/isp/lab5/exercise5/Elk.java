package isp.lab5.exercise5;

import java.util.Random;

public class Elk extends Animal implements Herbivorous {
    private int chanceToRunSuccessfully;
    private String name;

    public Elk(String name, int age, String species) {
        super(species, age);
        this.name = name;
        Random random = new Random();
        chanceToRunSuccessfully = random.nextInt(101);
    }

    @Override
    public void eat() {
        System.out.println("Elk is eating grass");
    }

    @Override
    public void runSuccessfully() {
        System.out.println("Elk " + name + " run successfully at age " + age + " with a chance of " + chanceToRunSuccessfully + "%");
    }

    @Override
    public void runFailed() {
        System.out.println("Elk " + name + " run failed at age " + age + " with a chance of " + chanceToRunSuccessfully + "%");
    }

    @Override
    public int getChancesToRunSuccessfully() {
        return chanceToRunSuccessfully;
    }

    @Override
    public String toString() {
        return "Elk{" +
                "chanceToRunSuccessfully=" + chanceToRunSuccessfully +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
