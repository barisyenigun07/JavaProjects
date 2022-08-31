package OOPGiriş;

public class Araba {
    private String renk;
    private int kapılar;
    private int tekerlekler;
    private String motor;
    private String model;

    public void setModel(String model){
        this.model = model;

    }

    public String getModel() {
        return model;
    }
    public void setRenk(String renk){
        this.renk = renk;
    }
    public String getRenk(){
        return renk;
    }
    public void setKapılar(int kapılar){
        if (kapılar < 0){
            System.out.println("Kapı sayısı negatif olamaz");
        }
        else{
            this.kapılar = kapılar;
        }

    }
    public int getKapılar(){
        return kapılar;
    }
    public void setTekerlekler(int tekerlekler){
        if (tekerlekler < 0){
            System.out.println("Tekerlek sayısı negatif olamaz");
        }
        else{
            this.tekerlekler = tekerlekler;
        }

    }
    public int getTekerlekler(){
        return tekerlekler;
    }
    public void setMotor(String motor){
        this.motor = motor;
    }
    public String getMotor(){
        return motor;
    }
}
