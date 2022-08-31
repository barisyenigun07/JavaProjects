package Beyblade;

public class Beyblade {
    private String beybladeci;
    private int donus_hizi;
    private int saldiri_gucu;

    public Beyblade(String beybladeci,int donus_hizi,int saldiri_gucu){
        this.setBeybladeci(beybladeci);
        this.setDonus_hizi(donus_hizi);
        this.setSaldiri_gucu(saldiri_gucu);
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonus_hizi() {
        return donus_hizi;
    }

    public void setDonus_hizi(int donus_hizi) {
        this.donus_hizi = donus_hizi;
    }

    public int getSaldiri_gucu() {
        return saldiri_gucu;
    }

    public void setSaldiri_gucu(int saldiri_gucu) {
        this.saldiri_gucu = saldiri_gucu;
    }
    public void saldir(){
        System.out.println(getBeybladeci() + " " + saldiri_gucu + " ve " + donus_hizi + " ile saldırıyor...");

    }
    public void kutsalCanavarOrtayaCikar(){
        System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor...");
    }
    public void bilgilerigoster(){
        System.out.println("Beybladeci İsmi: " + getBeybladeci());
        System.out.println("Dönüş Hızı: " + getDonus_hizi());
        System.out.println("Saldırı Gücü: " + getSaldiri_gucu());
    }
}
