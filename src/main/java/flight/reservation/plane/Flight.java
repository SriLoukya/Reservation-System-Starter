package flight.reservation.plane;

public abstract class Flight {
    private String name;
    private double price;

    public Flight(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}