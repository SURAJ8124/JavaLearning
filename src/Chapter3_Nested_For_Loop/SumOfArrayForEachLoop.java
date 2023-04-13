package Chapter3_Nested_For_Loop;

public class SumOfArrayForEachLoop {
    public static void main(String[] args){
        int num[]={34,78,67,36,98,12,35,67,65,100};
        int sum=0;
        for (int addition:num
             ) {
            sum+=addition;
        }
        System.out.println(sum);
    }


}
