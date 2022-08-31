package Homework3;
public class PriorityQueue {
    private Node front;
    private Node rear;
    private int numberElements;

    public class Node{
        private Object data;
        private Node next;

        public Node(Object dataToAdd) {
            this.data=dataToAdd;
            this.next=null;
        }
        public Object getData() {
            return data;
        }
        public void setData(Object data) {
            this.data = data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }
    public PriorityQueue() {
        this.front=null;
        this.rear=null;
        this.numberElements=0;
    }
    public void enqueue(Customer dataToAdd) {
        if (front==null) {//empty case
            Node newnode=new Node(dataToAdd);
            front=newnode;
            rear=newnode;
            numberElements++;
        }
        else if (dataToAdd.getPriority()<((Customer)front.getData()).getPriority()) {//Inserting to the front
            Node newnode =new Node(dataToAdd);
            newnode.setNext(front);
            front=newnode;
            numberElements++;
        }
        else {//Inserting to the last and between two nodes
            Node temp=front;
            Node previous=null;
            while (temp!=null && dataToAdd.getPriority()>=((Customer)temp.getData()).getPriority()) {
                previous=temp;
                temp=temp.getNext();
            }
            if (temp==null) {//Inserting to the last
                Node newnode =new Node(dataToAdd);
                previous.setNext(newnode);
                rear=newnode;
                numberElements++;
            }

            else {//Inserting to between two nodes
                Node newnode =new Node(dataToAdd);
                newnode.setNext(temp);
                previous.setNext(newnode);
                numberElements++;
            }
        }
    }
    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. ");
            return null;
        }
        else {
            Object data=front.getData();
            front=front.getNext();
            numberElements--;
            return data;
        }
    }
    public Object peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. ");
            return null;
        }
        else {
            return front.getData();
        }
    }
    public boolean isEmpty() {
        return front==null;
    }
    public int size() {
        return numberElements;
    }
    public void display() {
        if (front==null) {
            System.out.println("linked list is empty");
        }
        else {
            Node temp=front;
            while (temp!=null) {
                System.out.print(((Customer)temp.getData())+" ");
                temp=temp.getNext();
            }
        }
    }
}


