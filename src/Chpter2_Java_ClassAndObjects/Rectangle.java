package Chpter2_Java_ClassAndObjects;

public class Rectangle {
    int length,breadth;
    Rectangle(int l,int b ){
        this.length=l;
        this.breadth=b;
    }
    void area(){
         int area= length*breadth;
         System.out.println("Area of Rectangle " +area);
    }
    public static void main(String[] args){
         Rectangle rectangle1=new Rectangle(2,4);
         rectangle1.area();
    }

}
