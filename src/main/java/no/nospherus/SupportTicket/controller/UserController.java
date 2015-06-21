package no.nospherus.SupportTicket.controller;

import no.nospherus.SupportTicket.domain.UserContext;
import no.nospherus.SupportTicket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/usercontext", method = RequestMethod.GET)
    @ResponseBody
    public UserContext getUserContext() {
        return userService.getUserContext();
    }
}
