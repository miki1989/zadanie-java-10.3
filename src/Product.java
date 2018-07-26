public class Product {
    private String productName;
    private String productManufacturer;
    private double price;

    public Product(){

    }

    public Product(String productName, String productManufacturer, double price) {
        this.productName = productName;
        this.productManufacturer = productManufacturer;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
