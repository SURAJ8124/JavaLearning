package Chapter8_Inheritance;

public class Addition extends Calculation{

    public  Addition(int i, int j){
        super(i,j);
        int c;
        c = i+j;
        System.out.println("The addition is:"+c);
    }

    public static void main(String[] args){
        Addition object= new Addition(78,90);
        object.print();


    }

}
