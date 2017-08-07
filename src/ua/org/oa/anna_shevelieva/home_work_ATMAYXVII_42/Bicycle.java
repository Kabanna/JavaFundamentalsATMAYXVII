package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_42;

public class Bicycle {
    //instance variables
    public int weight, wheelAmount;
    public String colour;
    public Boolean bell;


    //constructor
    public Bicycle(int weight, int wheelAmount, String colour, Boolean bell) {
        this.weight = weight;
        this.wheelAmount = wheelAmount;
        this.bell = bell;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int Weight) {
        this.weight = Weight;
    }

    public int getWheelAmount() {
        return wheelAmount;
    }
    public void setWheelAmount(int WheelAmount) {
        this.wheelAmount = WheelAmount;
    }

    public Boolean isBycicleChild() {
        return false;
    }

    public int getGearAmount(){return 0;}
}
