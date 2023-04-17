package Chapter8_Inheritance;

public class Calculation {
    protected int a;
    protected int b;
    public Calculation(int x, int y){
        this.a=x;
        this.b=y;
        System.out.println("The calculation is performed on two integer values");
    }
    public void print (){
        System.out.println("The first  value is :"+a+" Second Value is "+b);
    }

    public Calculation() {
    }
}
