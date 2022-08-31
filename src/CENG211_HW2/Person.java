package CENG211_HW2;

public class Person extends InsuredValue {
    private String residenceCity;
    private String name;
    private String nationalId;
    private String gender;
    private int yearOfBirth;
    private String typeOfChronicleIllness;

    public Person(String insuranceNumber, int yearOfInsurance,String residenceCity,String name,String nationalId,String gender,int yearOfBirth,String typeOfChronicleIllness) {
        super(insuranceNumber, yearOfInsurance);
        this.setResidenceCity(residenceCity);
        this.setName(name);
        this.setNationalId(nationalId);
        this.setGender(gender);
        this.setYearOfBirth(yearOfBirth);
        this.setTypeOfChronicleIllness(typeOfChronicleIllness);
    }

    public String getResidenceCity() {
        return residenceCity;
    }

    public void setResidenceCity(String residenceCity) {
        this.residenceCity = residenceCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getTypeOfChronicleIllness() {
        return typeOfChronicleIllness;
    }

    public void setTypeOfChronicleIllness(String typeOfChronicleIllness) {
        this.typeOfChronicleIllness = typeOfChronicleIllness;
    }
    public double getChronicleIllnessFactor(){
        if (getTypeOfChronicleIllness().equals("cardiovascular")){
            return 1.85;
        }
        else if (getTypeOfChronicleIllness().equals("diabetes")){
            return 1.84;
        }
        else if (getTypeOfChronicleIllness().equals("respiratory")){
            return 1.86;
        }
        else if (getTypeOfChronicleIllness().equals("none")){
            return 0.1;
        }
        else{
            return 1.8;
        }
    }
    public int getAge(){
        return 2020 - getYearOfBirth();
    }
    @Override
    public double calculateRiskFactor() {
        return (getAge() * getAge()) / (getChronicleIllnessFactor() * 18);
    }
}
