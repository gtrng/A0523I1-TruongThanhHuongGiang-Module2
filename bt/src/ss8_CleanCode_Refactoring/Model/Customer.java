package ss8_CleanCode_Refactoring;

public class Customer {
    private int id;
    private String name;
    private double price;
    private String productDescription;

    public Customer() {
    }

    public Customer(int id, String name, double price, String productDescription) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productDescription = productDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }


}
