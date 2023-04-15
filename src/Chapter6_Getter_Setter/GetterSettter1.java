package Chapter6_Getter_Setter;

public class GetterSettter1 {

   private String name;
   private int age;

   public  String getName(){
       return name ;
   }
   public int getAge(){
         return age;
   }

   public void setName(String name){
           this.name=name;
   }
   public void setAge(int age){
       this.age=age;
   }

   public static void main( String[] args){
       GetterSettter1 object=new GetterSettter1();
       object.setName("Suraj");
       object.setAge(19);
      String n= object.getName();
       int a= object.getAge();
       System.out.println("Name : "+n);
       System.out.println("Age : "+a);

   }

}
