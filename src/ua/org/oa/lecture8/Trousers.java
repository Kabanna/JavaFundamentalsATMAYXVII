package ua.org.oa.lecture8;

/**
 * Created by dmitr on 24.07.2017.
 */
public class Trousers extends Clothing {
    public Trousers(String name, int price) {
        super(name, price);
    }

    @Override
    public void wash() {
        System.out.println("Trousers is clean");
    }

    @Override
    public String howToClean() {
        return "50 deagry";
    }

    @Override
    public String toString() {
        return "Trousers{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
