package CSE114.HW.Asingment9;

public class app {
    public static void main(String[] args) {
        Car c1 = new Car("Ford", "Taurus", 0, "Red", "hansun", 0, 0);
        Car c2 = new Car("Ford", "Explorer", 0, "Red", "hansun", 0, 0);
        Car c3 = new Car("Chevy", "Malibu", 0, "Red", "hansun", 0, 0);
        Car c4 = new Car("Chevy", "Corvette", 0, "Red", "hansun", 0, 0);

        System.out.println(c3.compareTo(c4));

        PassengerCar pc = new PassengerCar("Ford", "Taurus", 0, "Red", "hansun", 0, 0, 5, 4, "manual");


        pc.say();
    }
}
