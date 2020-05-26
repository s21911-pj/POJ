package pl.pjatk;

public class Sandals extends AllBoots implements Boots {
    private String leather;
    private String cheap;


    public Sandals(int size, int price, String mark, String color) {
        super(size, price, mark, color);
        this.leather = leather;
        this.cheap = cheap;
    }



    @Override
    public void takeShoesOfTheShelf() {

    }
}
