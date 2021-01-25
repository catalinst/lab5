package isp.lab5.exercise5;

import java.util.ArrayList;

public class Jungle {
    private ArrayList<Herbivorous> herbivores;
    private ArrayList<Carnivorous> carnivores;

    public Jungle(ArrayList<Herbivorous> herbivores, ArrayList<Carnivorous> carnivores) {
        this.herbivores = herbivores;
        this.carnivores = carnivores;
    }

    public ArrayList<Herbivorous> getHerbivores() {
        return herbivores;
    }

    public ArrayList<Carnivorous> getCarnivores() {
        return carnivores;
    }

    public void setHerbivores(ArrayList<Herbivorous> herbivores) {
        this.herbivores = herbivores;
    }

    public void setCarnivores(ArrayList<Carnivorous> carnivores) {
        this.carnivores = carnivores;
    }

    public void removeAnimalFromHerbivores(int index) {
        herbivores.remove(index);
    }

    public void removeAnimalFromCarnivores(int index) {
        carnivores.remove(index);
    }
}
