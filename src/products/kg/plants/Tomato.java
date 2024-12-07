package products.kg.plants;

public class Tomato extends Plant {

    public Tomato(String name, String category, boolean fresh) {
        super(name, category, fresh);
    }


    @Override
    public String toString() {
        return "Tomato{}"+
                super.toString();
    }
}
