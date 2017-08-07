package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_42;

public class HighwayBike extends Bicycle
{

    int gearAmount = 0;

    public HighwayBike(int weight, int wheelAmount, String colour, Boolean bell, int gearAmount)
    {
        super(weight, wheelAmount, colour, bell);
        this.gearAmount=gearAmount;
    }

    public int getGearAmount(){return this.gearAmount;}
}
