package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_42;

public class ChildBike extends Bicycle
{
    public ChildBike(int weight, int wheelAmount, String colour, Boolean bell)
    {
        super(weight, wheelAmount, colour, bell);
    }

    public Boolean isBycicleChield() {
        return true;
    }
}
