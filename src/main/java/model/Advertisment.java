package model;

public class Advertisment {
    private String name;
    private String price;

    public Advertisment(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Advertisment{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
