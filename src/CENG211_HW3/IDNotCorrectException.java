package CENG211_HW3;

public class IDNotCorrectException extends Exception{
    public IDNotCorrectException(){
        super("ID is not correct!");
    }
    public IDNotCorrectException(String message){
        super(message);
    }
}
