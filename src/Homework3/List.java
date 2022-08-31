package Homework3;
import java.util.Arrays;
public class List<T> {
    private T[] list;
    private int numOfEntries;
    private boolean initialized = false;
    private static final int DEFAULT_CAPACITY = 25;
    private static final int MAX_CAPACITY = 10000;

    public List(){
        @SuppressWarnings("unchecked")
        T[] tempList = (T[]) new PurchaseQueue[DEFAULT_CAPACITY];
        list = tempList;
        numOfEntries = 0;
        initialized = true;
    }
    private void checkInitialization(){
        if (!initialized){
            throw new SecurityException("List is not initalized properly!");
        }
    }
    public void add(T newEntry){
        checkInitialization();
        list[numOfEntries + 1] = newEntry;
        numOfEntries++;
        ensureCapacity();
    }
    public T remove(int givenPosition){
        checkInitialization();

        if (givenPosition >= 1 && givenPosition <= numOfEntries){
            assert !isEmpty();
            T result = list[givenPosition];
            if (givenPosition < numOfEntries){
                removeGap(givenPosition);
            }
            numOfEntries--;
            return result;
        }
        else{
            throw new IndexOutOfBoundsException("Illegal position given to remove operation");
        }
    }
    public T[] toArray(){
        checkInitialization();
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new PurchaseQueue[numOfEntries];
        for (int i = 0;i < numOfEntries;i++){
            result[i] = list[i+1];
        }
        return result;
    }

    public int getLength(){
        return numOfEntries;
    }
    public boolean isEmpty(){
        return numOfEntries == 0;
    }
    private void ensureCapacity(){
        int capacity = list.length - 1;
        if (numOfEntries >= capacity){
            int newCapacity = 2 * capacity;
            list = Arrays.copyOf(list,newCapacity + 1);
        }
    }
    public void add(int newPosition,T newEntry){
        checkInitialization();
        if (newPosition >= 1 && newPosition <= numOfEntries + 1){
            if (newPosition <= numOfEntries){
                makeRoom(newPosition);
            }
            list[newPosition] = newEntry;
            numOfEntries++;
            ensureCapacity();
        }
        else{
            throw new IndexOutOfBoundsException("Given position of add's new entry is out of bounds!");
        }
    }
    private void makeRoom(int newPosition){
        assert newPosition >= 1 && newPosition <= numOfEntries + 1;
        int newIndex = newPosition;
        int lastIndex = numOfEntries;
        for (int i = lastIndex; i >= newIndex;i--){
            list[i+1] = list[i];
        }
    }

    private void removeGap(int givenPosition){
        assert givenPosition >= 1 && givenPosition < numOfEntries;
        int removedIndex = givenPosition;
        int lastIndex = numOfEntries;
        for (int i = removedIndex;i < lastIndex;i++){
            list[i] = list[i+1];
        }
    }
    public T getEntry(int givenPosition){
        checkInitialization();
        if (givenPosition >= 1 && givenPosition <= numOfEntries){
            assert !isEmpty();
            return list[givenPosition];
        }
        else{
            throw new IndexOutOfBoundsException("Illegal position given to getEntry operation.");
        }
    }
}
