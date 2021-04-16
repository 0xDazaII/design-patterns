package observer;

import java.util.ArrayList;
import java.util.List;

public class Item implements Observable {

    private List<Observer> favourites;
    private Double price;

    public Item() {
        this.favourites = new ArrayList<>();
    }

    @Override
    public void addToFavourites(Observer observer) {
        this.favourites.add(observer);
        observer.setPrice(this);
    }

    @Override
    public void removeFromFavourites(Observer observer) {
        this.favourites.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: this.favourites) {
            observer.update();
        }
    }

    @Override
    public Double getUpdate() {
        return this.price;
    }

    public void setPrice(Double newPrice) {
        this.price = newPrice;
        this.notifyObservers();
    }
}
