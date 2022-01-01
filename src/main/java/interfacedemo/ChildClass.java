package interfacedemo;

public class ChildClass implements ParentInterface, Parent2Interface {

    @Override
    public void method1() {
        System.out.println("child class method");
    }

    @Override
    public void method3() {
        System.out.println("my implementation");
    }

    @Override
    public void method2() {

    }
}
