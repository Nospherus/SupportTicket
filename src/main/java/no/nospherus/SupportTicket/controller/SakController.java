package no.nospherus.SupportTicket.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sak")
public class SakController {

	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	@ResponseBody
	@Transactional
	public Long getSak(@PathVariable Long id) {
		return id;
	}
}
