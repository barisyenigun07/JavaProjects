package CENG211_HW2;

import java.util.ArrayList;

public class PolicyRecord {
    private ArrayList<InsuredValue> insuredValueList;

    public PolicyRecord(){
        insuredValueList = new Helper().getInsuredValues();
    }

    public ArrayList<InsuredValue> getInsuredValueList() {
        return insuredValueList;
    }
    public ArrayList<InsuredValue> getWorkPlaceList(){
        ArrayList<InsuredValue> workplaceList = new ArrayList<>();
        for (InsuredValue i : insuredValueList){
            if (i instanceof Workplace){
                workplaceList.add(i);
            }
        }
        return workplaceList;
    }
    public ArrayList<InsuredValue> getHousingList(){
        ArrayList<InsuredValue> housingList = new ArrayList<>();
        for (InsuredValue i : insuredValueList){
            if (i instanceof Housing){
                housingList.add(i);
            }
        }
        return housingList;
    }
    public ArrayList<InsuredValue> getPersonList(){
        ArrayList<InsuredValue> personList = new ArrayList<>();
        for (InsuredValue i : insuredValueList){
            if (i instanceof Person){
                personList.add(i);
            }
        }
        return personList;
    }
    public ArrayList<InsuredValue> getAutomobileList(){
        ArrayList<InsuredValue> automobileList = new ArrayList<>();
        for (InsuredValue i : insuredValueList){
            if (i instanceof Automobile){
                automobileList.add(i);
            }
        }
        return automobileList;
    }
    public ArrayList<InsuredValue> getTruckList(){
        ArrayList<InsuredValue> truckList = new ArrayList<>();
        for (InsuredValue i : insuredValueList){
            if (i instanceof Truck){
                truckList.add(i);
            }
        }
        return truckList;
    }
}
