package CENG211_HW3;

public interface IEcommerce {
    boolean checkCargoCode() throws InvalidCodeException;
    void checkStatus(int packageNum);
}
