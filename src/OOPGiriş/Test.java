package OOPGiriş;

public class Test {
    public static void main(String[] args){
        Araba araba = new Araba();
        araba.setKapılar(4);
        System.out.println(araba.getKapılar());
        araba.setModel("Renault");
        System.out.println(araba.getModel());
        araba.setRenk("Beyaz");
        System.out.println(araba.getRenk());
    }
}
