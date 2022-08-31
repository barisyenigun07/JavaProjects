package Homework3;

public class PurchaseQueue{
    private Purchase head;
    private int queueLength;
    private int totalWaitingTime;
    private String date;
    private PurchaseQueue next;

    public PurchaseQueue(String date){
        this.date = date;
        this.totalWaitingTime = 0;
        this.queueLength = 0;
        this.head = null;
        this.next = null;
    }
    public void insert(Purchase T){
        //Purchase temp = new Purchase(T.getId(),T.getCustomer(),T.getOccupation());
        //Purchase temp = T;
        if (isEmpty()){
            this.setHead(T);
        }
        else {
             if(next.head.compareTo(T).equals(next)) {
                Purchase newPurchase = T;
                newPurchase.setNext(head);
                head = newPurchase;
             }
             else{
                Purchase temp = head;
                Purchase prev = null;
                while (temp != null && T.compareTo(temp) == temp) {
                    prev = temp;
                    temp = temp.getNext();
                }
                if (temp == null) {
                    Purchase newPurchase = T;
                    prev.setNext(newPurchase);
                } else {
                    Purchase newPurchase = T;
                    prev.setNext(newPurchase);
                    newPurchase.setNext(temp);
                }

            }

        }

        queueLength++;
    }

    public Purchase remove(){
        if (isEmpty()){
            return null;
        }
        Purchase purchase = head;
        head = head.getNext();
        queueLength--;
        return purchase;
    }
    public boolean isEmpty(){
        return queueLength == 0;
    }
    public boolean clear(){
        return this.head == null;
    }
    public String toString(){
        return null;
    }

    public Purchase getHead() {
        return head;
    }

    public void setHead(Purchase head) {
        this.head = head;
    }

    public int getQueueLength() {
        return queueLength;
    }

    public void setQueueLength(int queueLength) {
        this.queueLength = queueLength;
    }

    public int getTotalWaitingTime() {
        return totalWaitingTime;
    }

    public void setTotalWaitingTime(int totalWaitingTime) {
        this.totalWaitingTime = totalWaitingTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PurchaseQueue getNext() {
        return next;
    }

    public void setNext(PurchaseQueue next) {
        this.next = next;
    }
}
