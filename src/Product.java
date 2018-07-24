public class Product {
    private String productName;
    private String productManufacturer;
    private String price;

    public Product(String productName, String productManufacturer, String price) {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
