package encapsulation;

public class Student {

    private String fname;
    private int rollNo;
    private String email;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    //setter method
    public void setEmail(String email){
        if(email.endsWith("@gmail.com")) {
            this.email = email;
        }
        else{
            System.out.println("hey provide a valid email");
        }
    }
    public String getEmail(){
       if(this.email != null){
           return this.email;
       }else{
           return "hey you have not provided a valid email";
       }
    }

    public Student(String fname, int rollNo) {
        this.fname = fname;
        this.rollNo = rollNo;
    }
}
