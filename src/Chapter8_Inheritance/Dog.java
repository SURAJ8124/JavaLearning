package Chapter8_Inheritance;

public class Dog  extends Animal{
    public Dog(String name){
            super(name);
    }
    public void bark(){
        System.out.println(name+" is barking.");
    }
        public static void main(String[] args) {
            Dog dog = new Dog("Max");
            dog.eat(); // inherited from Animal class
            dog.bark(); // specific to Dog class
    }

}
