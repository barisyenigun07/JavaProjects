package OzelliklerinKapsami;

public class Main {
    public static void main(String[] args) {
        KapsamSinifi kapsamSinifi = new KapsamSinifi();
        //kapsamSinifi.onileCarp();
        KapsamSinifi2.DahiliSinif kapsam = new KapsamSinifi2().new DahiliSinif();
        kapsam.onileCarp();
        KapsamSinifi2 kapsam2 = new KapsamSinifi2();
        kapsam2.dahiliSinifKontrol();
    }
}
