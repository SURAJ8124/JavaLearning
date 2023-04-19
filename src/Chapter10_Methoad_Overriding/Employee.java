package Chapter10_Methoad_Overriding;

public class Employee {
   public static class A{
        public void display(){
            System.out.println("This is employee A");

        }
    }
   public static class B extends A{
        public void display(){
            System.out.println("This is employee B");
        };
        public static void main(String[] args){
            B object= new B();
            A objectSecond= new A();
            objectSecond.display();
            object.display();
        }
    }

}
