package StringSınıfı;

public class Main {
    public static void main(String[] args){
        String kelime = "merhaba";
        System.out.println(kelime.charAt(4));
        System.out.println(kelime.charAt(2));
        System.out.println(kelime.charAt(kelime.length() - 1));
        int b1 = 1923;
        String a1 = String.valueOf(b1);
        String s1 = new String("barış");
        String s2 = new String("barış");
        if (s1.equals(s2)){
            System.out.println("Eşitler");
        }
        else{
            System.out.println("Eşit değiller");
        }
        System.out.println(a1);
    }
}
