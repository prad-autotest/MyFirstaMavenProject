package constructors;

public class Employee {  //ABCD

    //constructor will have same name as class name
    //it will look like a method but it is not a method
    //does not have any explicit return type  //implicit return type
    public Employee(){// constructor --> it helps to construct the object

    }
    public Employee(int id, String firstName,String lastName,boolean isPermanentEmployee){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isPermanentEmployee = isPermanentEmployee;
    }

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(int id, String firstName, String lastName, int age, String companyName, boolean isPermanentEmployee) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.companyName = companyName;
        this.isPermanentEmployee = isPermanentEmployee;
    }

    public void work(){
        System.out.println("9 hours");
    }

    private int id; //0
    private String firstName; //null  //change
    private String lastName;
    private int age; //0 //optional
    private String companyName; //optional
    private boolean isPermanentEmployee; //false




    //.java --> compiler --> .class

}
