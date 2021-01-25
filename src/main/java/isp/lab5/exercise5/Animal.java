package isp.lab5.exercise5;

public abstract class Animal {
    protected String species;
    protected int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    abstract void eat();
}
