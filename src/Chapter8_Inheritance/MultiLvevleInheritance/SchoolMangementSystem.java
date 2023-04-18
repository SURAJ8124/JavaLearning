package Chapter8_Inheritance.MultiLvevleInheritance;

public class SchoolMangementSystem {
    public static  class Person{
        String name;
        String address;
        int age;
        public Person(String name,String address,int age){
            this.name = name;
            this.address = address;
            this.age = age;
            System.out.println("Name:"+name);
            System.out.println("address: "+address);
            System.out.println("age: "+age);
        }
    }

   public static class Student extends Person{
        int studentID;
        int gradeLevel;
        public Student(String name, String address, int age, int studentID, int gradeLevel) {
            super(name, address, age);
            this.studentID = studentID;
            this.gradeLevel = gradeLevel;
            System.out.println("studentID:"+studentID);
            System.out.println("gradeLevel: "+gradeLevel);
        }

    }

    public static class Grade extends Student {
        double gpa;
        int classRank;

        public Grade(String name, String address, int age, int studentID, int gradeLevel, double gpa, int classRank) {
            super(name, address, age, studentID, gradeLevel);
            this.gpa = gpa;
            this.classRank = classRank;
            System.out.println("gpa:"+gpa);
            System.out.println("classRank: "+classRank);
        }

    }


    public static void main(String[] args){
        Grade obj=new Grade("Sunil jadhav","Wakad city",35, 6720987,9, 8.1,3);

    }
}
