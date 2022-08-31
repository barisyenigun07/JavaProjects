package Homework4;

public class Tea implements IItem {
    private String teaName;
    private String teaSize;
    private int teaPrice;
    public Tea(String teaName,String teaSize,int teaPrice){
        this.setTeaName(teaName);
        this.setTeaSize(teaSize);
        this.setTeaPrice(teaPrice);
    }

    @Override
    public String itemName() {
        return getTeaName();
    }

    @Override
    public String itemType() {
        return "Tea";
    }

    @Override
    public int itemPrice() {
        return getTeaPrice();
    }

    @Override
    public int compareTo(IItem item) {
        if (this.teaPrice == item.itemPrice()){
            return 0;
        }
        else if (this.teaPrice < item.itemPrice()){
            return -1;
        }
        else{
            return 1;
        }
    }

    public String toString(){
        return itemType() + "," + itemName() + "," + itemPrice() + "," + getTeaSize();
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaSize() {
        return teaSize;
    }

    public void setTeaSize(String teaSize) {
        this.teaSize = teaSize;
    }
    public int getTeaPrice(){
        return teaPrice;
    }
    public void setTeaPrice(int teaPrice){
        this.teaPrice = teaPrice;
    }
}
