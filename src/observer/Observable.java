package observer;

public interface Observable {

    void addToFavourites(Observer observer);
    void removeFromFavourites(Observer observer);

    void notifyObservers();
    Double getUpdate();
}
