package CENG211_HW2;

public class Household extends Insurance {
    @Override
    public double calculatePolicyCharge(InsuredValue insuredValue) {
        double policyCharge = getFixedFee() * insuredValue.calculateRiskFactor() * insuredValue.calculateRiskFactor();
        if (insuredValue.getRankOfInsurance() > 2){
            policyCharge *= 0.9;
        }
        return policyCharge;
    }
}
