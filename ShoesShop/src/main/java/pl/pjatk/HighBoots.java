package pl.pjatk;

public class HighBoots extends AllBoots implements Boots {
    public HighBoots(int size, int price, String mark, String color) {
        super(size, price, mark, color);
    }

    @Override
    public void putOnTheShelf() {
        System.out.println("Boots are put higher on the shelf");
    }

    @Override
    public void takeShoesOfTheShelf() {

    }
}
