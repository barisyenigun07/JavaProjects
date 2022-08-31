package CENG211_HW4;

import java.io.*;
import java.util.*;

public class Producer extends User{
    public Producer(int userId,String userName, String password, String displayedName){
        super(userId,userName, password, displayedName,"producer");
    }
    public void addProduct(){
        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper();
        int productId = new Random().nextInt(100) + 1;
        System.out.print("Product Name:");
        String productName = scanner.nextLine();
        try{
            helper.showProductTypeList();
            System.out.print("Product Type(If there is no type for your product, enter -1):");
            int pick = scanner.nextInt();
            scanner.nextLine();
            String productType;
            if (pick == -1){
                System.out.print("Enter new product type:");
                productType = scanner.nextLine();
            }
            else{
                productType = helper.pickProductType(pick);
            }
            if (productType != null){
                Product product = new Product(productId,this,productName,productType);
                try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/Product.csv",true))){
                    writer.write(product.getProductId() + "," + this.getUserId() + "," + product.getProductName() + "," + product.getProductType() + "\n");
                    System.out.println("Product has been added successfully!");
                } catch (IOException e) {
                    System.out.println("Error!");
                }
            }
            else{
                System.out.println("Product Type Not Found!");
            }
        }catch (InputMismatchException e ){
            System.out.println("You should enter integer values!");
        }
    }
    @Override
    public void seeComplaints(){
        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper();
        Database database = new Database();
        ArrayList<Complaint> complaints = database.getComplaintList();
        int compNum = 0;
        for (Complaint complaint : complaints){
            if (complaint.getProducer().getDisplayedName().equals(this.getDisplayedName())){
                if (!complaint.getStatus().equals("deleted")){
                    System.out.println(complaint.getComplaintId() + "," + complaint.getCustomer() + "," + complaint.getProduct() + "," + complaint.getTitle() + "," + complaint.getStatus());
                    compNum++;
                }
            }
        }
        if (compNum > 0){
            System.out.print("Enter title of complaint which you are looking for:");
            String title = scanner.nextLine();
            Complaint complaint = helper.findComplaint(complaints,title);
            if (complaint != null){
                System.out.println("Complaint: " + complaint.getComplaint());
                helper.updateComplaintList(complaints);
                System.out.print("Do you want to change its status(y/n)?:");
                String answer = scanner.nextLine();
                if (answer.equals("y")){
                    System.out.println("[1] Working\n" +
                                       "[2] Fixed");
                    System.out.print("Select status:");
                    String option = scanner.nextLine();
                    if (option.equals("1")){
                        complaints.get(helper.findIndexOfComplaint(complaints,complaint)).setStatus("working");
                    }
                    else if (option.equals("2")){
                        complaints.get(helper.findIndexOfComplaint(complaints,complaint)).setStatus("fixed");
                    }

                }
                else if (answer.equals("n")){
                    if (!complaint.getStatus().equals("working") || complaint.getStatus().equals("fixed")){
                        complaints.get(helper.findIndexOfComplaint(complaints,complaint)).setStatus("seen");
                    }
                    System.out.println("Task has finished!");
                }
                else{
                    System.out.println("Invalid Option!");
                }
                helper.updateComplaintList(complaints);
            }
            else{
                System.out.println("Complaint Not Found!");
            }
        }
        else{
            System.out.println("There are no complaints about your products!");
        }
    }
}
