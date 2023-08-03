//hansunsong
//114856519
package CSE114.HW.Asingment9;

public class PassengerCar extends Car{
    int numPassengers;
    int numDoors;
    String transmissionType;

    public PassengerCar(String make, String model, int year, String color, String owner, int odometer, int numRepairs, int numPassengers, int numDoors, String transmissionType) {
        super(make, model, year, color, owner, odometer, numRepairs);
        this.numPassengers = numPassengers;
        this.numDoors = numDoors;
        this.transmissionType = transmissionType;
    }

    public boolean isComfortable() {
        if((numPassengers >= 5) && (numDoors >= 4) && (super.year <= 5)) {
            return true;
        }
        return false;
    }

    public boolean isHardToDrive() {
        if(this.transmissionType.equals("manual")) {
            return true;
        }
        return false;
    }
}
