/*Write program in java to perform addition of two matrices
(multidimensional array) and set the diagonal elements of
resultant matrix is 0.
*/


package College_Exam;

public class MultiDimensionalArray {

    public static void main(String[] args){
        int arrayFirst[][]={
                {10,20,30},
                {40,50,60},
                {90,110,130}
        };

        int arraySecond[][]={
                {1,2,3},
                {4,5,6,},
                {0,9,8}
        };
        int resultantArray[][]= new int[3][3];
        for (int i=0;i< arrayFirst.length;i++){
            for (int j=0; j<arraySecond.length;j++){
                resultantArray[i][j]=arrayFirst[i][j]+arraySecond[i][j];
            }
        }
        for(int k=0; k<resultantArray.length; k++){
            for (int a=0; a< resultantArray.length;a++){
                if(k==a){
                    resultantArray[k][a]=0;
                }
                System.out.println(""+resultantArray[k][a]);
            }
        }

    }

}
