package grocery;

public class Product {
    private String productId;
    private String productName;

    public Product(){}

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public int hashCode() {
        int random = 31;
        int hash = random + productId.hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return this.productId +"-> "+ this.productName;
    }

    @Override
    public boolean equals(Object productId) {
        return this.getProductId().equals(productId);
    }
}
