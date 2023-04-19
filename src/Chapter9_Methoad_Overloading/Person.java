package Chapter9_Methoad_Overloading;

public class Person {
    private String name;
    private int age;

    public Person() {
        // default constructor
    }

    public Person(String name) {
        this.name = name;
        System.out.println(name);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name+age);
    }
    public static void main(String[] args){
        Person personOne=new Person("Suarj");
        Person personSecond=new Person("Suarj",19);


    }
}
