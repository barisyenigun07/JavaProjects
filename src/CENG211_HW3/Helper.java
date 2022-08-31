package CENG211_HW3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

public class Helper {
    private String[][] packages;

    public Helper(){
        FileIO fileIO = new FileIO();
        packages = fileIO.readValues("src/HW3_PackagesToAccept.csv");
    }
    public static int generateCargoCode(int length){
        String code = "";
        for (int i = 0;i < length;i++){
            code += new Random().nextInt(9) + 1;
        }
        return Integer.parseInt(code);
    }
    public ArrayList<Normal> getNormalList(){
        ArrayList<Normal> normalPackages = new ArrayList<>();
        for (int i = 0;i < packages.length;i++){
            String type = packages[i][0];
            if (type.equals("Normal")){
                try {
                    BigInteger senderId = new BigInteger(packages[i][1]);
                    String senderName = packages[i][2];
                    String recipientName = packages[i][3];
                    String recipientAddress = packages[i][4];
                    int weight = Integer.parseInt(packages[i][5]);
                    int width = Integer.parseInt(packages[i][6]);
                    int length = Integer.parseInt(packages[i][7]);
                    int height = Integer.parseInt(packages[i][8]);
                    Normal normal = new Normal(type,senderId,senderName,recipientName,recipientAddress,weight,width,length,height);
                    normalPackages.add(normal);
                }
                catch (NumberFormatException e){

                }
            }
        }
        return normalPackages;
    }
    public ArrayList<Ecommerce> getEcommerceList(){
        ArrayList<Ecommerce> ecommercePackages = new ArrayList<>();
        for (int i = 0;i < packages.length;i++){
            String type = packages[i][0];
            if (type.equals("Ecommerce")){
                String siteName = packages[i][1];
                int weight = Integer.parseInt(packages[i][3]);
                int width = Integer.parseInt(packages[i][4]);
                int length = Integer.parseInt(packages[i][5]);
                int height = Integer.parseInt(packages[i][6]);
                if (siteName.equals("Amazon")){
                    try {
                        int cargoCode = Integer.parseInt(packages[i][2]);
                        Amazon amazon = new Amazon(type,siteName,cargoCode,weight,width,length,height);
                        ecommercePackages.add(amazon);
                    }
                    catch (NumberFormatException e){

                    }
                }
                else if (siteName.equals("Hepsiburada")){
                    String cargoCode = packages[i][2];
                    Hepsiburada hepsiburada = new Hepsiburada(type,siteName,cargoCode,weight,width,length,height);
                    ecommercePackages.add(hepsiburada);
                }
                else if (siteName.equals("N11")){
                    String cargoCode = packages[i][2];
                    N11 n11 = new N11(type,siteName,cargoCode,weight,width,length,height);
                    ecommercePackages.add(n11);
                }
                else if (siteName.equals("Trendyol")){
                    try {
                        int cargoCode = Integer.parseInt(packages[i][2]);
                        Trendyol trendyol = new Trendyol(type,siteName,cargoCode,weight,width,length,height);
                        ecommercePackages.add(trendyol);
                    }
                    catch (NumberFormatException e){

                    }
                }
            }
        }
        return ecommercePackages;
    }
    public ArrayList<Normal> getValidNormalPackages(){
        ArrayList<Normal> validNormalPackages = new ArrayList<>();
        ArrayList<Normal> allNormalPackages = getNormalList();
        for (Normal normal : allNormalPackages){
            try {
                if (normal.checkSenderId()){
                    validNormalPackages.add(normal);
                }
            }
            catch (IDNotCorrectException e){
            }
        }
        return validNormalPackages;
    }
    public ArrayList<Ecommerce> getValidEcommercePackages(){
        int packAmazon = 0, packHepsiburada = 0, packN11 = 0, packTrendyol = 0;
        ArrayList<Ecommerce> validEcommercePackages = new ArrayList<>();
        ArrayList<Ecommerce> allEcommercePackages = getEcommerceList();
        for (Ecommerce ecommerce : allEcommercePackages){
            try {
                if (ecommerce.checkCargoCode()){
                    if (ecommerce instanceof Amazon){
                        packAmazon++;
                        ecommerce.checkStatus(packAmazon);
                    }
                    else if (ecommerce instanceof Hepsiburada){
                        packHepsiburada++;
                        ecommerce.checkStatus(packHepsiburada);
                    }
                    else if (ecommerce instanceof N11){
                        packN11++;
                        ecommerce.checkStatus(packN11);
                    }
                    else if (ecommerce instanceof Trendyol){
                        packTrendyol++;
                        ecommerce.checkStatus(packTrendyol);
                    }
                    validEcommercePackages.add(ecommerce);
                }
            }catch (InvalidCodeException e){}
        }
        return validEcommercePackages;
    }

}
