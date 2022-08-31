package CENG211_HW1;

public class Transaction {
    private double purchasePrice;
    private double salePrice;
    private int numberOfSales;

    public Transaction(double purchasePrice,double salePrice,int numberOfSales){
        this.setPurchasePrice(purchasePrice);
        this.setSalePrice(salePrice);
        this.setNumberOfSales(numberOfSales);
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }
}
