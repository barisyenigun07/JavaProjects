package CENG211_HW3;

public class Amazon extends Ecommerce<Integer>{
    public Amazon(String type, String siteName, int cargoCode, int weight, int width, int length, int height) {
        super(type, siteName, cargoCode, weight, width, length, height,5);
    }
    @Override
    public boolean checkCargoCode() throws InvalidCodeException {
        int cargoCode = getCargoCode();
        String strCargoCode = String.valueOf(cargoCode);
        if (strCargoCode.length() != 7) {
            throw new InvalidCodeException();
        }
        else {
            return true;
        }
    }
}
