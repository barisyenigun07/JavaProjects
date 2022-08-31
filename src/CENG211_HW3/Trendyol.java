package CENG211_HW3;

public class Trendyol extends Ecommerce<Integer> {
    public Trendyol(String type,String siteName,int cargoCode,int weight,int width,int length,int height){
        super(type, siteName, cargoCode, weight, width, length, height,9);
    }
    @Override
    public boolean checkCargoCode() throws InvalidCodeException{
        String strCargoCode = String.valueOf(getCargoCode());
        if (strCargoCode.length() != 8){
            throw new InvalidCodeException();
        }
        else{
            return true;
        }
    }
}
