package no.nospherus.SupportTicket.service;

import no.nospherus.SupportTicket.domain.BruksKontekst;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;

@Component
public class BrukerServiceImpl implements BrukerService {
    @Override
    public BruksKontekst getBruksKontekst() {
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        ArrayList<String> roles = new ArrayList();
        for(GrantedAuthority gAuth : user.getAuthorities()) {
            roles.add(gAuth.getAuthority());
        }
        return new BruksKontekst(user.getUsername(), roles);
    }
}
