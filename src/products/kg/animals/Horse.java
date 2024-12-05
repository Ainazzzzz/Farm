package products.kg.animals;

public class Horse extends Animal {
    private float weight;
    public Horse(String name, int age, String gender, float weight) {
        super(name, age, gender);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}
