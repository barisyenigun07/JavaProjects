package OOP_Mini_Proje;

public class Yazilimci extends Calisan {
    private String diller;
    public Yazilimci(String isim,String soyisim,int maas,int id,String diller){
        super(isim, soyisim, maas,id);
        this.diller = diller;

    }
    public void formatAt(String isletim_sistemi){
        System.out.println(getIsim() + " " + isletim_sistemi + " ni yüklüyor");
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Yazılımcının kullandığı diller: " + diller);
    }
}
