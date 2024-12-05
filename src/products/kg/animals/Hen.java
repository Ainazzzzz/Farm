package products.kg.animals;

public class Hen extends Animal {
private int eggCountPerDay;

    public Hen(String name, int age, String gender, int eggCountPerDay) {
        super(name, age, gender);
        this.eggCountPerDay = eggCountPerDay;
    }

    public int getEggCountPerDay() {
        return eggCountPerDay;
    }

    public void setEggCountPerDay(int eggCountPerDay) {
        this.eggCountPerDay = eggCountPerDay;
    }
}
