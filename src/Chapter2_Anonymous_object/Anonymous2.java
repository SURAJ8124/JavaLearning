package Chapter2_Anonymous_object;

public class Anonymous2 {
    int table;
    int height;
    int width;
    Anonymous2(int l,int b){
     height=l;
     width=b;
    }
    void area(){
        int area;
        area=height*width;
        System.out.println("Area of table is "+area);

    }
    public static void main( String[] args){
         new Anonymous2(90,78).area();
        new Anonymous2(10,20).area();
    }
}
