package com.irso.agenda.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.irso.agenda.model.telefonosModel;
import com.irso.agenda.dao.telefonosDao;

@RestController
public class telefonosApi {

	@Autowired
	private telefonosDao telefDao;
	
	@RequestMapping(value="/telefonos", method=RequestMethod.GET)
	public Iterable <telefonosModel> getAll(){
		return telefDao.findAll();
	}
	
	@RequestMapping(value="/telefonos", method=RequestMethod.POST)
	public telefonosModel saveContact(@RequestBody telefonosModel telefModel) {
		return telefDao.save(telefModel);
	}
}
