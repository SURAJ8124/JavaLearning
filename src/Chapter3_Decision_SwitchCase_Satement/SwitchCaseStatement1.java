package Chapter3_Decision_SwitchCase_Satement;
import java.util.Scanner;
public class SwitchCaseStatement1 {
    public static void main(String[] args){
        String day="Monday";

        switch (day) {
                case "Monday":
                    System.out.println("You choose monday");
                    break;

            case "Tuesday":
                System.out.println("You choose Tuesday");
                break;

            case "Wednesday":
                System.out.println("You choose Wednesday");
                break;

            case "Thursday":
                System.out.println("You choose Thursday");
                break;

            case "Friday":
                System.out.println("You Choose Friday ");
                break;
            case "Saturday":
                System.out.println("You Choose Saturday ");
                break;
        }
    }
}
