package Chapter5_Constructor;

public class ParametrizedConstructor {
    String employeeName;
    int salary;
    String emploeeRole;

    String employeeId;

    ParametrizedConstructor(String name, int money,String id, String role){
        this.employeeId=id;
        this.salary=money;
        this.emploeeRole=role;
        this.employeeName=name;


    }

    void display(){
        System.out.println(employeeName+" "+ employeeId+" "+ salary+" "+ emploeeRole);
    }

    public static void main(String[] args){
        ParametrizedConstructor object=new ParametrizedConstructor("John", 50000,"i235d345","Software Engineer");
         object.display();
    }
}
