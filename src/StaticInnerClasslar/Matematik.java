package StaticInnerClasslar;

public class Matematik {
    private static double PI = Math.PI;
    public static class Alan{
        public static void daire_alan(int yaricap){
            System.out.println("Dairenin Alanı: " + (PI * yaricap * yaricap));


        }
    }
}
