package products.kg.animals;

public class Cow extends Animal{
    private boolean hasMilk;

    public Cow(String name, int age, String gender, double weight,  boolean hasMilk) {
        super(name, age, gender, weight);
        this.hasMilk = hasMilk;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }


    @Override
    public String toString() {
        return "Cow{" +
                super.toString() +
                "hasMilk=" + hasMilk +
                '}';
    }
}
