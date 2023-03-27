package Chpter2_Java_ClassAndObjects;

public class Employee {
   String employeeName;
   int employeeSalary;
   String companyName;
   String emplyeeId;

   Employee(){
       employeeName="Aayush Khurana";
       employeeSalary=50000;
       emplyeeId="Id-@56788";
       companyName="Microsoft";
   }
   void display(){
       System.out.println("Employee company name:"+companyName);
       System.out.println("Employee  name:"+employeeName);
       System.out.println("Employee Id:"+emplyeeId);
       System.out.println("Employee Salary:"+employeeSalary);

   }
   public static void main(String[] args){
       Employee employee=new Employee();
       employee.display();
   }


}
