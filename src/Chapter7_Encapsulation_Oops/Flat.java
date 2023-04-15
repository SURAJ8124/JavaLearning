package Chapter7_Encapsulation_Oops;

public class Flat {

    public int price;
    public String location;
    public int depositeAmount;
    public int bhk;

    public int getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }

    public int getBhk() {
        return bhk;
    }

    public String getDepositeAmount() {
        return String.valueOf(depositeAmount);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDepositeAmount(int depositeAmount) {
        this.depositeAmount = depositeAmount;
    }

    public void setBhk(int bhk) {
        this.bhk = bhk;
    }
}
