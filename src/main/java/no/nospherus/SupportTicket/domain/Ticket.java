package no.nospherus.SupportTicket.domain;

import javax.persistence.*;

/**
 * Created by terjewallem on 6/21/15.
 */
@Entity
public class Ticket extends Base {
    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;
    @OneToOne(cascade = CascadeType.ALL)
    private Person customer;
    @OneToOne(cascade = CascadeType.ALL)
    private Person tekkie;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public Person getTekkie() {
        return tekkie;
    }

    public void setTekkie(Person tekkie) {
        this.tekkie = tekkie;
    }
}
