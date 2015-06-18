package no.nospherus.SupportTicket.domain;

import java.io.Serializable;
import java.util.List;

public class BruksKontekst implements Serializable {
    private String brukerNavn;
    private List roller;

    public BruksKontekst(String brukerNavn, List roller) {
        this.brukerNavn = brukerNavn;
        this.roller = roller;
    }

    private String[] collectionToArray() {
        return null;
    }

    public String getBrukerNavn() {
        return brukerNavn;
    }

    public void setBrukerNavn(String brukerNavn) {
        this.brukerNavn = brukerNavn;
    }

    public List getRoller() {
        return roller;
    }

    public void setRoller(List roller) {
        this.roller = roller;
    }
}
