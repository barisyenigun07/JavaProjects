package Hesap_Makinesi;
import java.util.Scanner;
public class Main {
    public static int cikarma(int a, int b){
        return (a - b);
    }
    public static double bolme(int a, int b){
        return ((double)(a) / b);
    }
    public static int toplama(int a, int b){
        return a + b;
    }
    public static int toplama(int a, int b, int c){
        return a + b + c;
    }
    public static int carpma(int a, int b){
        return a * b;
    }
    public static int carpma(int a, int b, int c){
        return a * b * c;
    }
    public static void main(String[] args){
        String islemler = "1. Toplama\n" +
                          "2. Çıkarma\n" +
                          "3. Çarpma\n" +
                          "4. Bölme\n" +
                          "Çıkış için q";
        System.out.println("********************");
        System.out.println(islemler);
        System.out.println("********************");
        label:
        while (true){
            System.out.print("İşlemi giriniz:");
            Scanner scanner = new Scanner(System.in);
            String islem = scanner.nextLine();

            switch (islem) {
                case "q":
                    System.out.println("Programdan çıkılıyor...");
                    break label;
                case "1": {
                    System.out.print("Kaç değer toplayacaksınız?(2 veya 3):");
                    int kacsayi = scanner.nextInt();
                    if (kacsayi == 2) {
                        System.out.print("a:");
                        int a = scanner.nextInt();
                        System.out.print("b:");
                        int b = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Girilen sayıların toplamı: " + (toplama(a, b)));
                    } else if (kacsayi == 3) {
                        System.out.print("a:");
                        int a = scanner.nextInt();
                        System.out.print("b:");
                        int b = scanner.nextInt();
                        System.out.print("c:");
                        int c = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Girilen sayıların toplamı: " + (toplama(a, b, c)));

                    } else {
                        System.out.println("Bunun için metod bulunmuyor...");
                    }
                    break;
                }
                case "2": {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların farkı: " + (cikarma(a, b)));
                    break;
                }
                case "3": {
                    System.out.print("Kaç değer çarpacaksınız?(2 veya 3):");
                    int kacsayi = scanner.nextInt();
                    if (kacsayi == 2) {
                        System.out.print("a:");
                        int a = scanner.nextInt();
                        System.out.print("b:");
                        int b = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Girilen sayıların çarpımı: " + (carpma(a, b)));

                    } else if (kacsayi == 3) {
                        System.out.print("a:");
                        int a = scanner.nextInt();
                        System.out.print("b:");
                        int b = scanner.nextInt();
                        System.out.print("c:");
                        int c = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Girilen sayıların çarpımı: " + (carpma(a, b, c)));
                    } else {
                        System.out.println("Bunun için metod yok...");
                    }

                    break;
                }
                case "4": {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen sayıların bölümü: " + (bolme(a, b)));
                    break;
                }
                default:
                    System.out.println("Geçersiz işlem...");
                    break;
            }
        }

    }
}
