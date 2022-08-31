package CENG211_HW3;

import java.util.ArrayList;

public class Info {
    private Helper helper;
    public Info(){
        helper = new Helper();
    }
    public void showNormalPackages(){
        ArrayList<Normal> normalPackages = helper.getValidNormalPackages();
        String format1 = "%s%15s%15s%20s%25s%30s%20s%15s%20s\n";
        String format2 = "%s%15s%15s%20s%25s%35s%15s%15s%20s\n";
        System.out.printf(format1,"No","Cargo Code","Sender ID","Sender Name","Recipient Name","Recipient Address","Size","Price","Delivery Day");
        for (int i = 0;i < normalPackages.size();i++){
            Normal normal = normalPackages.get(i);
            System.out.printf(format2,(i + 1),normal.getCargoCode(),normal.getSenderId(),normal.getSenderName(),normal.getRecipientName(),normal.getRecipientAddress(),normal.getSize(),normal.calculatePrice(),normal.getDeliveryDay());
        }
    }
    public void showEcommercePackages(){
        ArrayList<Ecommerce> ecommercePackages = helper.getValidEcommercePackages();
        String format1 = "%s%20s%16s%15s%18s%20s\n";
        String format2 = "%s%17s%20s%18s%14s%18s\n";
        System.out.printf(format1,"No","E-Commerce Site","Cargo Code","Status","Size","Delivery Day");
        for (int i = 0;i < ecommercePackages.size();i++){
            Ecommerce ecommerce = ecommercePackages.get(i);
            System.out.printf(format2,(i + 1),ecommerce.getSiteName(),ecommerce.getCargoCode(),ecommerce.getStatus(),ecommerce.getSize(),ecommerce.getDeliveryDay());
        }
    }
    public int getNumberOfAcceptedPackages(){
        int acceptedNormalPackNum = 0;
        for (Normal normal : helper.getValidNormalPackages()){
            if (!normal.getDeliveryDay().equals("NO DELIVERY")){
                acceptedNormalPackNum++;
            }
        }
        int acceptedEcommercePackNum = 0;
        for (Ecommerce ecommerce : helper.getValidEcommercePackages()){
            if (ecommerce.getStatus().equals("Accepted")){
                acceptedEcommercePackNum++;
            }
        }
        return acceptedNormalPackNum + acceptedEcommercePackNum;
    }
    public int getNumberOfNotAcceptedPackages(){
        int notAcceptedNormalPackNum = helper.getNormalList().size() - helper.getValidNormalPackages().size();
        for (Normal normal : helper.getValidNormalPackages()){
            if (normal.getDeliveryDay().equals("NO DELIVERY")){
                notAcceptedNormalPackNum++;
            }
        }
        int notAcceptedEcommercePackNum = helper.getEcommerceList().size() - helper.getValidEcommercePackages().size();
        for (Ecommerce ecommerce : helper.getValidEcommercePackages()){
            if (ecommerce.getStatus().equals("Not Accepted")){
                notAcceptedEcommercePackNum++;
            }
        }
        return notAcceptedNormalPackNum + notAcceptedEcommercePackNum;
    }
}
