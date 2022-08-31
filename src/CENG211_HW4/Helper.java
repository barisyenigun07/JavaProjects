package CENG211_HW4;

import java.io.*;
import java.util.ArrayList;

public class Helper {
    private Database database;
    public Helper(){
        database = new Database();
    }
    public Customer getCustomer(int id){
        ArrayList<Customer> customers = database.getCustomerList();
        Customer customer = null;
        for (Customer c : customers){
            if (c.getUserId() == id){
                customer = c;
            }
        }
        return customer;
    }
    public Producer getProducer(int id){
        ArrayList<Producer> producers = database.getProducerList();
        Producer producer = null;
        for (Producer p : producers){
            if (p.getUserId() == id){
                producer = p;
            }
        }
        return producer;
    }
    public Producer pickProducer(int number){
        ArrayList<Producer> producers = database.getProducerList();
        if (number < 1 || number > producers.size()){
            return null;
        }
        else{
            return producers.get(number - 1);
        }
    }
    public Product getProduct(int id){
        ArrayList<Product> products = database.getProductList();
        Product product = null;
        for (Product p : products){
            if (p.getProductId() == id){
                product = p;
            }
        }
        return product;
    }
    public Product pickProduct(int number){
        ArrayList<Product> products = database.getProductList();
        if (number < 1 || number > products.size()){
            return null;
        }
        else{
            return products.get(number - 1);
        }
    }
    public String pickProductType(int number){
        ArrayList<String> productTypes = database.getProductTypeList();
        if (number < 1 || number > productTypes.size()){
            return null;
        }
        else{
            return productTypes.get(number - 1);
        }
    }
    public Complaint findComplaint(ArrayList<Complaint> complaints,String title){
        Complaint complaint = null;
        for (Complaint c : complaints){
            if (c.getTitle().equals(title)){
                complaint = c;
            }
        }
        return complaint;
    }
    public int findIndexOfComplaint(ArrayList<Complaint> complaints,Complaint complaint){
        int index = 0;
        for (int i = 0;i < complaints.size();i++){
            if (complaints.get(i).equals(complaint)){
                index = i;
            }
        }
        return index;
    }
    public void showProductTypeList(){
        ArrayList<String> productTypes = database.getProductTypeList();
        for (int i = 0;i < productTypes.size();i++){
            System.out.println((i + 1) + ") " + productTypes.get(i));
        }
    }
    public void showProducerList(){
        ArrayList<Producer> producers = database.getProducerList();
        for (int i = 0;i < producers.size();i++){
            System.out.println((i + 1) + ") " + producers.get(i));
        }
    }
    public void showProductList(){
        ArrayList<Product> products = database.getProductList();
        for (int i = 0;i < products.size();i++){
            System.out.println((i + 1) + ") " + products.get(i));
        }
    }
    public void updateComplaintList(ArrayList<Complaint> complaints){
        if (!complaints.isEmpty()){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/Complaint.csv"))) {
                for (Complaint c : complaints){
                    writer.write(c.getComplaintId() + "," + c.getCustomer().getUserId() + "," + c.getProducer().getUserId() + "," + c.getProduct().getProductId() + "," + c.getTitle() + "," + c.getComplaint() + "," + c.getStatus() + "\n");
                }

            }catch (IOException e){
                System.out.println("Error");
            }
        }
    }
}