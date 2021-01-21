package isp.lab5.exercise5;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Jungle {
    private Herbivorous[] herbivores;
    private Carnivorous[] carnivores;

    public Jungle(Herbivorous[] herbivores, Carnivorous[] carnivores) {
        this.herbivores = herbivores;
        this.carnivores = carnivores;
    }

    public Herbivorous[] getHerbivores() {
        return herbivores;
    }

    public Carnivorous[] getCarnivores() {
        return carnivores;
    }

    public void setHerbivores(Herbivorous[] herbivores) {
        this.herbivores = herbivores;
    }

    public void setCarnivores(Carnivorous[] carnivores) {
        this.carnivores = carnivores;
    }

    public Herbivorous[] removeAnimalFromHerbivores(int index) {
        Herbivorous[] newHerbivores = ArrayUtils.remove(herbivores, index);
        System.out.println("--------");
        System.out.println("Now we have only " + Arrays.toString(newHerbivores));
        setHerbivores(newHerbivores);
        return newHerbivores;
    }

    public Carnivorous[] removeAnimalFromCarnivores(int index) {
        Carnivorous[] newCarnivores = ArrayUtils.remove(carnivores, index);
        System.out.println("--------");
        System.out.println("Now we have only " + Arrays.toString(newCarnivores));
        setCarnivores(newCarnivores);
        return newCarnivores;
    }
}
