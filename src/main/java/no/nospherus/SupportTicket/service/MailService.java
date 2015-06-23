package no.nospherus.SupportTicket.service;

import no.nospherus.SupportTicket.domain.Ticket;

/**
 * Created by terjewallem on 6/23/15.
 */
public interface MailService {

    public void sendConfirmation(Ticket ticket);
}
