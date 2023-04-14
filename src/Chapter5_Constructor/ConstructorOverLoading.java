package Chapter5_Constructor;

public class ConstructorOverLoading {
    String companyName;
    int companyRegiserNo;
    String companyAddress;

    int strengthOfEmployee;

    ConstructorOverLoading(){
        //default
    }
    ConstructorOverLoading(int employee, String address, String name){
        this.strengthOfEmployee=employee;
        this.companyAddress=address;
        this.companyName=name;
    }
    ConstructorOverLoading( int companyRegiserNo){
         this.companyRegiserNo=companyRegiserNo;
    }
    void display(){
        System.out.println(companyName+" " +companyRegiserNo+" " +companyAddress+" "+strengthOfEmployee);
        System.out.println("");
    }

    public static void main(String[] args){
        ConstructorOverLoading objectOne= new ConstructorOverLoading();
        ConstructorOverLoading seconfObject= new ConstructorOverLoading(500, "Pune", "Amazon");
        ConstructorOverLoading thirdObject= new ConstructorOverLoading(89023);
        objectOne.display();
        seconfObject.display();
        thirdObject.display();
    }





}
