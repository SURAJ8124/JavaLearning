package Chpter2_Java_ClassAndObjects;

public class Square {
    int side;
    Square(int side){
       this.side =side;
    }
    void area(){
       int area= side*side;
       System.out.println(area);
    }
    void perimeter(){
        int perimeter=4*side;
        System.out.println(perimeter);
    }
    public static void main(String[] args){
        Square square=new Square(5);
        square.area();
        square.perimeter();
    }


}
