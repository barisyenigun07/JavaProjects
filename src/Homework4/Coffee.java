package Homework4;

public class Coffee implements IItem {
    private String coffeeName;
    private String coffeeSize;
    private int coffeePrice;

    public Coffee(String coffeeName,String coffeeSize,int coffeePrice){
        this.setCoffeeName(coffeeName);
        this.setCoffeeSize(coffeeSize);
        this.setCoffeePrice(coffeePrice);
    }

    @Override
    public String itemName() {
        return getCoffeeName();
    }

    @Override
    public String itemType() {
        return "Coffee";
    }

    @Override
    public int itemPrice() {
        return getCoffeePrice();
    }

    @Override
    public int compareTo(IItem item) {
        if (this.coffeePrice == item.itemPrice()){
            return 0;
        }
        else if (this.coffeePrice < item.itemPrice()){
            return -1;
        }
        else{
            return 1;
        }
    }
    public String toString(){
        return itemType() + "," + itemName() + "," + itemPrice() + "," + getCoffeeSize();
    }
    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getCoffeeSize() {
        return coffeeSize;
    }

    public void setCoffeeSize(String coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }

    public void setCoffeePrice(int coffeePrice) {
        this.coffeePrice = coffeePrice;
    }
}
