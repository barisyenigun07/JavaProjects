package Calismalar;

public class Main {
    public static void main(String[] args){
        Calisan calisan = new Calisan("Barış Yenigün",25,2500,341,"Yazılım");
        calisan.departmanDegistir("Satış Pazarlama");
        calisan.zam_yap(500);
        calisan.bilgilerigoster();
    }
}
