package tests;

import bank.RBI;
import bank.SBI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankTest { //BankTest is not a child class of RBI


    //JVM needs to access

    public static void main(String[] args) {
        SBI sbi = new SBI(6.35);
        //System.out.println("sbi.rateOfInterest = " + sbi.rateOfInterest);
        sbi.withdrawal();

        RBI rbi = new RBI() {
            @Override
            public void deposit() {

            }
        };


        //public --> accessed by any class
        //private --> it can be accessed only within the class
        //protected --> it can be accessed only by the class and its child classes
        //default or package protected
    }
}
