package Chapter10_Methoad_Overriding;

public class Engagement {
   public void engagementDate(){
        System.out.println("Engagement will be done on 23 Dec");
    }
    public void marryDate(){
       System.out.println("Marry will be on 25 Dec");
    }
}
 class Marry extends Engagement{
    //Methoad overriding
    public void marryDate(){
        System.out.println("Marry will be on 27 Dec");
    }
     public static void main(String[] args){
    Marry obj= new Marry();
    Engagement objEngagement= new Engagement();
    objEngagement.marryDate();
    obj.marryDate();
     }
}


