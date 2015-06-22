package no.nospherus.SupportTicket.service;

import no.nospherus.SupportTicket.domain.Status;
import no.nospherus.SupportTicket.domain.Ticket;
import no.nospherus.SupportTicket.domain.newTicketDTO;
import no.nospherus.SupportTicket.domain.TicketTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by terjewallem on 6/21/15.
 */
@Component
@Transactional
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket registerNewTicket(newTicketDTO newTicketDTO) {
        TicketTransformer transformer = new TicketTransformer();
        Ticket ticket = transformer.toInternal(newTicketDTO);
        ticket.setStatus(Status.NEW);
        ticketRepository.save(ticket);
        return ticket;
    }

    @Override
    public void deleteTicket(Long id) {
        ticketRepository.delete(id);
    }

    @Override
    public Ticket updateTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
