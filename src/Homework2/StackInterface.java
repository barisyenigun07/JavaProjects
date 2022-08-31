package Homework2;

public interface StackInterface<T> {
    void push(T anEntry);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
    void clear();
}
