package Chapter3_Decicision_Making_Branching_Looping;

public class IfelseWithLoop3 {
    public static void main(String[] args){
        int array1[]={78,34,67,89,63,166,70,99,45,52,77};
        int array2[]={67,89,65,89,190,45,62,92,83,67,55};
        int size=array1.length;
        int sumArray[]=new int[size];
        //Sum of two array
        for (int i=0;i<array1.length;i++){
            int sum=0;
              sum=array1[i]+array2[i];
                sumArray[i]=sum;
        }
        for(int k=0;k<sumArray.length;k++){
            System.out.println(sumArray[k]);
        }
    }
}
