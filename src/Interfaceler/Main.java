package Interfaceler;

public class Main{
    public static void main(String[] args){
        PcMuhendisi muhendis1 = new PcMuhendisi(false,false);
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalaması(3.15));
        String[] tecrube = {"Vestel","Havelsan","Türksat"};
        muhendis1.is_tecrubesi(tecrube);


    }
}
