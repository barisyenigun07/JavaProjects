package CENG211_HW3;

import java.math.BigInteger;

public class Normal extends CargoPackage<Integer> implements IPrice {
    private BigInteger senderId;
    private String senderName;
    private String recipientName;
    private String recipientAddress;
    public Normal(String type,BigInteger senderId,String senderName,String recipientName,String recipientAddress,int weight,int width,int length,int height){
        super(type, weight, width, length, height, Helper.generateCargoCode(7));
        this.setSenderId(senderId);
        this.setSenderName(senderName);
        this.setRecipientName(recipientName);
        this.setRecipientAddress(recipientAddress);
    }

    public BigInteger getSenderId() {
        return senderId;
    }

    public void setSenderId(BigInteger senderId) {
        this.senderId = senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public double calculatePrice(){
        return 18.5 + 3 * getSize();
    }

    public boolean checkSenderId() throws IDNotCorrectException{
        String id = String.valueOf(senderId);
        if (id.length() != 11){
            throw new IDNotCorrectException();
        }
        else{
            return true;
        }
    }
}
