package Chapter9_Methoad_Overloading;

public class MethoadOverloadingSubstraction {
    int z;
    public int substraction(int a, int b, int c){
        z=a-b-c;
        return z;
    }
    public int substraction(int a, int b){
        z=a-b;
        return z;
    }
    public double substraction( double a, double b){
        return a-b;
    }

    public MethoadOverloadingSubstraction() {
    }

    public static void main(String[] args){
        MethoadOverloadingSubstraction obj= new MethoadOverloadingSubstraction();
        System.out.println(obj.substraction(67,89));
        System.out.println(obj.substraction(12,11,10));
        System.out.println(obj.substraction(90.0,88.34));
    }
}
