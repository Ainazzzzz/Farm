package products.kg.plants;

import products.kg.Product;

public class Plant extends Product {
    private String name;
    private String category;
    private boolean fresh;


    public Plant(String name, String category, boolean fresh) {
        this.name = name;
        this.category = category;
        this.fresh = fresh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }


    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", fresh=" + fresh +
                '}';
    }
}
