package Chapter3_Decicision_Making_Branching_Looping;

public class IfelseWithLoop2 {

    public static void main(String[] args){
        int studentMarks[]={34,90,98,35,91,56,89,76,56};
        int i=0;
        int lengthArray=studentMarks.length;
        while (i < lengthArray) {

            if(studentMarks[i]>=35){
                System.out.println("You are pass "+studentMarks[i]);
            }
            else{
                System.out.println("You are fail" +studentMarks[i]);
            }
            i++;
        }

    }

}
