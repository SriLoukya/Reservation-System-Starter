package flight.reservation.plane;

public class Helicopter extends Flight{
    private final String model;
    private final int passengerCapacity;
    private int maxAltitude;

    public void print() {
        System.out.println("Helicopter: " + getName() + ", Price: " + getPrice() + ", Max Altitude: " + maxAltitude);
    }

    public Helicopter(String model, double price, int maxAltitude) {
        super(model, price);
        this.maxAltitude = maxAltitude;
        this.model = model;
        if (model.equals("H1")) {
            passengerCapacity = 4;
        } else if (model.equals("H2")) {
            passengerCapacity = 6;
        } else {
            throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
    }

    public String getModel() {
        return model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}
