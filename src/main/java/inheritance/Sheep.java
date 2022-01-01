package inheritance;

public class Sheep extends Animal{


    @Override
    public boolean isDomestic() {
        return true;
    }

    @Override
    public void sleep() {
        System.out.println("sleep for 2 hours");
    }
}
