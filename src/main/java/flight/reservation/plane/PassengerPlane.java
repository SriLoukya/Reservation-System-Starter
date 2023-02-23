package flight.reservation.plane;

public class PassengerPlane {

    public String model;
    public int passengerCapacity;
    public int crewCapacity;
    public int dieselRequired;
    public boolean needRepair = false;
    public int maxAltitude;

    public void print() {
        System.out.println("PassengerPlane: " + getName() + ", Price: " + getPrice() + ", Max Range: " + maxRange);
    }
    public PassengerPlane(String model, double price, int maxAltitude) {
        super(model, price);
        this.maxAltitude = maxAltitude;
        this.model = model;
        switch (model) {
            case "A380":
                passengerCapacity = 500;
                crewCapacity = 42;
                break;
            case "A350":
                passengerCapacity = 320;
                crewCapacity = 40;
                break;
            case "Embraer 190":
                passengerCapacity = 25;
                crewCapacity = 5;
                break;
            case "Antonov AN2":
                passengerCapacity = 15;
                crewCapacity = 3;
                break;
            default:
                throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
    }

    public sendNotification(List customers) {
        for (Customer customer : customers) {
            if (customer.isSubscriber) {
                // send notification
            }
        }
    }

    public setDieselRequired(int dieselRequired) {
        this.dieselRequired = dieselRequired;
    }

    public int getDieselRequired() {
        return dieselRequired;
    }

    public void setNeedRepair(boolean needRepair) {
        this.needRepair = true;
    }

    public boolean isNeedRepair() {
        return needRepair;
    }
}
