package Chapter4_Methoads;

public class VoidMethod {

    public VoidMethod() {
    }

    public static void main(String[] args){
   VoidMethod myObject=new VoidMethod();
   myObject.multiplication(90,90);
    }
    void multiplication(int a, int b){
           int c;
           c=a*b;
           System.out.println(c);
    }
}
