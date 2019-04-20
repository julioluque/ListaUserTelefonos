package com.irso.agenda.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.irso.agenda.model.contactosModel;
import com.irso.agenda.dao.contactosDao;

@CrossOrigin("*")
@RestController
public class contactosApi {

	@Autowired
	private contactosDao contacDao;

	@GetMapping(value="/contactos")
	public Iterable<contactosModel> getAll(){
		return contacDao.findAll();
	}
	
	@PostMapping(value="/contactos")
	public contactosModel saveContact(@RequestBody contactosModel contacModel) {
		return contacDao.save(contacModel);
	}
}
