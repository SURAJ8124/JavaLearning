package Chapter9_Methoad_Overloading;

public class MethoadOverloadingAddition {
    int d;
    String sum;
    public int addition(int a, int b, int c){
        d=a+b+c;
        return d;
    }
    public double addition(int a, int b){
        d=a+b;
        return d;
    }
    public String addition(String a, String b){
        sum=a+b;
        return sum;
    }

    public MethoadOverloadingAddition() {
    }

    public static void main(String[] args){
        MethoadOverloadingAddition obj= new MethoadOverloadingAddition();
        System.out.println(obj.addition(45,89));
        System.out.println(obj.addition(67,90,23));
        System.out.println(obj.addition("Suraj", " Chavan"));

    }
}
