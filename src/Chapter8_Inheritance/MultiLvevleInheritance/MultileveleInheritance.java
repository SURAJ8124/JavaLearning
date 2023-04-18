package Chapter8_Inheritance.MultiLvevleInheritance;

public class MultileveleInheritance {


    public static class X {
        public void methodX() {
            System.out.println("Class X method");
        }
    }

    public static class Y extends X {
        public void methodY() {
            System.out.println("Class Y method");
        }
    }

    public static class Z extends Y {

        public void methodZ() {
            System.out.println("Class Z method");
        }

    }

    public static void main(String[] args) {
        try {
            Z z = new Z();
            z.methodX(); // Calling X grand class method.
            z.methodY(); // Calling Y parent class method.
            z.methodZ(); // Calling Z class local method.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
