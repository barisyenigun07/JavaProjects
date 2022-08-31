package CENG211_HW3;

public class CargoAcceptanceApp {
    public static void main(String[] args){
        Info info = new Info();
        System.out.println("Welcome!");
        System.out.println("Number of Accepted Cargo: " + info.getNumberOfAcceptedPackages());
        System.out.println("Number of Not Accepted Cargo: " + info.getNumberOfNotAcceptedPackages());
        System.out.println("Here are the details:");
        System.out.println("Normal Cargo Packages:");
        info.showNormalPackages();
        System.out.println("E-commerce Cargo Packages:");
        info.showEcommercePackages();



    }
}
