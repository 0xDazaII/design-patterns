package observer;

public class Favourites implements Observer {


    private String name;
    private Observable price;

    public Favourites(String name) {
        this.name = name;
    }

    @Override
    public void update() {

        if(this.price == null) {
            System.out.println(this.getName() + " the item that is in your favourites has no price update!" );
            return;
        }

        Double newPrice = this.price.getUpdate();
        System.out.println(this.getName() + " the item that is in your favourites has received a price update: " + newPrice);

    }

    @Override
    public void setPrice(Observable price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
