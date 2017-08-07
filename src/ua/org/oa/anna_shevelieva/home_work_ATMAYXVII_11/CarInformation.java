package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_11;

/**
 * Create a java program that satisfies the following requirements:
 *1. Design a base class that contains objects of other classes as fields.
 *2. Provide the ability to create class objects with different initialization parameters.
 *3. Each class, field, method should have a name that reflects its essence and comments describing their purpose.
 *4. Demonstrate the use of overloaded methods and constructors, arrays.
 *5. When initializing the class fields, check the correctness of the entered data.
 *6. Create a class demonstrating the correctness of the work of the developed java program
 *7. At the stage of programming, agreements from the java code convention should be used.
 *8. The package name in which the class / class is created must be in the format ua.org.oa. <Jira Login>.
 *9. Unique folder in the SVN repository to save the completed tasks is located at http://oracle-academy.org.ua/svn/<Project Name> / <Jira login>
 *10. Optional: organize data entry from the console
 *11. Optional: Sort objects in the array in ascending order, based on one of the significant fields
 *Create auto show classes and cars. In the auto show class, calculate the average mileage of used cars, and determine the methods for displaying all the saloon cars on the screen, whose mileage:
 *above average;
 *Above a certain value in km;
 *below the average;
 *Below a certain value in km.
 *
 */

import java.awt.*;
import ua.org.oa.anna.shevelieva.home_work_ATMAYXVII_11.State;


public class CarInformation {
    private static int newId=1;
    private Brand brand;
    private String model;
    private int yearOfOrigin;
    private Color color;
    private int mileage;
    private String state;


    private final int id = newId++;

    public CarInformation(Brand brand, String model, int yearOfOrigin, Color color, int mileage, String state){
        this.brand = brand;
        this.model = model;
        this.yearOfOrigin = yearOfOrigin;
        this.color = color;
        this.mileage = mileage;
        this.state = state;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("id='").append(id).append('\'');
        sb.append(", Brand=").append(brand);
        sb.append(", Model=").append(model);
        sb.append(", Year of origin:=").append(yearOfOrigin);
        sb.append(", Mileage=").append(mileage);
        sb.append(", State=").append(state);
        sb.append('}');
        return sb.toString();
    }
    public void setBrand(Brand brand){
        this.brand = brand;
    }

    public Brand getBrand(){
        return brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel() {return model;}

    public void setYearOfOrigin(int yearOfOrigin){
        this.yearOfOrigin = yearOfOrigin;
    }

    public int getYearOfOrigin(){
        return yearOfOrigin;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor(){
        return color;}

    public void  setMileage(int mileage){
        this.mileage = mileage;
    }

    public long getMileage(){
        return mileage;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
    }
