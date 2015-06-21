package no.nospherus.SupportTicket.domain;

/**
 * Created by terjewallem on 6/21/15.
 */
public class TicketTransformer {

    public TicketTransformer() {
    }

    public Ticket toInternal(newTicketDTO external) {
        Ticket internal = new Ticket();
        Person customer = new Person();
        customer.setName(external.getName());
        customer.setEmail(external.getEmail());
        customer.setPhone(external.getPhone());
        customer.setLocation(external.getLocation());
        internal.setCustomer(customer);
        internal.setDescription(external.getDescription());
        return internal;
    }
}
