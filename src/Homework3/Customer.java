package Homework3;

public class Customer implements ICustomer {
    private String type;
    private String seat;
    public Customer(String type,String seat){
        this.setType(type);
        this.setSeat(seat);
    }


    @Override
    public int getPriority() {
        if (getType().equals("GOLD")) {
            return 1;
        } else if (getType().equals("SILVER")) {
            return 2;
        } else if (getType().equals("BRONZE")) {
            return 3;
        } else {
            return 4;
        }
    }
    public int compareTo(Customer c){
        if (this.getPriority() < c.getPriority()){
            return -1;
        }
        else if (this.getPriority() > c.getPriority()){
            return 1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
    public String toString(){
        return getType() + "," + getSeat();
    }
}
