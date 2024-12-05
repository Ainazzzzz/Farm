package products.kg.plants;

public class Cucumber extends Plant {
    private int height;
    private String production;


    public Cucumber(String name, String category, boolean fresh) {
        super(name, category, fresh);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }
}
