package Beyblade;

public class Dranza extends Beyblade {
    private String kutsalCanavar;
    public Dranza(String beybladeci,int donus_hizi,int saldiri_gucu,String kutsalCanavar){
        super(beybladeci,donus_hizi,saldiri_gucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Kutsal Canavarın Adı: " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci() + " ın saldırısı: Alev Kılıcı");
    }
}
