package CENG211_HW2;

public class Housing extends Premises {
    private String residentSituation;
    public Housing(String insuranceNumber, int yearOfInsurance, String premisesCity, int numberOfFloors, int yearOfConstruction, String typeOfConstruction, int surfaceArea, String residentSituation) {
        super(insuranceNumber, yearOfInsurance, premisesCity, numberOfFloors, yearOfConstruction, typeOfConstruction, surfaceArea);
        this.setResidentSituation(residentSituation);
    }
    public String getResidentSituation() {
        return residentSituation;
    }
    public void setResidentSituation(String residentSituation) {
        this.residentSituation = residentSituation;
    }
    public double getResidentSituationFactor(){
        if (getResidentSituation().equals("tenant")){
            return 0.18;
        }
        else if (getResidentSituation().equals("landlord")){
            return 0.42;
        }
        else{
            return 1;
        }
    }

    @Override
    public double calculateRiskFactor() {
        return ((getPremisesCityFactor() * getNumberOfFloorsFactor() * getYearOfConstructionFactor() * getTypeOfConstructionFactor()) * getSurfaceArea()) / getResidentSituationFactor();
    }

}
