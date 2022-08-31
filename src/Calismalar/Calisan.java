package Calismalar;

public class Calisan {
    private String isim;
    private int yas;
    private int maas;
    private int id;
    private String departman;

    public Calisan(String isim,int yas,int maas,int id,String departman){
        this.isim = isim;
        this.yas = yas;
        this.maas = maas;
        this.id = id;
        this.departman = departman;
    }
    public void zam_yap(int zam_miktarı){
        maas += zam_miktarı;
        System.out.println("Yeni Maaş: " + maas);
    }
    public void id_degistir(int yeni_id){
        id = yeni_id;
        System.out.println("Çalışanın yeni id'si: " + id);
    }
    public void departmanDegistir(String yeni_departman){
        departman = yeni_departman;
        System.out.println("Çalışan artık " + departman + " departmanında çalışacak.");
    }
    public void bilgilerigoster(){
        String bilgiler = "İsim: " + isim + "\n" +
                          "Yaş: " + yas + "\n" +
                          "Maaş: " + maas + "\n" +
                          "ID: " + id + "\n" +
                          "Departman: " + departman;
        System.out.println("Çalışanın Bilgileri:");
        System.out.println("**************************");
        System.out.println(bilgiler);
        System.out.println("**************************");
    }

}
