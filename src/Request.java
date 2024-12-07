import customer.Customer;
import products.kg.Product;

public class Request {
    private Customer customer;
    private String animalsOrPlants;
    private String whatRequest;
    private int kilogram;
    private boolean processed; // по умолчанию false. После того как оно становиться true минусуется.

    public Request(Customer customer, String animalsOrPlants, String whatRequest, int kilogram, boolean processed) {
        this.customer = customer;
        this.animalsOrPlants = animalsOrPlants;
        this.whatRequest = whatRequest;
        this.kilogram = kilogram;
        this.processed = processed;
    }


    public String getAnimalsOrPlants() {
        return animalsOrPlants;
    }

    public void setAnimalsOrPlants(String animalsOrPlants) {
        this.animalsOrPlants = animalsOrPlants;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getWhatRequest() {
        return whatRequest;
    }

    public void setWhatRequest(String whatRequest) {
        this.whatRequest = whatRequest;
    }

    public int getKilogram() {
        return kilogram;
    }

    public void setKilogram(int kilogram) {
        this.kilogram = kilogram;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }


    @Override
    public String toString() {
        return "Request{" +
                "customer=" + customer +
                ", whatRequest='" + whatRequest + '\'' +
                ", kilogram=" + kilogram +
                ", processed=" + processed +
                '}';
    }
}
