package Homework4;

public interface SearchTreeInterface{
    boolean contains(IItem entry);
    IItem getEntry(IItem entry);
    IItem add(IItem newEntry);
    void inorderTraverse();
    void reverseTraverse();
    void printLessOrEqual(int price);
    void printGreater(int price);
}
