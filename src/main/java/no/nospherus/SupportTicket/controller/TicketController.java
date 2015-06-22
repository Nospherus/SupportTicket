package no.nospherus.SupportTicket.controller;

import no.nospherus.SupportTicket.domain.Ticket;
import no.nospherus.SupportTicket.domain.newTicketDTO;
import no.nospherus.SupportTicket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by terjewallem on 6/21/15.
 */
@RestController
@RequestMapping("/api/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    @ResponseBody
    @Transactional
    public Ticket getTicket(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public Ticket createTicket(@RequestBody newTicketDTO ticket) {
        return ticketService.registerNewTicket(ticket);
    }

    @Secured({"ROLE_ADMIN"})
    @RequestMapping(value="/", method = RequestMethod.GET)
    @ResponseBody
    @Transactional
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @Secured({"ROLE_ADMIN"})
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    @Transactional
    public void deleteTicket(@PathVariable Long id) {
        ticketService.deleteTicket(id);
    }

    @Secured({"ROLE_ADMIN"})
    @RequestMapping(value="/", method = RequestMethod.PUT)
    @ResponseBody
    @Transactional
    public Ticket updateTicket(@RequestBody Ticket ticket) {
        return ticketService.updateTicket(ticket);
    }
}
