package Queue;

import java.util.PriorityQueue;
import java.util.Queue;
class Player implements Comparable<Player>{
    private String isim;
    private int id;

    public Player(String isim,int id){
        this.isim = isim;
        this.id = id;
    }
    public int compareTo(Player player){
        if (this.id < player.id){
            return -1;
        }
        else if (this.id > player.id){
            return 1;
        }
        else{
            return 0;
        }
    }
    public String toString(){
        return "Player{" + "isim = " + isim + ", id=" + id + '}';
    }
}

public class Test {
    public static void main(String[] args){
        Queue<Player> queue = new PriorityQueue<>();
        queue.offer(new Player("Barış",5));
        queue.offer(new Player("Erdem",1));
        queue.offer(new Player("Emrah",100));
        while (!queue.isEmpty()){
            System.out.println("Eleman Çıkarılıyor: " + queue.poll());
        }
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(77);
        q.offer(54);
        q.offer(66);
        q.offer(87);
        q.offer(13);
        q.offer(23);
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
