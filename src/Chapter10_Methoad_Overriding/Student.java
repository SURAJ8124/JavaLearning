package Chapter10_Methoad_Overriding;
/*If we have student class and in that class one methoad that is displaying
student data age and name and suppose in future we want to add in that student adrees and student mobile
number.
 */
public class Student {
   public static class StudentClass{
        public void diplayData(String name, int age){
            System.out.println("Student Name:"+name);
            System.out.println("Student age:"+age);
        }
    }
    public static class futureStudentClass extends StudentClass{
        public void displayData(String name, int age, String mobileNumber, String address){
            System.out.println("Student Name:"+name);
            System.out.println("Student age:"+age);
            System.out.println("Student Mobile Number:"+mobileNumber);
            System.out.println("Student Address:"+address);
        }
    }
    public static void main(String[] args){
        futureStudentClass obj= new futureStudentClass();
        StudentClass objSecond= new StudentClass();
        objSecond.diplayData("Suraj",19);
        obj.displayData("Suraj",19,"9029987364","Wakad");
    }

}
