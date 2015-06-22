package no.nospherus.SupportTicket.service;

import no.nospherus.SupportTicket.domain.Ticket;
import no.nospherus.SupportTicket.domain.newTicketDTO;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by terjewallem on 6/21/15.
 */
public interface TicketService {

    public Ticket getTicketById(Long id);

    public List<Ticket> getAllTickets();

    public Ticket registerNewTicket(newTicketDTO newTicketDTO);

    public void deleteTicket(Long id);

    public Ticket updateTicket(Ticket ticket);
}
