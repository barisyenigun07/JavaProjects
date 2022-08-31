package Homework4;

public interface IItem {
    String itemName();
    String itemType();
    int itemPrice();
    int compareTo(IItem item);
}
