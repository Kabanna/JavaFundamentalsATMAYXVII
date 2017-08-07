package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_11;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class CarShowroom {

    public static void main(String[] args) {

        CarInformation car1 = new CarInformation(Brand.BMW,"320e",2017, Color.BLACK,2,"New");
        CarInformation car2 = new CarInformation(Brand.BMW,"320e",2017, Color.WHITE,3,"New" );
        CarInformation car3 = new CarInformation(Brand.VW,"Golf",1998, Color.RED,100000, "Used");
        CarInformation car4 = new CarInformation(Brand.MERCEDES,"SLK",2015, Color.WHITE,2000000, "Used");
        CarInformation car5 = new CarInformation(Brand.OPEL,"Vectra",2000, Color.GREEN,150000, "Used");
        CarInformation car6 = new CarInformation(Brand.MERCEDES,"SLK",2005, Color.RED,900000, "Used");
        CarInformation car7 = new CarInformation(Brand.BMW,"320d",2005, Color.BLUE,100000, "Used");
        CarInformation car8 = new CarInformation(Brand.OPEL,"Vectra",1999, Color.GRAY,160000, "Used");
        CarInformation car9 = new CarInformation(Brand.MERCEDES,"SLK",2005, Color.PINK,990000, "Used");
        CarInformation car10 = new CarInformation(Brand.BMW,"320d",2005, Color.BLUE,110000, "Used");

        List<CarInformation> cars = Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10);

        Query query = new Query();

        System.out.println("List of Used cars:");
        List<CarInformation> resultList1 = query.getCarsByState(cars, "Used");

        int totalMileage = 0;
        int amountOfUsedCars = 0;

        for (CarInformation car : resultList1)
        {
            System.out.println(car.toString());
            totalMileage +=car.getMileage();
            amountOfUsedCars +=1;
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Average miles: " + (totalMileage/amountOfUsedCars));
        System.out.println("--------------------------------------------------------------------------------------");

        int aboveAverage = 0;
        int belowAverage = 0;
        int average = totalMileage/amountOfUsedCars;

        for (CarInformation car : resultList1)
        {
            if (car.getMileage() > average)
            {
               aboveAverage++;
               System.out.println("Range of numbers above the average: " + car.toString());

            }
            else if (car.getMileage() < average)
            {
                belowAverage++;
                System.out.println("Range of numbers below the average: " + car.toString());

            }
        }
        System.out.println("There are " + aboveAverage + " numbers above the average.");
        System.out.println("There are " + belowAverage + " numbers below the average.");
    }
}