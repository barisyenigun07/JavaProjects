package CENG211_HW2;

public class Truck extends Vehicle {
    private String typeOfTruckBed;
    public Truck(String insuranceNumber, int yearOfInsurance, String plateCity, double engineVolume, int yearOfProduction, String typeOfGear, int fuelTankVolume,String typeOfTruckBed) {
        super(insuranceNumber, yearOfInsurance, plateCity, engineVolume, yearOfProduction, typeOfGear, fuelTankVolume);
        this.setTypeOfTruckBed(typeOfTruckBed);
    }

    public String getTypeOfTruckBed() {
        return typeOfTruckBed;
    }

    public void setTypeOfTruckBed(String typeOfTruckBed) {
        this.typeOfTruckBed = typeOfTruckBed;
    }
    public double getTypeOfTruckBedFactor(){
        if (getTypeOfTruckBed().equals("trailer")){
            return 0.87;
        }
        else if (getTypeOfTruckBed().equals("tanker")){
            return 0.84;
        }
        else if (getTypeOfTruckBed().equals("regular")){
            return 0.15;
        }
        else{
            return 1;
        }
    }
    @Override
    public double calculateRiskFactor() {
        return (((getAge() * getAge() * getAge()) / (0.008 * getFuelTankVolume()) * getEngineVolume() * (getPlateCityFactor() * 0.03))) / (getTypeOfTruckBedFactor() * getTypeOfTruckBedFactor());
    }
}
