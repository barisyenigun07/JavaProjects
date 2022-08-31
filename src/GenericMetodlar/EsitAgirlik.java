package GenericMetodlar;

public class EsitAgirlik extends Aday{
    public EsitAgirlik(int turkce,int matematik,int edebiyat,int fizik,String isim){
        super(turkce, matematik, edebiyat, fizik,isim);
    }
    public int puanHesapla(){
        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 1 + getEdebiyat() * 4;
    }
}
