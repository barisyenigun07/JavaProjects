package DependencyInversion;

public class B implements IHelper {
    @Override
    public void sayHi() {
        System.out.println("Hi!");
    }
}
