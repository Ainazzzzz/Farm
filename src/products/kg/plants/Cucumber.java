package products.kg.plants;

public class Cucumber extends Plant {
    private int height;
    private String production;


    public Cucumber(String name, String category, boolean fresh, int height, String  production) {
        super(name, category, fresh);
        this.height = height;
        this.production = production;
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


    @Override
    public String toString() {
        return "Cucumber{" +
                super.toString() +
                "height=" + height +
                ", production='" + production + '\'' +
                '}';
    }
}
