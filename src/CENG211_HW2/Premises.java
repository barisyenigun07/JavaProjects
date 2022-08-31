package CENG211_HW2;

public class Premises extends InsuredValue {
    private String premisesCity;
    private int numberOfFloors;
    private int yearOfConstruction;
    private String typeOfConstruction;
    private int surfaceArea;
    private int annualRevenue;

    public Premises(String insuranceNumber,int yearOfInsurance,String premisesCity,int numberOfFloors,int yearOfConstruction,String typeOfConstruction,int surfaceArea){
        super(insuranceNumber, yearOfInsurance);
        this.setPremisesCity(premisesCity);
        this.setNumberOfFloors(numberOfFloors);
        this.setYearOfConstruction(yearOfConstruction);
        this.setTypeOfConstruction(typeOfConstruction);
        this.setSurfaceArea(surfaceArea);
    }

    public String getPremisesCity() {
        return premisesCity;
    }

    public void setPremisesCity(String premisesCity) {
        this.premisesCity = premisesCity;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getTypeOfConstruction() {
        return typeOfConstruction;
    }

    public void setTypeOfConstruction(String typeOfConstruction) {
        this.typeOfConstruction = typeOfConstruction;
    }

    public int getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(int surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getPremisesCityFactor(){
        if (getPremisesCity().equals("Izmir")){
            return 0.4;
        }
        else if (getPremisesCity().equals("Istanbul")){
            return 0.6;
        }
        else if (getPremisesCity().equals("Ankara")){
            return 0.15;
        }
        else{
            return 0.25;
        }
    }
    public double getTypeOfConstructionFactor(){
        if (getTypeOfConstruction().equals("steel")){
            return 0.1;
        }
        else if (getTypeOfConstruction().equals("concrete")){
            return 0.37;
        }
        else if (getTypeOfConstruction().equals("wood")){
            return 0.58;
        }
        else{
            return 0.92;
        }
    }
    public double getNumberOfFloorsFactor(){
        if (getNumberOfFloors() >= 1 && getNumberOfFloors() <= 3){
            return 0.1;
        }
        else if (getNumberOfFloors() >= 4 && getNumberOfFloors() <= 7){
            return 0.25;
        }
        else if (getNumberOfFloors() >= 8 && getNumberOfFloors() <= 18){
            return 0.5;
        }
        else{
            return 0.85;
        }
    }
    public double getYearOfConstructionFactor(){
        if (getYearOfConstruction() < 1975){
            return 0.58;
        }
        else if (getYearOfConstruction() < 1999){
            return 0.32;
        }
        else{
            return 0.1;
        }
    }
}
