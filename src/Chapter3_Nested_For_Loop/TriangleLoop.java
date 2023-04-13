package Chapter3_Nested_For_Loop;

public class TriangleLoop {

    public static void main(String[] args){

        System.out.println("Display the triangle of * :");
        for(int i=1;i<5;i++){

            for(int j=1; j<=i;j++){
                System.out.print("* "+ " ");
            }
            System.out.println(" ");

        }
    }
}
