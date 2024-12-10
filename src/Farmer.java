import products.kg.animals.Animal;
import products.kg.plants.Plant;

import java.util.Arrays;
import java.util.Scanner;

public class Farmer {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private Animal[] animals;
    private Plant[] plants;
    private Request[] requests;

    public Farmer(String name, Animal[] animals, Plant[] plants) {
        this.name = name;
        this.animals = animals;
        this.plants = plants;
    }

    public Animal[] addAnimal(Animal animal) {
        Animal[] newAnimals = Arrays.copyOf(animals, animals.length + 1);
        newAnimals[newAnimals.length - 1] = animal;
        animals = newAnimals;
        return newAnimals;
    }

    public Plant[] addPlant(Plant plant) {
        Plant[] newPlants = Arrays.copyOf(plants, plants.length + 1);
        newPlants[newPlants.length - 1] = plant;
        plants = newPlants;
        return newPlants;
    }





    public Animal sellAnimalRequest() {
        Animal resultAnimal = null;
        if (this.requests != null) {
            if (requests.length == 0 || requests == null) {
                System.out.println("Нету запросов");
            } else {
                for (int i = 0; i < requests.length; i++) {
                    if (requests[i].getAnimalsOrPlants().equalsIgnoreCase("animal")) {
                        if (requests[i].isProcessed() == false) {
                            System.out.println(requests[i]);
                            System.out.println("Хотите отобрить ?");
                            boolean choiceA = sc.nextBoolean();
                            if (choiceA) {
                                resultAnimal= sellAnimal();
                                requests[i].setProcessed(true);
                            }
                        }
                    }
                }
            }
        }
        return resultAnimal;
    }



        public Plant sellPlantRequest () {
            if (this.requests != null) {
                if (requests.length == 0) {
                    System.out.println("Нету запросо");
                } else {
                    for (int i = 0; i < requests.length; i++) {
                        if (requests[i].getAnimalsOrPlants().equalsIgnoreCase("plant")) {
                            if (requests[i].isProcessed() == false) {
                                System.out.println(requests[i]);
                                System.out.println("Хотите отобрить  ? ");
                                boolean choiceP = sc.nextBoolean();
                                if (choiceP) {
                                    Plant resultPlant = sellPlant();
                                    requests[i].setProcessed(true);
                                    return resultPlant;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }



    public Animal sellAnimal(){
        System.out.println(Arrays.toString(animals));
        System.out.println("Выберите животное которого хотите продать");

        int choice = sc.nextInt();
        Animal[] newAnimals = new Animal[animals.length - 1];
        Animal choicedANimal = animals[choice];

        for (int i = 0; i < animals.length; i++) {
            if (i != choice){
                int newIndex = i < choice ? i : i - 1 ;
                newAnimals[newIndex] = animals[i];
            }
        }


        animals = newAnimals;
        return choicedANimal;
    }

    public Plant sellPlant(){
        System.out.println(Arrays.toString(plants));
        System.out.println("Выберите растение которого хотите продать");

        int choice = sc.nextInt();
        Plant[] newPlants = new Plant[plants.length - 1];
        Plant choicedPlant = plants[choice];

        for (int i = 0;  i < plants.length; i++) {
            if (i != choice){
                int newIndex = i < choice ? i : i - 1 ;
                newPlants[newIndex] = plants[i];
            }
        }

        plants = newPlants;

        return choicedPlant;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Request[] getRequests() {
        return requests;
    }

    public void setRequests(Request[] requests) {
        this.requests = requests;
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