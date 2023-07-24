class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;  // HAS-A

    Car() {
        engine = new Engine();
    }

    void startCar() {
        engine.start();
    }
}

public class Has_A {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar(); // Output: Engine started
    }
}
