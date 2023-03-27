package Chpter2_Java_ClassAndObjects;

public class Student {
    String name;
    int rollNo;
    char division;
    int age;
    Student(){
        name="Suraj";
        rollNo=45;
        division='A';
        age=19;
    }
    void display(){
        System.out.println("Student Name:"+name);
        System.out.println("Student rollNo:"+rollNo);
        System.out.println("Student age:"+age);
        System.out.println("Student division:"+ division);

    }
    public static void main(String[] args){
        Student object= new Student();
        object.display();
    }


}
