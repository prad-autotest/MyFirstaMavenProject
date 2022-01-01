package inheritance;

public abstract class DomesticAnimal extends Animal{

    public DomesticAnimal(){
        System.out.println("I am in dom animal cons");
    }

    @Override
    public boolean isDomestic() {
        return true;
    }

    @Override
    public void eat(){

    }

    public void sleep(){
        System.out.println("i from domes animal ");
    };
}
