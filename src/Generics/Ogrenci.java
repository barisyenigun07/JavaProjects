package Generics;

public class Ogrenci {
    private String isim;

    public Ogrenci(String isim) {
        this.setIsim(isim);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "İsim :" + isim;
    }
}
