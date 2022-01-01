package bank;

public class SBI extends RBI {

    public SBI(double roi){
        super(roi);
        System.out.println("I cannot be written as First Line. Poor me");
    }

    @Override
    public void withdrawal() {
        System.out.println("please withdraw from atm");
        super.withdrawal();
        System.out.println(super.rateOfInterest);

    }

    @Override
    public void deposit() {
        System.out.println("please deposit in atm");
    }
}
