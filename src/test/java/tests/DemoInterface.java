package tests;

public interface DemoInterface { //1.7 - abstract methods, default methods here, static methods

    void show();
    default void classAMethod(){
        System.out.println("default implementation");
    }


}
