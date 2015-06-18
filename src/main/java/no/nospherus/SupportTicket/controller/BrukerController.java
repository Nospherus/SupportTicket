package no.nospherus.SupportTicket.controller;

import no.nospherus.SupportTicket.domain.BruksKontekst;
import no.nospherus.SupportTicket.service.BrukerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bruker")
public class BrukerController {
    @Autowired
    private BrukerService brukerService;

    @RequestMapping(value = "/brukskontekst", method = RequestMethod.GET)
    @ResponseBody
    public BruksKontekst getBruksKontekst() {
        return brukerService.getBruksKontekst();
    }
}
