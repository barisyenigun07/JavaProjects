package GenericMetodlar;

public abstract class Aday {
    private int turkce;
    private int matematik;
    private int edebiyat;
    private int fizik;
    private String isim;

    public Aday(int turkce,int matematik,int edebiyat,int fizik,String isim){
        this.setTurkce(turkce);
        this.setMatematik(matematik);
        this.setEdebiyat(edebiyat);
        this.setFizik(fizik);
        this.setIsim(isim);
    }

    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }
    abstract int puanHesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
