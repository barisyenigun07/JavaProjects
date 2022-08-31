package CENG211_HW3;

public class Hepsiburada extends Ecommerce<String> {
    public Hepsiburada(String type,String siteName,String cargoCode,int weight,int width,int length,int height){
        super(type, siteName, cargoCode, weight, width, length, height,7);
    }
    @Override
    public boolean checkCargoCode() throws InvalidCodeException {
        String cargoCode = getCargoCode();
        if (cargoCode.length() != 8){
            throw new InvalidCodeException();
        }
        else{
            return true;
        }
    }
}
