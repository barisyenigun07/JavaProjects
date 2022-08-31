package StaticOlmayanInnerClasslar;

import java.util.Scanner;

public class Matematik {
    private double PI = Math.PI;
    public class Factorial{
        public void faktoriyel(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayı girin:");
            int sayi = scanner.nextInt();
            int fakt = 1;
            for (int i = 2;i <= sayi;i++){
                fakt *= i;
            }
            System.out.println("Faktöriyel: " + fakt);
        }
    }
    public class Asal{
        public boolean asalMi(int sayi){
            for (int i = 2;i < sayi;i++){
                if (sayi % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public class Alan{
        public class DaireAlan{
            public void daireAlan(int yaricap){
                System.out.println("Dairenin Alanı: " + (PI * yaricap * yaricap));
            }
        }

    }
}
