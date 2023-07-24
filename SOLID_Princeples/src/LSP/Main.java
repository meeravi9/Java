package LSP;
/*Then, we create instances of Car and Motorcycle objects and assign them to variables of type Vehicle. This is possible because Car and Motorcycle are subclasses of Vehicle, and according to Liskov Substitution Principle (LSP), objects of the subclass can be used in place of objects of the superclass.

Finally, we call the startVehicle() method of the Driver class and pass in the car and motorcycle objects as arguments. This will invoke the appropriate startEngine() method based on the actual type of the objects.*/
public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        driver.startVehicle(car);
        driver.startVehicle(motorcycle);
    }
}
