//hansunsong
//114856519
package CSE114.HW.Asingment9;

public class SportsCar extends Car{
    int maxSpeed;
    int seconds;
    boolean isConvertible;

    public SportsCar(String make, String model, int year, String color, String owner, int odometer, int numRepairs, int maxSpeed, int seconds, boolean isConvertible) {
        super(make, model, year, color, owner, odometer, numRepairs);
        this.maxSpeed = maxSpeed;
        this.seconds = seconds;
        this.isConvertible = isConvertible;
    }

    public boolean isSnazzy() {
        if((maxSpeed >= 150) && this.isConvertible && (super.color.equals("red") || super.color.equals("purple") || super.color.equals("yellow"))) {
            return true;
        }
        return false;
    }
}
