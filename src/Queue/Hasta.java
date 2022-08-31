package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Hasta implements Comparable<Hasta>{
    private String isim;
    private String hastalık;
    private int oncelik;

    public Hasta(String isim,String hastalık){
        this.isim = isim;
        this.hastalık = hastalık;
        if (hastalık.equals("Apandist")){
            this.oncelik = 3;
        }
        else if (hastalık.equals("Yanık")){
            this.oncelik = 2;
        }
        else{
            this.oncelik = 1;
        }
    }

    @Override
    public int compareTo(Hasta o) {
        if (this.oncelik > o.oncelik){
            return -1;
        }
        else if (this.oncelik < o.oncelik){
            return 1;
        }
        else{
            return 0;
        }
    }
    public String toString(){
        return "Hasta Adı: " + isim +
                "\nŞikayet: " + hastalık+
                "\nÖncelik: " + oncelik;
    }
    public static void main(String[] args){
        Queue<Hasta> acilservis = new PriorityQueue<>();
        acilservis.offer(new Hasta("Barış Bey","Yanık"));
        acilservis.offer(new Hasta("Erdem Bey","Baş Ağrısı"));
        acilservis.offer(new Hasta("Merve Hanım","Apandist"));
        acilservis.offer(new Hasta("Oğuz Bey","Apandist"));
        acilservis.offer(new Hasta("Gizem Hanım","Yanık"));

        int i = 1;
        while (!acilservis.isEmpty()){
            System.out.println("******************");
            System.out.println(i + ". sırada");
            System.out.println(acilservis.poll());
            System.out.println("******************");
            i++;
        }
    }
}
