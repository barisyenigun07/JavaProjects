package OOP_Mini_Proje;

public class Yonetici extends Calisan{
    private int sorumlu_kisi_sayisi;
    public Yonetici(String isim,String soyisim,int maas,int id,int sorumlu_kisi_sayisi){
        super(isim,soyisim,maas,id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı: " + sorumlu_kisi_sayisi);
    }
    public void zam_yap(int zamMiktari){
        System.out.println(getIsim() + " çalışanlara " + zamMiktari + " kadar zam yaptı.");
    }
}
