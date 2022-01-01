package inheritance;

public abstract class Animal { //parent --> child
    //grandparent --> parent --> child

    public Animal(){
        System.out.println("I am in Animal Constructor");
    }

    public int numberOfEars=2;

    public abstract boolean isDomestic();

    public void eat(){
        System.out.println("eat on time");
    } //all the child classes needs to only use this

    public void run(){
        System.out.println("running");
    }

   public abstract void sleep(); //when a method does not have a body or implementation



}
