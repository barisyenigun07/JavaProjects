package CENG211_HW2;

public class Vehicle extends InsuredValue {
    private String plateCity;
    private double engineVolume;
    private int yearOfProduction;
    private String typeOfGear;
    private int fuelTankVolume;

    public Vehicle(String insuranceNumber, int yearOfInsurance, String plateCity, double engineVolume, int yearOfProduction, String typeOfGear, int fuelTankVolume) {
        super(insuranceNumber, yearOfInsurance);
        this.setPlateCity(plateCity);
        this.setEngineVolume(engineVolume);
        this.setYearOfProduction(yearOfProduction);
        this.setTypeOfGear(typeOfGear);
        this.setFuelTankVolume(fuelTankVolume);
    }

    public String getPlateCity() {
        return plateCity;
    }

    public void setPlateCity(String plateCity) {
        this.plateCity = plateCity;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getTypeOfGear() {
        return typeOfGear;
    }

    public void setTypeOfGear(String typeOfGear) {
        this.typeOfGear = typeOfGear;
    }

    public int getFuelTankVolume() {
        return fuelTankVolume;
    }

    public void setFuelTankVolume(int fuelTankVolume) {
        this.fuelTankVolume = fuelTankVolume;
    }
    public int getAge(){
        return 2020 - getYearOfProduction();
    }
    public double getPlateCityFactor(){
        if (getPlateCity().equals("Izmir")){
            return 0.78;
        }
        else if (getPlateCity().equals("Istanbul")){
            return 0.97;
        }
        else if (getPlateCity().equals("Ankara")){
            return 0.85;
        }
        else{
            return 0.65;
        }
    }
}
