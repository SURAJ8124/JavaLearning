package Chapter7_Encapsulation_Oops;

public class Boss {

    public static void main(String[] args){
        Employee employee= new Employee();
        employee.setEmployeeId(90);
        employee.setEmployeeName("Rakesh choudhary");
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getEmployeeId());

        Student object= new Student();
        object.setRollNumber(1);
        object.setName("harry");
        System.out.println(object.getName());
        System.out.println(object.getRollNumber());
        object.setName("joy");
        object.setRollNumber(2);
        System.out.println(object.getName());
        System.out.println(object.getRollNumber());
    }
}
