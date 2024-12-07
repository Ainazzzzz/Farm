package products.kg.plants;

public class Onion extends Plant {
    private String type;


    public Onion(String name, String category, boolean fresh, String type) {
        super(name, category, fresh);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Onion{" +
                super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
