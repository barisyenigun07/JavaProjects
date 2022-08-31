package Homework4;

public class Bakery implements IItem{
    private String bakeryName;
    private int calories;
    private int bakeryPrice;

    public Bakery(String bakeryName,int calories,int bakeryPrice){
        this.setBakeryName(bakeryName);
        this.setCalories(calories);
        this.setBakeryPrice(bakeryPrice);
    }


    @Override
    public String itemName() {
        return bakeryName;
    }

    @Override
    public int itemPrice() {
        return bakeryPrice;
    }

    @Override
    public String itemType() {
        return "Bakery";
    }

    @Override
    public int compareTo(IItem item) {
        if (this.bakeryPrice == item.itemPrice()){
            return 0;
        }
        else if (this.bakeryPrice < item.itemPrice()){
            return -1;
        }
        else{
            return 1;
        }
    }
    public int compareTo(Bakery bakery){
        if (this.calories == bakery.getCalories()){
            return 0;
        }
        else if (this.calories < bakery.getCalories()){
            return -1;
        }
        else{
            return 1;
        }
    }

    public String toString(){
        return itemType() + "," + itemName() + "," + itemPrice() + "," + getCalories();
    }

    public String getBakeryName() {
        return bakeryName;
    }

    public void setBakeryName(String bakeryName) {
        this.bakeryName = bakeryName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    public int getBakeryPrice(){
        return bakeryPrice;
    }
    public void setBakeryPrice(int bakeryPrice){
        this.bakeryPrice = bakeryPrice;
    }
}

