package ua.org.oa.lecture7.inharitance;

/**
 * Created by dmitr on 03.07.2017.
 */
public class Shirt extends Clothing {
    public char size;
    private int length;

    public Shirt(String name, int price, int length) {
        super(name, price);
        setLength(length);
    }


    @Override
    public void wash() {
        super.wash();
        length--;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Shirt shirt = (Shirt) o;

        return length == shirt.length;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + length;
        return result;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", length=" + length +
                '}';
    }
}
