package Chapter3_Decision_SwitchCase_Satement;
import java.util.Scanner;
public class SwitchCaseStatement3 {
    public static void main(String[] args){
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter a class which is you want to attend:");
        String className=myObj.nextLine();

        switch (className) {
            case "Class 1":
                System.out.println("Your class is 1st ");
                break;

            case "Class 2":
                System.out.println("You class is second");
                break;

            case "Class 3":
                System.out.println("Your class is third");
                break;

            case "Class 4":
                System.out.println("Your class is fourth");
                break;

            case "Class 5":
                System.out.println("Your class is fifth ");
                break;
            case "Class 6":
                System.out.println("You class is six");
                break;
            default:
                System.out.print("This class is not available");
        }

    }
}
