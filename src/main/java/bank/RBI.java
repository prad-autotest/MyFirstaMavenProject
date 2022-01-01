package bank;

public abstract class RBI {

    protected RBI(){}

    protected RBI(double roi){
        this.rateOfInterest = roi;
    }

    public double rateOfInterest;


    public void withdrawal(){
        System.out.println("hey i am RBI method - i support wd from bank");
    };
    public abstract void deposit();

    //defines the skeleton

}
