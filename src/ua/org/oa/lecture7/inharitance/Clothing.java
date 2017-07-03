package ua.org.oa.lecture7.inharitance;

/**
 * Created by dmitr on 03.07.2017.
 */
public class Clothing {
    private String name;
    private int price;
    public char size;

    public Clothing(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void wash(){
        System.out.println("Cloth is clean!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clothing clothing = (Clothing) o;

        if (price != clothing.price) return false;
        return name != null ? name.equals(clothing.name) : clothing.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
