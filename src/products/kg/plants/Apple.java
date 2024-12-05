package products.kg.plants;

public class Apple extends Plant {
    private String color;

    public Apple(String name, String category, boolean fresh, String color) {
        super(name, category, fresh);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
