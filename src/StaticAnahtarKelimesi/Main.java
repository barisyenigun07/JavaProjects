package StaticAnahtarKelimesi;

public class Main {
    public static void main(String[] args){
        Seyirci seyirci1 = new Seyirci("Barış Yenigün");
        Seyirci seyirci2 = new Seyirci("Erdem Yenigün");
        System.out.println("Seyirci Sayısı: " + Seyirci.getSeyirci_sayisi());
        selamla();
        System.out.println(Math.PI);
    }
    public static void selamla(){
        System.out.println("Selamlar...");
    }
}

