//Write a program which receives n integer. Store the integers in an array.
//Programe outputs the number of odd and even numbers present in array.

package College_Exam;
import java.util.Scanner;

public class Array {
public static void main(String[] args){
 Scanner object=new Scanner(System.in);
 System.out.println("Enter A numbers of array");
 int n=object.nextInt();
  int array[]=new int[n];
  for(int i=0;i<n;i++){
     array[i]=object.nextInt();
  }
 int even=0;
 int odd=0;
  for(int j=0;j<n;j++){
  if(array[j]%2==0){
   even++;
  }
  else{
   odd++;
  }
  }
 System.out.println(even);
 System.out.println(odd);
}
}






