package products.kg.animals;

public class Cow extends Animal{
    private boolean hasMilk;

    public Cow(String name, int age, String gender, boolean hasMilk) {
        super(name, age, gender);
        this.hasMilk = hasMilk;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }


}
