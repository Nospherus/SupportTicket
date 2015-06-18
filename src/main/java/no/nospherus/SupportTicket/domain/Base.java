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
    private Date sistEndret;

    @Temporal(TemporalType.TIMESTAMP)
    private Date opprettet;

    public Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    public Date getSistEndret() {
        return sistEndret;
    }

    @PreUpdate
    private void setSistEndret() {
        this.sistEndret = new Date();
    }

    public Date getOpprettet() {
        return opprettet;
    }

    @PrePersist
    private void setOpprettet() {
        Date tidsstempel = new Date();
        this.sistEndret = tidsstempel;
        this.opprettet = tidsstempel;
    }
}
