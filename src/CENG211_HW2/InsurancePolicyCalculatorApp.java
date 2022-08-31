package CENG211_HW2;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class InsurancePolicyCalculatorApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        PolicyRecord policyRecord = new PolicyRecord();
        Helper helper = new Helper();
        System.out.println("1 All Insurance Values, 2 Workplaces, 3 Housings, 4 Persons, 5 Automobiles, 6 Trucks");
        System.out.print("Please enter your choice: ");
        int choice = scanner.nextInt();
        if (choice == 1){
            ArrayList<InsuredValue> insuredValuesList = policyRecord.getInsuredValueList();
            for (InsuredValue i : insuredValuesList){
                System.out.println("Insured Value: " + i.getClass().getSimpleName() + " Insurance Number: " + i.getInsuranceNumber() + " Year Of Insurance: " + i.getYearOfInsurance());
                Insurance insurance = helper.decideInsuranceType(i);
                System.out.println("The Policy Charge Of " + i.getInsuranceNumber() + ": " + new DecimalFormat("##.##").format(insurance.calculatePolicyCharge(i)) + " TL");
                if (insurance instanceof Health && insurance.calculatePolicyCharge(i) == 100000000){
                    System.out.println("Insurance has been denied.");
                }
            }
        }
        else if (choice == 2){
            ArrayList<InsuredValue> workplaceList = policyRecord.getWorkPlaceList();
            Insurance insurance = new Household();
            for (InsuredValue i : workplaceList){
                System.out.println("Insured Value : Workplace Insurance Number: " + i.getInsuranceNumber() + " Year Of Insurance : " + i.getYearOfInsurance());
                System.out.println("The Policy Charge Of " + i.getInsuranceNumber() + ": " + new DecimalFormat("##.##").format(insurance.calculatePolicyCharge(i)) + " TL");
            }
        }
        else if (choice == 3){
            ArrayList<InsuredValue> housingList = policyRecord.getHousingList();
            Insurance insurance = new Household();
            for (InsuredValue i : housingList){
                System.out.println("Insured Value : Housing Insurance Number: " + i.getInsuranceNumber() + " Year Of Insurance : " + i.getYearOfInsurance());
                System.out.println("The Policy Charge Of " + i.getInsuranceNumber() + ": " + new DecimalFormat("##.##").format(insurance.calculatePolicyCharge(i)) + " TL");
            }
        }
        else if (choice == 4){
            ArrayList<InsuredValue> personList = policyRecord.getPersonList();
            Insurance insurance = new Health();
            for (InsuredValue i : personList){
                System.out.println("Insured Value : Person Insurance Number: " + i.getInsuranceNumber() + " Year Of Insurance : " + i.getYearOfInsurance());
                System.out.println("The Policy Charge Of " + i.getInsuranceNumber() + ": " + new DecimalFormat("##.##").format(insurance.calculatePolicyCharge(i)) + " TL");
                if (insurance.calculatePolicyCharge(i) == 100000000){
                    System.out.println("Insurance has been denied.");
                }
            }
        }
        else if (choice == 5){
            ArrayList<InsuredValue> automobileList = policyRecord.getAutomobileList();
            Insurance insurance = new Traffic();
            for (InsuredValue i : automobileList){
                System.out.println("Insured Value : Automobile Insurance Number: " + i.getInsuranceNumber() + " Year Of Insurance : " + i.getYearOfInsurance());
                System.out.println("The Policy Charge Of " + i.getInsuranceNumber() + ": " + new DecimalFormat("##.##").format(insurance.calculatePolicyCharge(i)) + " TL");
            }
        }
        else if (choice == 6){
            ArrayList<InsuredValue> truckList = policyRecord.getTruckList();
            Insurance insurance = new Traffic();
            for (InsuredValue i : truckList){
                System.out.println("Insured Value : Truck Insurance Number: " + i.getInsuranceNumber() + " Year Of Insurance : " + i.getYearOfInsurance());
                System.out.println("The Policy Charge Of " + i.getInsuranceNumber() + ": " + new DecimalFormat("##.##").format(insurance.calculatePolicyCharge(i)) + " TL");
            }
        }
        else{
            System.out.println("Invalid Choice!");
        }
    }
}
