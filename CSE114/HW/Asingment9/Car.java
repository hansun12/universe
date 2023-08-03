//hansunsong
//114856519
package CSE114.HW.Asingment9;

public class Car implements Comparable<Car> {
    protected String make;
    protected String model;
    protected int year;
    protected String color;
    protected String owner;
    protected int odometer;
    protected int numRepairs;

    public Car(String make, String model, int year, String color, String owner, int odometer, int numRepairs) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.owner = owner; 
        this.odometer = odometer;
        this.numRepairs = numRepairs;
    }

    public void sellTo(String name) {
        this.owner = name;
    }

    public void repair() {
        this.numRepairs++;
    }

    public void travel(int run) {
        this.odometer += run;
    }
    
    public boolean isRealiable() {
        if((2023 - this.year) == numRepairs) {
            return true;
        }
        return false;
    }

    public boolean isHighMilage() {
        int usage = 2023 - this.year;

        if((this.odometer / usage) >= 12000) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Car o) {
        if(this.make.equals(o.make)) {
            return this.model.compareTo(o.model);
        }
        return this.make.compareTo(o.make);
    }

    public void say() {
        System.out.println("Car");
    }
    
    public void setOdoemeter(int odometer) {
        this.odometer = odometer;
    }

}
