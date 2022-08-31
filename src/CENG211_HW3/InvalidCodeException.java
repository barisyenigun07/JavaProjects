package CENG211_HW3;

public class InvalidCodeException extends Exception {
    public InvalidCodeException(){
        super("Invalid Code!");
    }
    public InvalidCodeException(String message){
        super(message);
    }
}
