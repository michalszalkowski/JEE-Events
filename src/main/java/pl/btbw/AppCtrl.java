package pl.btbw;

import pl.btbw.events.PaymentEvent;
import pl.btbw.events.annotation.PaymentTypeA;
import pl.btbw.events.annotation.PaymentTypeB;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class AppCtrl {

    @Inject
    @PaymentTypeA
    private Event<PaymentEvent> eventEventA;

    @Inject
    @PaymentTypeB
    private Event<PaymentEvent> eventEventB;

    @GET
    @Path("/")
    public String getTestAString(){
        eventEventA.fire(new PaymentEvent("some information for event"));
        return "fire PaymentEvent with @PaymentTypeA @Qualifier";
    }

    @GET
    @Path("/b")
    public String getTestBString(){
        eventEventB.fire(new PaymentEvent("some information for event"));
        return "fire PaymentEvent with @PaymentTypeB @Qualifier";
    }

}
