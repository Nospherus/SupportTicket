package no.nospherus.SupportTicket.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastEdited;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    public Date getLastEdited() {
        return lastEdited;
    }

    @PreUpdate
    private void setLastEdited() {
        this.lastEdited = new Date();
    }

    public Date getCreated() {
        return created;
    }

    @PrePersist
    private void setCreated() {
        Date timestamp = new Date();
        this.lastEdited = timestamp;
        this.created = timestamp;
    }
}
