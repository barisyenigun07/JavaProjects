package CENG211_HW4;

public class Product {
    private int productId;
    private Producer producer;
    private String productName;
    private String productType;

    public Product(int productId,Producer producer,String productName,String productType){
        this.setProductId(productId);
        this.setProducer(producer);
        this.setProductName(productName);
        this.setProductType(productType);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
    public String toString(){
        return productName;
    }
}
