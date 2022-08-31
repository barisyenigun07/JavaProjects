package Interfaceler;

public class PcMuhendisi implements IMuhendis {
    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhendisi(boolean adli_sicil,boolean askerlik) {
        this.adli_sicil = adli_sicil;
        this.askerlik = askerlik;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik){
            System.out.println("Askerliğimi yaptım");
        }
        else {
            System.out.println("Askerliğimi yapmadım");
        }
    }

    @Override
    public String mezuniyet_ortalaması(double derece) {
        return "Ortalamam: " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if (adli_sicil){
            System.out.println("Adli Sicil Kaydım Bulunuyor...");
        }
        else {
            System.out.println("Herhangi bir adli sicil kaydım bulunmuyor.");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("Bilgisayar Mühendisi Olarak Şu Şirketlerde Çalıştım...");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
