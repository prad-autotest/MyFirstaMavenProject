package tests;

import encapsulation.Student;

public class EncapsulationTest {

    public static void main(String[] args) {
        Student student = new Student("ssjkbdf",23); //initialising the values

        Student fsdjksb = new Student("fsdjksb", 35);
        student.setEmail("sdkbfs");
        System.out.println(student.getFname());
        System.out.println(student.getEmail());
        student.setRollNo(56);

    }
}
