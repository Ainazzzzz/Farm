import products.kg.animals.Animal;
import products.kg.plants.Plant;

import java.util.Arrays;

public class Farmer {
    private String name;
    private Animal[] animals;
    private Plant[] plants;

    public Farmer(String name, Animal[] animals, Plant[] plants) {
        this.name = name;
        this.animals = animals;
        this.plants = plants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Plant[] getPlants() {
        return plants;
    }

    public void setPlants(Plant[] plants) {
        this.plants = plants;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                ", animals=" + Arrays.toString(animals) +
                ", plants=" + Arrays.toString(plants) +
                '}';
    }
}
