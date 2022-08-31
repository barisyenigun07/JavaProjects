package GenericMetodlar;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        System.out.println("YGS LYS Birincisi Bulma Programı");
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler...\n" +
                          "1.Eşit Ağırlık Öğrencileri Birincisi\n" +
                          "2.Sayısal Öğrencileri Birincisi\n";

        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");

        while (true){
            System.out.println("Çıkış için q ya basınız.");
            String cevap = scanner.nextLine();
            if (cevap.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            System.out.print("Birinci Öğrencinin İsmi: ");
            String isim1 = scanner.nextLine();
            System.out.println("Netler(Türkçe,Matematik,Edebiyat,Fizik) : ");
            int turkce1 = scanner.nextInt();
            int matematik1 = scanner.nextInt();
            int edebiyat1 = scanner.nextInt();
            int fizik1 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("İkinci Öğrencinin İsmi: ");
            String isim2 = scanner.nextLine();
            System.out.println("Netler(Türkçe,Matematik,Edebiyat,Fizik) : ");
            int turkce2 = scanner.nextInt();
            int matematik2 = scanner.nextInt();
            int edebiyat2 = scanner.nextInt();
            int fizik2 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Üçüncü Öğrencinin İsmi: ");
            String isim3 = scanner.nextLine();
            System.out.println("Netler(Türkçe,Matematik,Edebiyat,Fizik) : ");
            int turkce3 = scanner.nextInt();
            int matematik3 = scanner.nextInt();
            int edebiyat3 = scanner.nextInt();
            int fizik3 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("İşlemi giriniz:");
            String islem = scanner.nextLine();

            if (islem.equals("1")){
                EsitAgirlik ea1 = new EsitAgirlik(turkce1,matematik1,edebiyat1,fizik1,isim1);
                EsitAgirlik ea2 = new EsitAgirlik(turkce2,matematik2,edebiyat2,fizik2,isim2);
                EsitAgirlik ea3 = new EsitAgirlik(turkce3,matematik3,edebiyat3,fizik3,isim3);

                EsitAgirlik birinci = birinci(ea1,ea2,ea3);
                System.out.println("Eşit Ağırlık Birincisi : " + birinci.getIsim());
                System.out.println("Öğrencinin Puanı : " + birinci.puanHesapla());
            }
            else if (islem.equals("2")){
                Sayisal s1 = new Sayisal(turkce1,matematik1,edebiyat1,fizik1,isim1);
                Sayisal s2 = new Sayisal(turkce2,matematik2,edebiyat2,fizik2,isim2);
                Sayisal s3 = new Sayisal(turkce3,matematik3,edebiyat3,fizik3,isim3);

                Sayisal birinci = birinci(s1,s2,s3);
                System.out.println("Sayısal Birincisi : " + birinci.getIsim());
                System.out.println("Öğrencinin Puanı : " + birinci.puanHesapla());
            }
            else{
                System.out.println("Geçersiz İşlem!");
            }
        }

    }
    public static <E extends Aday> E birinci(E e1,E e2,E e3){
        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()){
            return e1;
        }
        else if (e2.puanHesapla() < e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()){
            return e2;
        }
        else if (e3.puanHesapla() > e1.puanHesapla() && e3.puanHesapla() > e2.puanHesapla()){
            return e3;
        }
        else{
            return e1;
        }
    }

}
