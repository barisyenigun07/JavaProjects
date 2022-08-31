package CENG211_HW3;

public interface IPackage<T> {
    String getType();
    int getWeight();
    int getWidth();
    int getHeight();
    int getLength();
    T getCargoCode();
    int getDesi();
    int getSize();
    String getDeliveryDay();
}
