package CENG211_HW3;

public class N11 extends Ecommerce<String> {
    public N11(String type,String siteName,String cargoCode,int weight,int width,int length,int height){
        super(type, siteName, cargoCode, weight, width, length, height,6);
    }
    @Override
    public boolean checkCargoCode() throws InvalidCodeException{
        String cargoCode = getCargoCode();
        if (cargoCode.length() != 7){
            throw new InvalidCodeException();
        }
        else{
            return true;
        }
    }
}
