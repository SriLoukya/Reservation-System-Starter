import plane.Flight;
import java.util.ArrayList;
import java.util.List;

public class FlightReservation extends Flight {
    private List<Flight> flights = new ArrayList<>();

    public FlightReservation(String name, double price) {
        super(name, price);
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

    public void print() {
        System.out.println("Flight Reservation: " + getName() + ", Price: " + getPrice());
        for (Flight flight : flights) {
            flight.print();
        }
    }
}