package flight.reservation.order;

// import flight.reservation.payment.Paypal;

public class PayPalCommand implements OrderCommand {
    private final FlightOrder order;
    private final String email;
    private final String password;

    public PayPalCommand(FlightOrder order, String email, String password) {
        this.order = order;
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean execute() {
        return order.processOrderWithPayPal(email, password);
    }
}
