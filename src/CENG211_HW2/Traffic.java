package CENG211_HW2;

public class Traffic extends Insurance {
    @Override
    public double calculatePolicyCharge(InsuredValue insuredValue) {
        double policyCharge = (0.9 * getFixedFee()) + (getFixedFee() * Math.sqrt(insuredValue.calculateRiskFactor()));
        if (insuredValue.getRankOfInsurance() > 1){
            policyCharge *= 0.8;
        }
        return policyCharge;
    }
}
