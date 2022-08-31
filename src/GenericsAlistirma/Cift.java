package GenericsAlistirma;

public class Cift<T> {
    private T ilk;
    private T ikinci;

    public Cift(T ilk,T ikinci){
        this.setIlk(ilk);
        this.setIkinci(ikinci);
    }

    public T getIlk() {
        return ilk;
    }

    public void setIlk(T ilk) {
        this.ilk = ilk;
    }

    public T getIkinci() {
        return ikinci;
    }

    public void setIkinci(T ikinci) {
        this.ikinci = ikinci;
    }
    public boolean esitMi(Object obj){
        if (obj == null){
            return false;
        }
        else if (this.getClass() != obj.getClass()){
            return false;
        }
        else{
            Cift<T> objCift = (Cift<T>) obj;
            return (this.ilk.equals(objCift.getIlk()) && this.ikinci.equals(objCift.getIkinci()));
        }
    }
}
