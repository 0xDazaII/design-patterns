package observer;

public class ObserverMain {
    public static void main(String[] args) {

        Item item = new Item();

        Observer obs1 = new Favourites("Robocop321");
        Observer obs2 = new Favourites("Sanchzes2");
        Observer obs3 = new Favourites("Korato2");

        item.addToFavourites(obs1);
        item.addToFavourites(obs2);
        item.addToFavourites(obs3);

        item.setPrice(254.99);

        item.setPrice(359.00);

    }
}
