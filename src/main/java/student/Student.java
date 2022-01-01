package student;

public class Student {

    public String name; //when each object have diff value
    public int rollNum;
    private static String schoolName="abcd"; //common for all objects

    public Student(){
        name="dfjbg";
        rollNum=4;
    }

    public static void changeSchoolName(){
        schoolName ="jfbjsds";
    }



}
