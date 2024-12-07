package products.kg.plants;

public class Rice extends Plant {
    private String production;


    public Rice(String name, String category, boolean fresh, String production) {
        super(name, category, fresh);
        this.production = production;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }


    @Override
    public String toString() {
        return "Rice{" +
                super.toString() +
                "production='" + production + '\'' +
                '}';
    }
}
