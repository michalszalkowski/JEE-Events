package pl.btbw.events;

import pl.btbw.events.annotation.PaymentTypeA;
import pl.btbw.events.annotation.PaymentTypeB;

import javax.enterprise.event.Observes;

public class PaymentHandler {

    public void creditPaymentA(@Observes @PaymentTypeA PaymentEvent paymentEvent) {
        System.out.println("Event: (Handler1) " + paymentEvent.getName());
    }

    public void creditPaymentB(@Observes @PaymentTypeB PaymentEvent paymentEvent) {
        System.out.println("Event: (Handler2) " + paymentEvent.getName());
    }

}
