package products.kg.animals;

public class Horse extends Animal {
    public Horse(String name, int age, String gender, double weight) {
        super(name, age, gender, weight);
    }


    @Override
    public String toString() {
        return "Horse{}" +
                super.toString() +
                "";
    }
}
