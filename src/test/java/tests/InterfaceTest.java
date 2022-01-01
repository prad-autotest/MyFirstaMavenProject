package tests;

public class InterfaceTest {

    private static String name="Amuthan";
    static{
        System.out.println("I am in static block");
        System.out.println(name);
        name="Testing";
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
    //class loader --> which fetched all the classes and load in memory
}
