package Chapter10_Methoad_Overriding;

public class School {
   public static class Class{
        public void displayNotice(){
               System.out.println("This is class 10th A");
        }
        public int strngthOfClass(){
            return 90;
        }
    }
    public static class Student extends Class{
        public int strngthOfClass(){
            return 120;
        }

    }
    public static  void main(String[] args){
        Student obj= new Student();
       System.out.println(obj.strngthOfClass());
       Class objSec=new Class();
        System.out.println( objSec.strngthOfClass());
        objSec.displayNotice();

    }


}
