package pl.btbw.events;

public class PaymentEvent {

    private String name;

    public PaymentEvent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
