package flight.reservation.paymentHandler;

import flight.reservation.paymentHandler.PaymentHandler;

import flight.reservation.order.*;
import flight.reservation.payment.CreditCard;

public class PayWithCreditCard {
    private PaymentHandler nextHandler;
    public void setNextHandler(PaymentHandler nextHandler){
        this.nextHandler=nextHandler;
    }   
    public boolean handlePayment(CreditCard creditCard, double amount, boolean isClosed){
        if (cardIsPresentAndValid(creditCard)) {
            System.out.println("Paying " + amount + " using Credit Card.");
            double remainingAmount = creditCard.getAmount() - amount;
            if (remainingAmount < 0) {
                System.out.printf("Card limit reached - Balance: %f%n", remainingAmount);
                throw new IllegalStateException("Card limit reached");
            }
            creditCard.setAmount(remainingAmount);
            return true;
        } else {
            return false;
        }


    }


    private boolean cardIsPresentAndValid(CreditCard card) {
        return card != null && card.isValid();
    }
}


