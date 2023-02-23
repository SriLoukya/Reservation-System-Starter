
package flight.reservation.paymentHandler;

import flight.reservation.paymentHandler.PaymentHandler;

import flight.reservation.order.*;
import flight.reservation.payment.CreditCard;
public class ProcessOrderWithCreditCard implements PaymentHandler {

    private PaymentHandler nextHandler;
    public void setNextHandler(PaymentHandler nextHandler ){
        this.nextHandler=nextHandler;
    }
    public boolean handlePayment(CreditCard creditCard, double amount, boolean isClosed){
        if (isClosed) {
            // Payment is already proceeded
            return true;
        }
        // validate payment information
        if (!cardIsPresentAndValid(creditCard)) {
            // throw new IllegalStateException("Payment information is not set or not valid.");
            return false;
        }

        if(nextHandler!=null)
        {
            nextHandler.handlePayment(creditCard, amount, isClosed);
        }

        return true;
    }
    private boolean cardIsPresentAndValid(CreditCard card) {
        return card != null && card.isValid();
    }

}