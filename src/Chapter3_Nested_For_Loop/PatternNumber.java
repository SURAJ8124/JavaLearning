package Chapter3_Nested_For_Loop;

public class PatternNumber {
    public static void main(String[] args){
        System.out.println("Display the number pattern: ");

        for(int i=1; i<10;i++){
            for(int j=1;j<=i;j++){
              System.out.print(j +" ");
            }
            System.out.println(" ");
        }

    }
}
