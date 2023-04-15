package Chapter6_Getter_Setter;

public class Addition {
    private int x,y,z;

    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
    }

    public int getY() {
        return y;
    }

    public void setX(int a){
        this.x=a;
    }
    public void setY(int b){
        this.y=b;
    }
    public void setZ(int c){
        this.z=c;
    }
    public int addition(){
        int addition;
        addition=x+y+z;
        return addition;
    }
    Addition(){
        //Default constructor
    }

    public static void main(String[] args){
        Addition object= new Addition();
        object.setX(30);
        object.setY(70);
        object.setZ(40);
        object.getX();
        object.getY();
        object.getZ();
        int calculation=object.addition();

        System.out.println("Addition of Three number is :"+calculation );
    }
}
