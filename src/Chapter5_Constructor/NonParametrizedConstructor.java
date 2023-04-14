package Chapter5_Constructor;

public class NonParametrizedConstructor {
     String studentName;
     int studentRollNo;
     String studentDiv;

     NonParametrizedConstructor(){
         studentDiv="A";
         studentName="Harry";
         studentRollNo=12;

         System.out.println(studentName+" "+ studentRollNo + " "+studentDiv);
     }

public static void main(String[] args){
         NonParametrizedConstructor object=new NonParametrizedConstructor();
}

}
