package inheritance;

public  class WildAnimal extends Animal {

    @Override
    public boolean isDomestic() {
        return false;
    }

    public  void sleep(){
        System.out.println("sdfjs");
    }
}
