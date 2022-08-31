package CENG112_HW1;

public interface IBag<T> {
    boolean add(T newItem);
    boolean isEmpty();
    boolean isFull();
    T removeByIndex(int index);
    T remove(T item);
    int getItemCount();
    int getIndexOf(T item);
    boolean contains(T item);
    void displayItems();
    void dump();
    boolean transferTo(IBag<T> targetBag,T item);
}
