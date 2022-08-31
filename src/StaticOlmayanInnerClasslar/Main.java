package StaticOlmayanInnerClasslar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Matematik.Factorial factorial = new Matematik().new Factorial();
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();
        Matematik.Alan.DaireAlan daireAlan = new Matematik().new Alan().new DaireAlan();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin:");
        int sayi = scanner.nextInt();
        if (asal.asalMi(sayi)){
            System.out.println("Bu sayı asaldır.");
        }
        else{
            System.out.println("Bu sayı asal değildir.");
        }
        factorial.faktoriyel();
        daireAlan.daireAlan(5);
    }
}
