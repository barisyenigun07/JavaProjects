package CENG211_HW4;

import java.io.*;
import java.util.*;

public class Customer extends User{
    public Customer(int userId,String userName, String password, String displayedName){
        super(userId,userName, password, displayedName, "customer");

    }
    public void addComplaint(){
        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper();
        int complaintId = new Random().nextInt(100) + 1;
        try{
            helper.showProducerList();
            System.out.print("Select producer:");
            int pick1 = scanner.nextInt();
            scanner.nextLine();
            helper.showProductTypeList();
            System.out.print("Enter type of product:");
            int pick2 = scanner.nextInt();
            scanner.nextLine();
            helper.showProductList();
            System.out.print("Select product:");
            int pick3 = scanner.nextInt();
            scanner.nextLine();
            Producer producer = helper.pickProducer(pick1);
            String productType = helper.pickProductType(pick2);
            Product product = helper.pickProduct(pick3);
            if (producer == null || productType == null || product == null){
                System.out.println("You may have picked invalid values!");
            }
            else{
                if (product.getProducer().getUserId() == producer.getUserId() && product.getProductType().equals(productType)){
                    System.out.print("Complaint Title:");
                    String title = scanner.nextLine();
                    System.out.print("Complaint:");
                    String complaint = scanner.nextLine();
                    Complaint comp = new Complaint(complaintId,this,product,title,complaint,"new");
                    try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/Complaint.csv",true))){
                        writer.write(comp.getComplaintId() + ","
                                + this.getUserId() + ","
                                + comp.getProducer().getUserId() + ","
                                + comp.getProduct().getProductId() + ","
                                + comp.getTitle() + ","
                                + comp.getComplaint() + ","
                                + comp.getStatus() + "\n");
                        System.out.println("Complaint has been added successfully!");
                    } catch (IOException e) {
                        System.out.println("Error!");
                    }
                }
                else{
                    System.out.println("Add Complaint process has failed!");
                }
        }

        }
        catch (InputMismatchException e){
            System.out.println("You should enter integer values!");
        }
    }
    public void seeComplaints(){
        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper();
        Database database = new Database();
        ArrayList<Complaint> complaints = database.getComplaintList();
        int compNum = 0;
        for (Complaint complaint : complaints){
            if (complaint.getCustomer().getUserId() == this.getUserId()){
                System.out.println(complaint.getComplaintId() + "," + complaint.getProducer() + "," + complaint.getProduct() + "," + complaint.getTitle() + "," + complaint.getStatus());
                compNum++;
            }
        }
        if (compNum > 0){
            System.out.print("Enter title of complaint which you are looking for:");
            String title = scanner.nextLine();
            Complaint complaint = helper.findComplaint(complaints,title);
            if (complaint != null){
                System.out.println("Complaint: " + complaint.getComplaint());
                System.out.print("Do you want to delete it (y/n)?:");
                String answer = scanner.nextLine();
                if (answer.equals("y")){
                    if (!complaint.getStatus().equals("fixed")){
                        complaints.get(helper.findIndexOfComplaint(complaints,complaint)).setStatus("deleted");
                        helper.updateComplaintList(complaints);
                    }
                    else{
                        System.out.println("This complaint has already been fixed!");
                    }
                }
                else if (answer.equals("n")){
                    System.out.println("Task has finished!");
                }
                else{
                    System.out.println("Invalid Option!");
                }
            }
            else{
                System.out.println("Complaint Not Found!");
            }
        }
        else{
            System.out.println("You have no previous complaints!");
        }
    }
}
