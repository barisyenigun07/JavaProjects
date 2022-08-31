package GenericsAlistirma;

public class Test {
    public static void main(String[] args){
        Cift<String> cift1 = new Cift<>("Merhaba","Dünya");
        Cift<String> cift2 = new Cift<>("Merhaba","Dünya");
        Cift<Integer> cift3 = new Cift<>(3,4);
        Cift<Character> cift4 = new Cift<>('J','K');
        System.out.println(cift4.getIlk().getClass().getSimpleName());
        Object object1 = new Object();
        System.out.println(object1.hashCode());
        Object object2 = new Object();
        System.out.println(object2.hashCode());
        String hashcode = String.valueOf(object1.hashCode());
        String id = hashcode.substring(0,7);
        System.out.println(id);



    }
}
