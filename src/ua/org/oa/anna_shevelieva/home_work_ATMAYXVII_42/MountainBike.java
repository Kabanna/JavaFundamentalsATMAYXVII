package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_42;


public class MountainBike extends Bicycle
{

    public MountainBike(int weight, int wheelAmount, String colour, Boolean bell)
    {
        super(weight, wheelAmount, colour, bell);
        this.weight=weight;
    }
    public int getWeight(){return this.weight;}

}


