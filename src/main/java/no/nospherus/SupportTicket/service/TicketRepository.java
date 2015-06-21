package no.nospherus.SupportTicket.service;

import java.util.List;

import no.nospherus.SupportTicket.domain.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


public interface TicketRepository extends CrudRepository<Ticket, Long> {

	public Page<Ticket> findAll(Pageable pageable);
	
	public List<Ticket> findAll();
	
	public Ticket findById(Long id);
}
