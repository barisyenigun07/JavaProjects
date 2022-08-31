package Homework4;

public class Frappuccino implements IItem {
    private String frappuccinoName;
    private String frappuccinoSize;
    private int frappuccinoPrice;
    public Frappuccino(String frappuccinoName,String frappuccinoSize,int frappuccinoPrice){
        this.setFrappuccinoName(frappuccinoName);
        this.setFrappuccinoSize(frappuccinoSize);
        this.setFrappuccinoPrice(frappuccinoPrice);
    }

    @Override
    public String itemName() {
        return getFrappuccinoName();
    }

    @Override
    public int itemPrice() {
        return getFrappuccinoPrice();
    }

    @Override
    public String itemType() {
        return "Frappuccino";
    }

    @Override
    public int compareTo(IItem item) {
        if (this.frappuccinoPrice == item.itemPrice()){
            return 0;
        }
        else if (this.frappuccinoPrice < item.itemPrice()){
            return -1;
        }
        else{
            return 1;
        }
    }

    public String toString(){
        return itemType() + "," + itemName() + "," + itemPrice() + "," + getFrappuccinoSize();
    }

    public String getFrappuccinoName() {
        return frappuccinoName;
    }

    public void setFrappuccinoName(String frappuccinoName) {
        this.frappuccinoName = frappuccinoName;
    }

    public String getFrappuccinoSize() {
        return frappuccinoSize;
    }

    public void setFrappuccinoSize(String frappucinoSize) {
        this.frappuccinoSize = frappucinoSize;
    }
    public int getFrappuccinoPrice(){
        return frappuccinoPrice;
    }
    public void setFrappuccinoPrice(int frappuccinoPrice){
        this.frappuccinoPrice = frappuccinoPrice;
    }
}
