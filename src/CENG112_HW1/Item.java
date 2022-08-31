package CENG112_HW1;

public class Item {
    private String itemName;
    private String itemCompartment;
    private int weight;

    public Item(String itemName,String itemCompartment,int weight){
        this.setItemName(itemName);
        this.setItemCompartment(itemCompartment);
        this.setWeight(weight);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCompartment() {
        return itemCompartment;
    }

    public void setItemCompartment(String itemCompartment) {
        this.itemCompartment = itemCompartment;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String toString(){
        return itemName;
    }
}
