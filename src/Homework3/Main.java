package Homework3;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To The System!");


        /*try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/CENG112_HW3_TicketingPurchase.txt")))){
            while (scanner.hasNextLine()){
                String info = scanner.nextLine();
                String[] array = info.split(",");
                String date = array[0];
                String str_id = array[1];
                int id = Integer.parseInt(str_id);
                String type = array[2];
                String seat = array[3];
                String oc = array[4];
                int occupation = Integer.parseInt(oc);
                Customer customer = new Customer(type,seat);
                Purchase purchase = new Purchase(id,customer,occupation);
                System.out.println(purchase);
                if (date.equals("15.05.2021")){
                    PurchaseQueue day1 = new PurchaseQueue("15.05.2021");
                    day1.insert(purchase);
                    System.out.println(day1);
                }
                else if (date.equals("16.05.2021")){
                    PurchaseQueue day2 = new PurchaseQueue("16.05.2021");
                    day2.insert(purchase);
                }
                else if (date.equals("17.05.2021")){
                    PurchaseQueue day3 = new PurchaseQueue("17.05.2021");
                    day3.insert(purchase);
                }
                else if (date.equals("18.05.2021")){
                    PurchaseQueue day4 = new PurchaseQueue("18.05.2021");
                    day4.insert(purchase);
                }
                else if (date.equals("19.05.2021")){
                    PurchaseQueue day5 = new PurchaseQueue("19.05.2021");
                    day5.insert(purchase);
                }




            }
        }
        catch (FileNotFoundException ex){
            System.out.println("File Not Found!");
        }*/





    }
}

