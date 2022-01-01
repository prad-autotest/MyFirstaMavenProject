package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class ListenersTest {

    @Test(description = "To check whether ....")
    public void listenersTest() throws InterruptedException {

        int[] a = {5,6,7,8,9};
        List<String> list= new ArrayList<>(); //index
        list.add("sdfsf");
        list.add("sdfsf");
        list.add("sdfssdfsf");
        list.get(1);

        Set<String> set = new HashSet<>(list); //does not allow duplicate, does not allow index based access
        System.out.println(set); //also does not maintain insertion order

        //list, set, map

        //key - value
        // rollnum - name

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Amuthan");
        map.put(2,"Bala");
        map.put(3,"Sachin"); //two duplicate keys is not allowed
        map.put(3,"Tendulkar");

        Set<Integer> integers = map.keySet();

        for(Integer x : integers){
            System.out.println(x);
            System.out.println(map.get(x));
        }

        System.out.println(map.get(3));

        Map<String,String> countriesCapital = new LinkedHashMap<>();
        countriesCapital.put("India","New Delhi");
        countriesCapital.put("China","Beijing");

        System.out.println(countriesCapital.get("USA"));

        Set<String> countryNames = countriesCapital.keySet();

        for(String temp: countryNames){
            System.out.println(temp +":"+countriesCapital.get(temp));
        }



    }
}
