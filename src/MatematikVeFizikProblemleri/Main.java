package MatematikVeFizikProblemleri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik ve Fizik Problemleri Programı Hoşgeldiniz...");
        String islemler = "İşlemler...\n" +
                          "1. Daire Alanı Hesapla\n" +
                          "2. Üçgen Çevresi Hesapla\n" +
                          "3. İki Vektörün İç Çarpımını Hesaplama\n" +
                          "Çıkış q";
        while (true){
            System.out.println(islemler);
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")){
                System.out.print("Dairenin Yarıçapı : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daireAlan(yaricap);
            }
            else if (islem.equals("2")){
                System.out.print("Kenar 1 : ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucgenCevre(kenar1,kenar2,kenar3);
            }
            else if (islem.equals("3")){
                Vec vec1 = new Vec("Vektör1");
                Vec vec2 = new Vec("Vektör2");
                Problem.Fizik.icCarpim(vec1,vec2);
            }
            else{
                System.out.println("Geçersiz İşlem!");
            }
        }
    }
}
