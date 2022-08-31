package OOPATM;

public class Main {
    public static void main(String[] args){
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Barış Yenigün","348634",1000);

        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor...");
    }
}
