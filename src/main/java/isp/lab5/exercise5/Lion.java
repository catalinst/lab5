package isp.lab5.exercise5;

import java.util.Random;

public class Lion extends Animal implements Carnivorous {
    private int chanceToHuntSuccessfully;
    private String name;
    private int age;

    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
        Random random = new Random();
        chanceToHuntSuccessfully = random.nextInt(101);
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating meat");
    }

    @Override
    public void huntSuccessfully() {
        System.out.println("Lion " + name + " hunt successfully at age " + age + " with a chance of " + chanceToHuntSuccessfully + "%");
    }

    @Override
    public void huntFailed() {
        System.out.println("Lion " + name + " hunt failed at age " + age + " with a chance of " + chanceToHuntSuccessfully + "%");
    }

    @Override
    public int getChancesToHuntSuccessfully() {
        return chanceToHuntSuccessfully;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "chanceToHuntSuccessfully=" + chanceToHuntSuccessfully +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
