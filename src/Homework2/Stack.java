package Homework2;

import java.util.EmptyStackException;

public class Stack<T> implements StackInterface<T>{
    private T[] stack;
    private int topIndex;
    private boolean initialized = false;
    private static final int DEFAULT_CAPACITY = 1;
    private static final int MAX_CAPACITY = 10;

    public Stack(){
        T[] tempStack = (T[]) new String[MAX_CAPACITY];
        stack = tempStack;
        topIndex = -1;
        initialized = true;
    }
    public void push(T newEntry){
        if (isFull()){
            System.out.println("The stack is full!");
        }
        checkInitialization();
        stack[topIndex + 1] = newEntry;
        topIndex++;
    }
    public T peek(){
        checkInitialization();
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else{
            return stack[topIndex];
        }
    }
    public T pop(){
        checkInitialization();
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else{
            T top = stack[topIndex];
            stack[topIndex] = null;
            topIndex--;
            return top;
        }
    }
    public boolean isEmpty(){
        return topIndex == -1;
    }
    public void clear(){
        while (!isEmpty()){
            pop();
        }
    }
    public int size(){
        return topIndex + 1;
    }
    private void checkInitialization(){
        if (!initialized){
            throw new SecurityException("Stack is not initialized properly!");
        }
    }
    public boolean isFull(){
        return size() == MAX_CAPACITY;
    }

}
