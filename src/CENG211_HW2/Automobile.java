package CENG211_HW2;

public class Automobile extends Vehicle {
    private String typeOfRoof;
    public Automobile(String insuranceNumber, int yearOfInsurance, String plateCity, double engineVolume, int yearOfProduction, String typeOfGear, int fuelTankVolume, String typeOfRoof) {
        super(insuranceNumber, yearOfInsurance, plateCity, engineVolume, yearOfProduction, typeOfGear, fuelTankVolume);
        this.setTypeOfRoof(typeOfRoof);
    }

    public String getTypeOfRoof() {
        return typeOfRoof;
    }

    public void setTypeOfRoof(String typeOfRoof) {
        this.typeOfRoof = typeOfRoof;
    }
    public double getTypeOfRoofFactor(){
        if (getTypeOfRoof().equals("regular")){
            return 0.1;
        }
        else if (getTypeOfRoof().equals("sunroof")){
            return 0.64;
        }
        else if (getTypeOfRoof().equals("moonroof")){
            return 0.48;
        }
        else{
            return 1;
        }
    }
    @Override
    public double calculateRiskFactor() {
        return ((getEngineVolume() * (0.004 * getFuelTankVolume())) * getAge() * (getPlateCityFactor() * 0.03)) / getTypeOfRoofFactor();
    }
}
