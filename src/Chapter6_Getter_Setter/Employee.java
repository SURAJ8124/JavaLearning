package Chapter6_Getter_Setter;

public class Employee {
    private String employeeName;
    private int employeeSalary;
    private int employeeId;

    public int getEmployeeId(){
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void display(){
        System.out.println("Employee : "+employeeName);
        System.out.println("Employee Salary : "+employeeSalary );
        System.out.println("Employee id :"+employeeId);
    }

    public Employee() {
    }
    public static void main(String[] args){
        Employee object=new Employee();
        object.setEmployeeSalary(50000);
        object.setEmployeeId(2);
        object.setEmployeeName("Saurabh Jadav");
        object.display();
    }
}
