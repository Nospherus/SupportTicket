package no.nospherus.SupportTicket.service;

import no.nospherus.SupportTicket.domain.UserContext;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public UserContext getUserContext() {
        Object user = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (user instanceof User) {
            User authenticatedUser = (User) user;
            ArrayList<String> roles = new ArrayList();
            for (GrantedAuthority gAuth : authenticatedUser.getAuthorities()) {
                roles.add(gAuth.getAuthority());
            }
            return new UserContext(authenticatedUser.getUsername(), roles);
        } else {
            //Anonymous user(guest)
            return new UserContext();
        }
    }
}
