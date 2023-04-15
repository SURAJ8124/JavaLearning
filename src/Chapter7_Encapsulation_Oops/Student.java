package Chapter7_Encapsulation_Oops;
//this example of encapsulation with student class and teacher class
public class Student {
    private String name;
    private int rollNumber;

    public String getName(){
         return name;
    }
    public int getRollNumber(){
        return rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}

