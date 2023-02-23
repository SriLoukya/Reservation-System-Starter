package flight.reservation.order;

import flight.reservation.payment.CreditCard;

public class CreditCardCommand implements OrderCommand {
    private final FlightOrder order;
    private final CreditCard creditCard;

    public CreditCardCommand(FlightOrder order, CreditCard creditCard) {
        this.order = order;
        this.creditCard = creditCard;
    }

    @Override
    public boolean execute() {
        return order.processOrderWithCreditCard(creditCard);
    }
}
