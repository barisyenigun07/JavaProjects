package CENG211_HW2;

public class Workplace extends Premises {
    private int annualRevenue;
    public Workplace(String insuranceNumber, int yearOfInsurance, String premisesCity, int numberOfFloors, int yearOfConstruction, String typeOfConstruction, int surfaceArea, int annualRevenue) {
        super(insuranceNumber, yearOfInsurance, premisesCity, numberOfFloors, yearOfConstruction, typeOfConstruction, surfaceArea);
        this.setAnnualRevenue(annualRevenue);
    }
    public int getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(int annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    @Override

    public double calculateRiskFactor() {
       return  (getPremisesCityFactor() * getNumberOfFloorsFactor() * getYearOfConstructionFactor() * getTypeOfConstructionFactor()) * (getSurfaceArea() * 0.2) * (getAnnualRevenue() * 0.003);
    }
}
