package flight.reservation.plane;

public class PassengerDrone extends Flight{
    private final String model;
    private double maxRange;

    public void print() {
        System.out.println("Drone: " + getName() + ", Price: " + getPrice() + ", Max Range: " + maxRange);
    }

    public PassengerDrone(String model, double price, double maxRange) {
        super(name, price);
        this.maxRange = maxRange;
        if (model.equals("HypaHype")) {
            this.model = model;
        } else {
            throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
    }
}
