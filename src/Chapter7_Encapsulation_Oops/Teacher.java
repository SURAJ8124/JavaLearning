package Chapter7_Encapsulation_Oops;
//this example of encapsulation with student class and teacher class
public class Teacher {

    public static void main(String[] args)
    {
        Student student= new Student();
        student.setName("Suraj");
        student.setRollNumber(12);
        System.out.println(student.getName());
       System.out.println(student.getRollNumber());
    }

}
