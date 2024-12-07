package products.kg;

import products.kg.animals.Animal;

import java.time.LocalDate;

public class Product {
    private LocalDate expirationDate; // срок годности
    private int price;
    private int kilogram;
    private String quality;

    public Product(LocalDate expirationDate, int price, int kilogram, String quality) {
        this.expirationDate = expirationDate;
        this.price = price;
        this.kilogram = kilogram;
        this.quality = quality;
    }

    public Product() {
    }


    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getKilogram() {
        return kilogram;
    }

    public void setKilogram(int kilogram) {
        this.kilogram = kilogram;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Product{" +
                "expirationDate=" + expirationDate +
                ", price=" + price +
                ", kilogram=" + kilogram +
                ", quality='" + quality + '\'' +
                '}';
    }
}
