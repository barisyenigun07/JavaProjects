package OOP_Mini_Proje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler\n" +
                          "1. Yazılımcı İşlemleri\n" +
                          "2. Yönetici İşlemleri\n" +
                          "Çıkış için q";
        System.out.println("**************************");
        System.out.println(islemler);
        System.out.println("**************************");
        while (true){
            System.out.print("İşlemi Seçiniz: ");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Barış","Yenigün",2500,587,"Python,Java,Javascript");
                String yazilimci_islem = "1. Format At\n" +
                                         "2. Bilgileri Göster\n" +
                                         "Çıkış için q";
                System.out.println(yazilimci_islem);
                while (true){
                    System.out.print("İşlemi seçiniz: ");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.print("İşletim Sistemi: ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if (y_islem.equals("2")){
                        yazilimci.bilgilerigoster();
                    }
                    else {
                        System.out.println("Geçersiz Yazılımcı İşlemi!");
                    }
                }
            }
            else if (islem.equals("2")){
                Yonetici yonetici = new Yonetici("Emrah","Yenigün",5000,123,10);
                String yonetici_islem = "Yönetici İşlemleri\n" +
                                        "1. Zam Yap\n" +
                                        "2. Bilgileri Goster\n" +
                                        "Çıkış için q";
                System.out.println(yonetici_islem);
                while (true){
                    System.out.print("İşlem seçiniz: ");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")){
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz?: ");
                        int zam_miktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zam_yap(zam_miktari);
                    }
                    else if (y_islem.equals("2")){
                        yonetici.bilgilerigoster();
                    }
                    else {
                        System.out.println("Geçersiz Yönetici İşlemi!");
                    }
                }

            }
            else {
                System.out.println("Geçersiz İşlem!");
            }
        }
    }
}
