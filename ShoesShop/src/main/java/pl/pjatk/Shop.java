package pl.pjatk;

public class Shop {
    @SandalsPrice
    private int price;
    @SandalsSize
    private int size;
    @SneakersSizePrice
    private int sizeSneakers;
    private int priceSneakers;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSizeSneakers() {
        return sizeSneakers;
    }

    public void setSizeSneakers(int sizeSneakers) {
        this.sizeSneakers = sizeSneakers;
    }

    public int getPriceSneakers() {
        return priceSneakers;
    }

    public void setPriceSneakers(int priceSneakers) {
        this.priceSneakers = priceSneakers;
    }

    public Shop(int sizeSneakers, int priceSneakers) {
        this.sizeSneakers = sizeSneakers;
        this.priceSneakers = priceSneakers;
    }

    public Shop(int price, int size, int sizeSneakers, int priceSneakers) {
        this.price = price;
        this.size = size;
        this.sizeSneakers = sizeSneakers;
        this.priceSneakers = priceSneakers;
    }

    public Shop(){

    }
}

