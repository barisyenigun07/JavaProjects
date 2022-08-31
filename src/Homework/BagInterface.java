package Homework;

public interface BagInterface<T>{
     int getCurrentSize();
     boolean isEmpty();
     boolean add(T newItem);
     T remove();
     boolean remove(T anItem);
     void clear();
     T[] toArray();
}
