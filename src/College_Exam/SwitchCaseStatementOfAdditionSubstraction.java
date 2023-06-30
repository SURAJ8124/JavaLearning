//Write a program in java using switch-case statement to perform addition,substraction,
//Multiplication and division of given two numbers and print the result.



package College_Exam;

public class SwitchCaseStatementOfAdditionSubstraction {
    private int a;
    private int b;
    private String operation;

    SwitchCaseStatementOfAdditionSubstraction(int x, int y, String calculation){
        a = x;
        b = y;
        operation = calculation;
    }

    int function(){
        int answer = 0;
        switch (operation){
            case "addition":
                answer = a + b;
                break;
            case "subtraction":
                answer = a - b;
                break;
            case "multiplication":
                answer = a * b;
                break;
            case "division":
                answer = a / b;
                break;
        }
        return answer;
    }

    public static void main(String[] args){
        SwitchCaseStatementOfAdditionSubstraction obj = new SwitchCaseStatementOfAdditionSubstraction(5, 5, "addition");
        SwitchCaseStatementOfAdditionSubstraction object = new SwitchCaseStatementOfAdditionSubstraction(15, 5, "subtraction");
        System.out.println(object.function());
    }
}

