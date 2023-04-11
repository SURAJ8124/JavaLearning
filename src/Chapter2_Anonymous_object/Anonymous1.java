package Chapter2_Anonymous_object;
public class Anonymous1 {
    int a;
    int b;
    int c;
    int d;
    Anonymous1(int p,int q){
    a=p;
    b=q;
    int ab= a*b;
    System.out.println("Multiplication of a and b "+ab);
    }

    void multiply(int x, int y){
  c=x;
  d=y;
  int cd=c*d;
  System.out.println("Multiplication of c and d"+cd);
    }

    public static void main(String[] args){
        new Anonymous1(25,25);
        new Anonymous1(50,90).multiply(70,80);
    }
}
