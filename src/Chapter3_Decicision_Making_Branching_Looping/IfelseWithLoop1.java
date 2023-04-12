package Chapter3_Decicision_Making_Branching_Looping;

public class IfelseWithLoop1 {

   public static void main(String[] args){

       int array[]={ 38, 78, 55, 90, 20, 33,3,4,5};

       for (int i=0; i<array.length;i++){

           if(array[i]%2==0){
               System.out.println(array[i]+" is even number");
           }
           else {
               System.out.println(array[i]+" is Odd number");

           }
       }

   }

}
