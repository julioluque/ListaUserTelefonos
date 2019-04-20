package com.irso.agenda.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.irso.agenda.model.companiasModel;
import com.irso.agenda.dao.companiasDao;;

@CrossOrigin("*")
@RestController
public class companiasApi {

	@Autowired
	private companiasDao companDao;
	
	@RequestMapping(value="/companias", method=RequestMethod.GET)
	public Iterable<companiasModel> getAll(){
		return companDao.findAll();
	}
	
	@RequestMapping(value="/companias", method=RequestMethod.POST)
	public companiasModel saveContact(@RequestBody companiasModel companModel) {
		return companDao.save(companModel);
	}
}
