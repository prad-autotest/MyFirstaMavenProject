package inheritance;

public class Dog extends  DomesticAnimal{

    public Dog(){
        System.out.println("I am in dog class const");
    }

    @Override
    public void sleep(){
        System.out.println("I am sleeping in Dog class");
    } //child class for Animal parent class

    public void bark(){
        System.out.println("I am barking");
    }

}
