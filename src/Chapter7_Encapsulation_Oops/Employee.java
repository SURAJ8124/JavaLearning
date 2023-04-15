package Chapter7_Encapsulation_Oops;

public class Employee {

    private String employeeName;
    private int employeeId;

    public int getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String name){
        this.employeeName=name;
    }
    public void setEmployeeId(int id){
        this.employeeId=id;
    }
}
