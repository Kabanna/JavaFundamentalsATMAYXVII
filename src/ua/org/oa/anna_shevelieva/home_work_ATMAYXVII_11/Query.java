package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_11;

import java.util.ArrayList;
import java.util.List;
import ua.org.oa.anna.shevelieva.home_work_ATMAYXVII_11.CarInformation;

public class Query {

    public List<CarInformation> getCarsByState(List<CarInformation> cars, String state) {
        List<CarInformation> result = new ArrayList<CarInformation>();
        for (CarInformation car : cars) {
            if (car.getState().equals(state))
                result.add(car);
        }
        return result;
    }

//    System.out.println("Average\t ((20 + 25 + 18) /3) \t ((175.5 + 190.5 + 165) /3)");

    public List<CarInformation> getCarsByStatus(List<CarInformation> cars, String state) {
        List<CarInformation> result = new ArrayList<CarInformation>();
        for (CarInformation car : cars) {
            if (car.getState().equals(state))
                result.add(car);
        }
        return result;
    }

}
