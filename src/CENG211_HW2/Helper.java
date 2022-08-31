package CENG211_HW2;

import java.util.ArrayList;

public class Helper {
    private String[][] values;

    public Helper(){
        values = new FileIO().readValues();
    }
    public ArrayList<InsuredValue> getInsuredValues(){
        ArrayList<InsuredValue> insuredValues = new ArrayList<>();
        for (int i = 0;i < values.length;i++){
            String insuranceNumber = values[i][0];
            int yearOfInsurance = Integer.parseInt(values[i][1]);
            String val1 = values[i][2];
            String val2 = values[i][3];
            String val3 = values[i][4];
            String val4 = values[i][5];
            String val5 = values[i][6];
            String val6 = values[i][7];
            if (insuranceNumber.startsWith("W")){
                InsuredValue insuredValue = new Workplace(insuranceNumber,yearOfInsurance,val1,Integer.parseInt(val2),Integer.parseInt(val3),val4,Integer.parseInt(val5),Integer.parseInt(val6));
                insuredValues.add(insuredValue);
            }
            else if (insuranceNumber.startsWith("H")){
                InsuredValue insuredValue = new Housing(insuranceNumber,yearOfInsurance,val1,Integer.parseInt(val2),Integer.parseInt(val3),val4,Integer.parseInt(val5),val6);
                insuredValues.add(insuredValue);
            }
            else if (insuranceNumber.startsWith("P")){
                InsuredValue insuredValue = new Person(insuranceNumber,yearOfInsurance,val1,val2,val3,val4,Integer.parseInt(val5),val6);
                insuredValues.add(insuredValue);
            }
            else if (insuranceNumber.startsWith("A")){
                InsuredValue insuredValue = new Automobile(insuranceNumber,yearOfInsurance,val1,Double.parseDouble(val2),Integer.parseInt(val3),val4,Integer.parseInt(val5),val6);
                insuredValues.add(insuredValue);
            }
            else if (insuranceNumber.startsWith("T")){
                InsuredValue insuredValue = new Truck(insuranceNumber,yearOfInsurance,val1,Double.parseDouble(val2),Integer.parseInt(val3),val4,Integer.parseInt(val5),val6);
                insuredValues.add(insuredValue);
            }
        }
        return insuredValues;
    }
    public Insurance decideInsuranceType(InsuredValue insuredValue){
        if (insuredValue instanceof Workplace || insuredValue instanceof Housing){
            return new Household();
        }
        else if (insuredValue instanceof Person){
            return new Health();
        }
        else if (insuredValue instanceof Automobile || insuredValue instanceof Truck){
            return new Traffic();
        }
        else{
            return null;
        }
    }
}
