package products.kg;

import java.time.LocalDate;

public class Product {
    private LocalDate expirationDate;
    private int price;
    private int quantity;
    private String quality;

    public Product(LocalDate expirationDate, int price, int quantity, String quality) {
        this.expirationDate = expirationDate;
        this.price = price;
        this.quantity = quantity;
        this.quality = quality;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
                ", quantity=" + quantity +
                ", quality='" + quality + '\'' +
                '}';
    }
}
