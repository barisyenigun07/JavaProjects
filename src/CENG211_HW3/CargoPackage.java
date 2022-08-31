package CENG211_HW3;

import java.time.LocalDate;

public abstract class CargoPackage<T> implements IPackage<T>{
    private String type;
    private int weight;
    private int width;
    private int length;
    private int height;
    private T cargoCode;

    public CargoPackage(String type,int weight,int width,int length,int height,T cargoCode){
        this.setType(type);
        this.setWeight(weight);
        this.setWidth(width);
        this.setLength(length);
        this.setHeight(height);
        this.setCargoCode(cargoCode);
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public T getCargoCode() {
        return cargoCode;
    }

    public void setCargoCode(T cargoCode) {
        this.cargoCode = cargoCode;
    }

    public Days getSystemDate(){
        Days systemDate = null;
        for (Days day : Days.values()){
            if (day.toString().equals(LocalDate.now().getDayOfWeek().toString())){
                systemDate = day;
                break;
            }
        }
        
        return systemDate;
    }
    public String getDeliveryDay(){
        Days systemDate = getSystemDate();
        Days deliveryDate = null;
        if (systemDate.equals(Days.SUNDAY)){
            return "NO DELIVERY";
        }
        for (Days d : Days.values()){
            if (d.compareTo(systemDate) == 2 || d.compareTo(systemDate) == -4){
                deliveryDate = d;
                break;
            }
        }
        return deliveryDate.toString();
    }
    public int getDesi(){
        return (width * length * height) / 3000;
    }
    public int getSize(){
        int desi = getDesi();
        return Math.max(desi,weight);
    }
}
