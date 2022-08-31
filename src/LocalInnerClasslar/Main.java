package LocalInnerClasslar;

public class Main {
    public static void main(String[] args){

        class Alan{
            public void daireAlan(int yaricap){
                System.out.println("Dairenin Alanı: " + (Math.PI * yaricap * yaricap));
            }
        }
        Alan alan = new Alan();
        Alan alan2 = new Alan();
        alan.daireAlan(10);
        alan2.daireAlan(3);
    }
    public static void deneme(){
        //Alan alan = new Alan();
    }
}
