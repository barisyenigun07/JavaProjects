package Homework;

public class Item{
    private String name;
    private double weight;
    private int gain;
    private double value;

    public Item(String name,double weight,int gain,double value){
        this.setName(name);
        this.setWeight(weight);
        this.setGain(gain);
        this.setValue(value);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getGain() {
        return gain;
    }

    public void setGain(int gain) {
        this.gain = gain;
    }
    public double getValue(){
        return value;
    }
    public void setValue(double value){
        this.value = value;
    }
}
