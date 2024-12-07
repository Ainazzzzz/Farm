package products.kg.animals;

public class Hen extends Animal {
private int eggCountPerDay;

    public Hen(String name, int age, String gender,double weight,  int eggCountPerDay) {
        super(name, age, gender, weight);
        this.eggCountPerDay = eggCountPerDay;
    }

    public int getEggCountPerDay() {
        return eggCountPerDay;
    }

    public void setEggCountPerDay(int eggCountPerDay) {
        this.eggCountPerDay = eggCountPerDay;
    }

    @Override
    public String toString() {
        return "Hen{" +
                super.toString() +
                "eggCountPerDay=" + eggCountPerDay +
                '}';
    }
}
