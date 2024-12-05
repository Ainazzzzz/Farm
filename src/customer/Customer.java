package customer;

import products.kg.Product;

import java.util.Arrays;

public class Customer {
    private String name;
    private String address;
    private Product[] products;

    public Customer(String name, String address, Product[] products) {
        this.name = name;
        this.address = address;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "customer.Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }


}
