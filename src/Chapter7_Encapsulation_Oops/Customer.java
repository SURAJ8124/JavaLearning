package Chapter7_Encapsulation_Oops;

public class Customer {

    public static void main(String[] args){
        Flat sample= new Flat();
        sample.setDepositeAmount(500000);
        sample.setBhk(3);
        sample.setLocation("Wakad rama group socity ");
        sample.setPrice(10000000);

        System.out.println(sample.getLocation());
        System.out.println(sample.getDepositeAmount());
        System.out.println(sample.getPrice());
        System.out.println(sample.getBhk());

    }
}
