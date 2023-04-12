package Chapter3_Decision_SwitchCase_Satement;
import java.util.Scanner;
public class SwitchCaseStatement2 {
     public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
         System.out.println("Enter a car number : ");
         int number= myObj.nextInt();
         switch (number) {
             case 12:
                 System.out.println("Your car name is audy");
                 break;

             case 24 :
                 System.out.println("Your car name is BMW");
                 break;

             case 36:
                 System.out.println("Your car name is mercedes");
                 break;

             case 48:
                 System.out.println("Your bike name is R15V$ B6 black thunder");
                 break;

             case 60 :
                 System.out.println("Your bike name is bullet 350");
                 break;
             case 72:
                 System.out.println("You bike name is shine sp 125 ");
                 break;
             default:
                 System.out.println("Please enter right number");
         }

     }
}