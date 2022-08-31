package DependencyInversion;

public class A {
    private IHelper helper;

    public A(IHelper helper){
        this.helper = helper;
    }
    public void sayHi(){
        helper.sayHi();
    }
}
