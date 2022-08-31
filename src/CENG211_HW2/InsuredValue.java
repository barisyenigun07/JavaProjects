package CENG211_HW2;

public class InsuredValue {
    private String insuranceNumber;
    private int yearOfInsurance;

    public InsuredValue(String insuranceNumber,int yearOfInsurance){
        this.setInsuranceNumber(insuranceNumber);
        this.setYearOfInsurance(yearOfInsurance);
    }

    public double calculateRiskFactor(){
        return 0;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public int getYearOfInsurance() {
        return yearOfInsurance;
    }

    public void setYearOfInsurance(int yearOfInsurance) {
        this.yearOfInsurance = yearOfInsurance;
    }
    public int getRankOfInsurance(){
        return 2020 - getYearOfInsurance();
    }
}
