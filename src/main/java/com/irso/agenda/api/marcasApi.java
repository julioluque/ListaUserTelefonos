package com.irso.agenda.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.irso.agenda.model.marcasModel;
import com.irso.agenda.dao.marcasDao;

@CrossOrigin("*")
@RestController
public class marcasApi {

	@Autowired
	private marcasDao marcDao;
	
	@RequestMapping(value="/marcas", method=RequestMethod.GET)
	public Iterable<marcasModel> getAll(){
		return marcDao.findAll();
	}
	
	@RequestMapping(value="/marcas", method=RequestMethod.POST)
	public marcasModel saveContact(@RequestBody marcasModel marcModel) {
		return marcDao.save(marcModel);
	}
	
	
}
