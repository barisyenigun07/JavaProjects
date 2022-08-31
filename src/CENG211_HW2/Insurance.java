package CENG211_HW2;

import java.util.Random;

public class Insurance {
    private int fixedFee;
    public Insurance(){
        fixedFee = new Random().nextInt(2000 + 1) + 1000;
    }
    public int getFixedFee() {
        return fixedFee;
    }
    public double calculatePolicyCharge(InsuredValue insuredValue){
        return 0;
    }
}
