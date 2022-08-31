package ExceptionHandlingHesapMakinesi;
import java.util.InputMismatchException;
import java.util.Scanner;
class CarpmaException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("İki sayı da çok büyük. Lütfen daha küçük sayılar girin...");
    }
}
public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hesap Makinesi Uygulaması");
        System.out.println("1 Toplama");
        System.out.println("2 Çıkarma");
        System.out.println("3 Çarpma");
        System.out.println("4 Bölme");
        label:
        while (true){
            System.out.print("Yapmak istediğiniz işlemi seçin:");
            String islem = scanner.nextLine();
            try {
                switch (islem){
                    case "q":
                        System.out.println("Programdan çıkılıyor...");
                        break label;
                    case "1":
                        System.out.print("a:");
                        a = scanner.nextInt();
                        System.out.print("b:");
                        b = scanner.nextInt();
                        System.out.println(a + " + " + b + " = " + (a + b));
                        break;
                    case "2":
                        System.out.print("a:");
                        a = scanner.nextInt();
                        System.out.print("b:");
                        b = scanner.nextInt();
                        System.out.println(a + " - " + b + " = " + (a - b));
                        break;
                    case "3":
                        System.out.print("a:");
                        a = scanner.nextInt();
                        System.out.print("b:");
                        b = scanner.nextInt();
                        if (a > 10000 && b > 10000){
                            throw new CarpmaException();
                        }
                        System.out.println(a + " x " + b + " = " + (a * b));
                        break;
                    case "4":
                        System.out.print("a:");
                        a = scanner.nextInt();
                        System.out.print("b:");
                        b = scanner.nextInt();
                        System.out.println(a + " / " + b + " = " + (a / b));
                        break;
                    default:
                        System.out.println("Geçersiz işlem!");
                        break;
                }
            }
            catch (ArithmeticException e){
                System.out.println("Bir sayı 0 a bölünemez!");
            }
            catch (InputMismatchException e){
                System.out.println("Yanlış input!");
            }
            catch (CarpmaException e) {
                e.printStackTrace();
            }
            scanner.nextLine();
        }
    }
}
