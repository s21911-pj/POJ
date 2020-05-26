package pl.pjatk;

public interface Boots {

default void putOnTheShelf(){
    System.out.println("Boots are put on the shelf");
}

void takeShoesOfTheShelf();

}
