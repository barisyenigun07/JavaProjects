package CENG211_HW2;

public class Health extends Insurance {
    @Override
    public double calculatePolicyCharge(InsuredValue insuredValue) {
        if (insuredValue.calculateRiskFactor() > 50 && insuredValue.getRankOfInsurance() < 3){
            return 100000000;
        }
        return  ((getFixedFee() * insuredValue.calculateRiskFactor() * insuredValue.calculateRiskFactor() * insuredValue.calculateRiskFactor())) / 208;
    }
}
