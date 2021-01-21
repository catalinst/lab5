package isp.lab5.exercise5;

import java.util.Random;

public class Tiger extends Animal implements Carnivorous {
    private int chanceToHuntSuccessfully;
    private String name;
    private int age;

    public Tiger(String name, int age) {
        this.name = name;
        this.age = age;
        Random random = new Random();
        chanceToHuntSuccessfully = random.nextInt(101);
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating a deer");
    }

    @Override
    public void huntSuccessfully() {
        System.out.println("Tiger " + name + " hunt successfully at age " + age + " with a chance of " + chanceToHuntSuccessfully + "%");
    }

    @Override
    public void huntFailed() {
        System.out.println("Tiger " + name + " hunt failed at age " + age + " with a chance of " + chanceToHuntSuccessfully + "%");
    }

    @Override
    public int getChancesToHuntSuccessfully() {
        return chanceToHuntSuccessfully;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "chanceToHuntSuccessfully=" + chanceToHuntSuccessfully +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
