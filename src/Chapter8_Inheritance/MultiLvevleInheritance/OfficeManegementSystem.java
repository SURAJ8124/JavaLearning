package Chapter8_Inheritance.MultiLvevleInheritance;

public class OfficeManegementSystem {
    public static class CompanyName{
        String name;
        String address;
        int companyStrength;

        public CompanyName(String name,String address, int companyStrength){
            this.name=name;
            this.address=address;
            this.companyStrength=companyStrength;
            System.out.println("Name: "+name);
            System.out.println("Address: "+address);
            System.out.println("CompanyStrength: "+companyStrength);
        }


    }

    public static class Employee extends CompanyName{
        String employeeName;
        String empolyeeAddress;
        String employeeId;


        public  Employee (String employeeName, String empolyeeAddress, String employeeId, String name, String address, int companyStrength ){
            super(name, address, companyStrength);
            this.employeeName=employeeName;
            this.empolyeeAddress=empolyeeAddress;
            this.employeeId=employeeId;
            System.out.println("employeeName: "+employeeName);
            System.out.println("empolyeeAddress: "+empolyeeAddress);
            System.out.println("employeeId: "+employeeId);
        }

    }

    public static void main(String[] args){
        Employee obj=new Employee("Suraj chavan", "Wakad","A90ik3567@566","Amazon","Banglore", 500000);
    }

}
