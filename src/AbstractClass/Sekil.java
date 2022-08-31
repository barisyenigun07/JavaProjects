package AbstractClass;

public abstract class Sekil{
    private String isim;

    public Sekil(String isim) {
        this.setIsim(isim);
    }
    public void ismini_soyle(){
        System.out.println("Bu obje " + getIsim() + " objesidir.");
    }
    abstract void alan_hesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
