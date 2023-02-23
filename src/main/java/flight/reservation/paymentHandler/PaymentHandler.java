package flight.reservation.paymentHandler;

// import flight.reservation.PaymentHandler.*;
import flight.reservation.payment.CreditCard;

public interface PaymentHandler {
   
    public abstract boolean handlePayment(CreditCard creditCard, double amount, boolean isClosed);

}