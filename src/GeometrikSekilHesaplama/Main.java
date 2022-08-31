package GeometrikSekilHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler...\n"
                          +"1.Kare Alan Hesapla\n"
                          +"2.Üçgen Alan Hesapla\n"
                          +"3.Daire Alan Hesapla\n"
                          +"Çıkış : q";
        while (true){
            System.out.println(islemler);
            System.out.print("Hangi Şeklin Alanını Hesaplamak İstiyorsunuz?:");
            String sekil_turu = scanner.nextLine();
            Sekil sekil = null;
            if (sekil_turu.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if (sekil_turu.equals("1")){
                System.out.print("Karenin Kenarı:");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                sekil = new Kare("Kare1",kenar);
                sekil.alanHesapla();
            }
            else if (sekil_turu.equals("2")){
                System.out.print("Üçgenin 1. Kenar Uzunluğu:");
                int a = scanner.nextInt();
                System.out.print("Üçgenin 2. Kenar Uzunluğu:");
                int b = scanner.nextInt();
                System.out.print("Üçgenin 3. Kenar Uzunluğu:");
                int c = scanner.nextInt();
                scanner.nextLine();
                sekil = new Ucgen("Üçgen1",a,b,c);
                sekil.alanHesapla();
            }
            else if (sekil_turu.equals("3")){
                System.out.print("Dairenin Yarıçapı:");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                sekil = new Daire("Daire1",yaricap);
                sekil.alanHesapla();
            }
            else{
                System.out.println("Geçersiz İşlem!");
            }

        }

    }
}
