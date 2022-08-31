package OOP_Mini_Proje;

public class Calisan {
    private String isim;
    private String soyisim;
    private int maas;
    private int id;

    public Calisan(String isim,String soyisim,int maas,int id){
        this.setIsim(isim);
        this.setMaas(maas);
        this.setSoyisim(soyisim);
        this.setId(id);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void bilgilerigoster(){
        System.out.println("İsim: " + isim);
        System.out.println("Soyisim: " + soyisim);
        System.out.println("ID: " + id);
        System.out.println("Maaş: " + maas);
    }
}
