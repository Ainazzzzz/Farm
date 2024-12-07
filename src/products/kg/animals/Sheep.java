package products.kg.animals;

public class Sheep extends Animal {
    private float wool;
    public Sheep(String name, int age, String gender, double weight,  float wool) {
        super(name, age, gender, weight);
        this.wool = wool;
    }

    public float getWool() {
        return wool;
    }

    public void setWool(float wool) {
        this.wool = wool;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                super.toString() +
                "wool=" + wool +
                '}';
    }
}
