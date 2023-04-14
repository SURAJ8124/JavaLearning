package Chapter5_Constructor;

public class DefaultConstructor {
    int age;
    String name;
    String address;

    DefaultConstructor(){
        //in the default Constructor not any body section to write a code and not any parameter will be pass.
    }
    void display( String name, int age, String address){
        this.name=name;
        this.address=address;
        this.age=age;
         System.out.println(name+" "+ age + " "+address);
    }

    public static void main(String[] args){
    DefaultConstructor object= new DefaultConstructor();
      object.display("Suraj Tanaji Chavan", 19, "Wakad");

    }


}
