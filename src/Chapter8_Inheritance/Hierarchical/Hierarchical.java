package Chapter8_Inheritance.Hierarchical;

class Animal{
    protected String animalName;

    Animal(String animalName){
        this.animalName=animalName;
    }
    void eat(){
        System.out.println(animalName+" is eating.");
    }
}
class Dog extends Animal{
    protected String nameDog;
    Dog(String nameDog, String animalName){
        super(animalName);
        this.nameDog=nameDog;

    }
    void bark()
    {System.out.println(nameDog+" is barking");}
}
class Cat extends Animal{
    protected String name;
    Cat(String catName,String animalName){
        super(animalName);
        this.name=catName;

    }
    void meow(){
        System.out.println(name+" is meowing");
    }



}


public class Hierarchical {
    public static void main(String[] args){
        Cat c=new Cat("Ketty","Ketty");
        c.meow();
        c.eat();
        Dog d= new Dog("joy","joy");
        d.eat();
        d.bark();
    }
}
