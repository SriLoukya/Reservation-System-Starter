package flight.reservation.payment;


public class Paypaladapter implements paypalinterface {
    public Paypal p = new Paypal();

    public void makePayment() {
        p.paypalPayment();
    }
}
