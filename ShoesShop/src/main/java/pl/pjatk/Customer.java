package pl.pjatk;
//jak zrobić żeby ten klient mógł robić zakupy?
public class Customer {
    private String name;
    private int cash;

    public Customer(){

    }

    public Customer(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

}
