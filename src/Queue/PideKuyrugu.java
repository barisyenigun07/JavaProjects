package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PideKuyrugu {
    public static void main(String[] args){
        System.out.println("Ramazan Pidesi Uygulaması...");
        Random random = new Random();
        Queue<String> pidekuyrugu = new LinkedList<>();
        pidekuyrugu.offer("Barış");
        pidekuyrugu.offer("Erdem");
        pidekuyrugu.offer("Ayşe");
        pidekuyrugu.offer("Emrah");
        pidekuyrugu.offer("Utku");
        pidekuyrugu.offer("Cem");
        pidekuyrugu.offer("Mert");
        pidekuyrugu.offer("Mustafa");
        pidekuyrugu.offer("Murat");
        pidekuyrugu.offer("Ezgi");

        int pide_sayisi = 1 + random.nextInt(10);
        System.out.println("Pideler Çıkıyor...");
        System.out.println("Çıkan Pide Sayısı: " + pide_sayisi);
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){}
        while (pide_sayisi != 0){
            System.out.println(pidekuyrugu.poll() + " pideyi aldı.");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){}
            pide_sayisi -= 1;
        }
        System.out.println("Pide Kalmadı...");

    }
}
