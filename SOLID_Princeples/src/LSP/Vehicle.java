package LSP;
/*In this example, we have a Vehicle class that represents a general vehicle and has a startEngine() method.

The Car class extends the Vehicle class and overrides the startEngine() method to provide specific logic for starting a car's engine.

Similarly, the Motorcycle class extends the Vehicle class and overrides the startEngine() method to provide specific logic for starting a motorcycle's engine.

The Driver class represents a driver who can start any vehicle. It has a startVehicle() method that accepts a Vehicle object and calls its startEngine() method.

The key point here is that the startVehicle() method accepts any Vehicle object, including both Car and Motorcycle objects. This demonstrates the Liskov Substitution Principle (LSP), which states that objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.*/
public class Vehicle {
    public void startEngine() {

        System.out.println("Starting the engine...");
    }
}

