package Homework3;

public class Purchase {
    private int id;
    private ICustomer customer;
    private int occupation;
    private int waiting;
    private Purchase next;


    public Purchase(int id, ICustomer customer, int occupation){
        this.setId(id);
        this.setCustomer(customer);
        this.setOccupation(occupation);
        this.waiting = 0;
        this.next = null;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ICustomer getCustomer() {
        return customer;
    }
    public void setCustomer(ICustomer customer) {
        this.customer = customer;
    }
    public int getOccupation() {
        return occupation;
    }
    public void setOccupation(int occupation) {
        this.occupation = occupation;
    }
    public int getWaiting() {
        return waiting;
    }
    public void setWaiting(int waiting) {
        this.waiting = waiting;
    }
    public void setNext(Purchase next) {
        this.next = next;
    }
    public Purchase getNext() {
        return next;
    }
    public String toString() {
        return id + "," + customer + "," + occupation;
    }
    public Purchase compareTo(Purchase next){
        if (this.getCustomer().getPriority() < next.getCustomer().getPriority()){
            return this;
        }
        else{
            return next;
        }
    }

}


