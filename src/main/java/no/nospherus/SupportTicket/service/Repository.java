/**package no.nospherus.SupportTicket.service;

import java.util.List;

import no.nospherus.SupportTicket.domain.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


public interface Repository extends CrudRepository<Base, Long> {

	public Page<Base> findAll(Pageable pageable);
	
	public List<Base> findAll();
	
	public Base findById(Long id);
}
**/