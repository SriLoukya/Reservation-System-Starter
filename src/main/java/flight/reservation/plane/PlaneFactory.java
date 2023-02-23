package flight.reservation.plane;

public abstract class PlaneFactory {
    public String model;
    public int passengerCapacity;
    public int crewCapacity;
    public int airHostessesRequired;

    public PlaneFactory(String model, int passengerCapacity, int crewCapacity) {
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.crewCapacity = crewCapacity;
        // this.airHostessesRequired = airHostessesRequired;
    }
    
   
}
