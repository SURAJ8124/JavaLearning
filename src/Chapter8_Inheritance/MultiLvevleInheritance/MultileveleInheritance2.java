package Chapter8_Inheritance.MultiLvevleInheritance;

public class MultileveleInheritance2 {

    public static class Building{
        protected int floor;
        public void floor(){
            System.out.println("There are "+floor+" floors in building");
        }
    }
    public static class Floor extends Building{
        protected int flat;
        public void flat(){
            System.out.println("On the "+floor+" floor"+" There are " +flat+" flats are available" );
        }
    }
    public static class Bhk extends Floor{
        protected int bhk;
        public void display(){
            System.out.println("On the "+floor+" floor There are  " +flat+" flats are available with "+bhk+" BHK");
        }
        public Bhk(int f,int r,int b){
            this.floor=f;
            this.flat=r;
            this.bhk=b;
        }

    }

    public static void main(String[] args){
        Bhk object= new Bhk(10,5,3);
        object.floor();
        object.flat();
        object.display();
    }

}
