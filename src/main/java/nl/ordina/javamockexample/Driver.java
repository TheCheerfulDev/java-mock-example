package nl.ordina.javamockexample;

public class Driver {

    private final Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public void lock() {
        this.car.lock();
    }
}
