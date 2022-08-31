package Homework2;

public class Queue<T> implements QueueInterface<T>{
    private T queue[];
    private int frontIndex;
    private int backIndex;
    private int count;
    private boolean initialized = false;
    private static final int MAX_CAPACITY = 10;
    public Queue(){
        T[] tempQueue = (T[]) new String[MAX_CAPACITY];
        queue = tempQueue;
        frontIndex = 0;
        backIndex = -1;
        count = 0;
        initialized = true;
    }
    public void enqueue(T newEntry){
        checkInitialization();
        if (!isFull()){
            backIndex = (backIndex + 1) % queue.length;
            queue[backIndex] = newEntry;
            count++;
        }
    }
    public T getFront(){
        checkInitialization();
        if (isEmpty()){
            System.out.println();
        }
        return queue[frontIndex];
    }

    public T dequeue(){
        checkInitialization();
        if (isEmpty()){
            System.out.println();
        }
        T front = queue[frontIndex];
        queue[frontIndex] = null;
        frontIndex = (frontIndex + 1) % queue.length;
        count--;
        return front;

    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public int size(){
        return count;
    }
    public boolean isFull(){
        return size() == MAX_CAPACITY;
    }
    private void checkInitialization(){
        if (!initialized){
            throw new SecurityException("Queue is not initialized properly!");
        }
    }
}
