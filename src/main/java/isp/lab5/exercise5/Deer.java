package isp.lab5.exercise5;

import java.util.Random;

public class Deer extends Animal implements Herbivorous {
    private int chanceToRunSuccessfully;
    private String name;
    private int age;

    public Deer(String name, int age) {
        this.name = name;
        this.age = age;
        Random random = new Random();
        chanceToRunSuccessfully = random.nextInt(101);
    }

    @Override
    public void eat() {
        System.out.println("Deer is eating mushrooms");
    }

    @Override
    public void runSuccessfully() {
        System.out.println("Deer " + name + " run successfully at age " + age + " with a chance of " + chanceToRunSuccessfully + "%");
    }

    @Override
    public void runFailed() {
        System.out.println("Deer " + name + " run failed  at age " + age + " with a chance of " + chanceToRunSuccessfully + "%");
    }

    @Override
    public int getChancesToRunSuccessfully() {
        return chanceToRunSuccessfully;
    }

    @Override
    public String toString() {
        return "Deer{" +
                "chanceToRunSuccessfully=" + chanceToRunSuccessfully +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
