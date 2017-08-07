package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_42;

/*
//1. Create a class hierarchy that describes the specified objects
//2. The fields of each of the created classes must be encapsulated
//        3. To provide initialization of fields at a stage of creation of objects of a class
//4. If necessary, override the specific methods in the child classes
//        5. All objects specified in the task must be combined into one array or ArrayList.
//        6. At the stage of programming, agreements from the java code convention should be used.
//        7. The package name in which the class / class is created must be in the format ua.org.oa. <Jira Login>.
//        8. Completed the task to forward to the SVN repo at the address http://oracle-academy.org.ua/svn/<Project Name> / <Jira login>
//        Create classes that describe the bike - mountain, road, children. Create 5 objects of different types. Define methods for displaying information about objects:
//        - All children's bicycles that have three wheels
//        - Highway bikes that have a certain number of gears
//        - Mountain bikes in which the weight in the specified range
*/

import java.util.Arrays;
import java.util.List;

public class OutputInformation {
    public static void main(String args[]){

        MountainBike bicycle1 = new MountainBike(18,2,"green", true);
        HighwayBike bicycle2 = new HighwayBike(14,2,"white", true,7);
        ChildBike bicycle3 = new ChildBike(5,2,"black",true);
        MountainBike bicycle4 = new MountainBike(19,2,"red", true);
        MountainBike bicycle5 = new MountainBike(17,2,"black", true);
        HighwayBike bicycle6 = new HighwayBike(13,2,"gray", true,12);
        HighwayBike bicycle7 = new HighwayBike(15,2,"white", true,15);
        ChildBike bicycle8 = new ChildBike(7,3,"pink",true);

        List<MountainBike> MountainBikes = Arrays.asList(bicycle1, bicycle4, bicycle5);
        List<HighwayBike> HighwayBikes = Arrays.asList(bicycle2, bicycle6, bicycle7);
        List<ChildBike> ChildBikes = Arrays.asList(bicycle3, bicycle8);

        for (int i=0;i<MountainBikes.size();i++)
        {
            if (MountainBikes.get(i).weight > 13){
                System.out.println("Mountain bikes with weight more then 13: "+ MountainBikes.get(i).getWeight());
                System.out.println("");//space
            }
        }

        for (int i=0;i<HighwayBikes.size();i++)
        {
            if (HighwayBikes.get(i).gearAmount > 13){
                System.out.println("Highway bikes with weight more then 12: "+ HighwayBikes.get(i).getGearAmount());
                System.out.println("");//space
            }
        }

        for (int i=0;i<ChildBikes.size();i++)
        {
            if (ChildBikes.get(i).wheelAmount == 2){
                System.out.println("Child bikes with wheel amount 2: "+ ChildBikes.get(i).getWheelAmount());
                System.out.println("");//space
            }
        }
    }//end method
}
