package no.nospherus.SupportTicket.domain;

import javax.persistence.*;

/**
 * Created by terjewallem on 6/21/15.
 */
@Entity
public class Ticket extends Base {
    @Column(length = 4096)
    private String description;
    @Column(length = 4096)
    private String resolution;
    @Enumerated(EnumType.STRING)
    private Status status;
    @OneToOne(cascade = CascadeType.ALL)
    private Person customer;
    @OneToOne(cascade = CascadeType.ALL)
    private Person tekkie;
    private String location;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
