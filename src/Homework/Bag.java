package Homework;

import java.util.Arrays;

public class Bag<T> implements BagInterface<T>{
    private T[] bag;
    private int numOfItems;
    private int default_capacity = 10;

    public Bag(){
        T[] tempBag = (T[]) new Item[default_capacity];
        bag = tempBag;
        numOfItems = 0;

    }
    @Override
    public int getCurrentSize() {
        return numOfItems;
    }

    @Override
    public boolean isEmpty() {
        return numOfItems == 0;
    }

    @Override
    public boolean add(T newItem) {
        if(isArrayFull()){
            increaseCapacity();
            bag[numOfItems] = newItem;
            numOfItems++;
        }
        else{
            bag[numOfItems] = newItem;
            numOfItems++;
        }
        return true;
    }

    @Override
    public T remove() {
        T result = null;
        if (numOfItems > 0){
            result = bag[numOfItems - 1];
            bag[numOfItems - 1] = null;
            numOfItems--;
        }
        return result;
    }
    @Override
    public boolean remove(T anItem) {
        int index = getIndexOf(anItem);
        T result = removeItem(index);
        return anItem.equals(result);
    }

    @Override
    public void clear() {
        while (!isEmpty()){
            remove();
        }
    }
    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Item[numOfItems];
        for (int index = 0;index < numOfItems;index++){
            result[index] = bag[index];
        }
        return result;
    }
    private void increaseCapacity(){
        int newLength = bag.length + 1;
        bag = Arrays.copyOf(bag,newLength);
    }
    private boolean isArrayFull(){
        return (numOfItems >= bag.length);
    }
    private int getIndexOf(T anItem){
        int where = -1;
        boolean found = false;
        int index = 0;
        while (!found && (index < numOfItems)){
            if (anItem.equals(bag[index])){
                found = true;
                where = index;
            }
            index++;
        }
        return where;
    }
    private T removeItem(int givenIndex){
        T result = null;
        if (!isEmpty() && (givenIndex >= 0)){
            result = bag[givenIndex];
            bag[givenIndex] = bag[numOfItems - 1];
            bag[numOfItems -1] = null;
            numOfItems--;
        }
        return result;
    }
}


