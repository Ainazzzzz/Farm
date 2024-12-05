package products.kg.plants;

public class Potato extends Plant {
    private String type;

    public Potato(String name, String category, boolean fresh, String type) {
        super(name, category, fresh);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
