package Chapter4_Methoads;

public class CalculationMethoad {

    public CalculationMethoad() {
    }

    int addition(int a, int b){
          int sum;
          sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        CalculationMethoad object= new CalculationMethoad();
       System.out.println(object.addition(45,67)) ;
    }
}
