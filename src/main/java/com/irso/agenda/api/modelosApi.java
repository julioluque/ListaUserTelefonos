package com.irso.agenda.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.irso.agenda.model.modelosModel;
import com.irso.agenda.dao.modelosDao;

@CrossOrigin("*")
@RestController
public class modelosApi {

	@Autowired
	private modelosDao modDao;
	
	@RequestMapping(value="/modelos", method=RequestMethod.GET)
	public Iterable<modelosModel> getAll(){
		return modDao.findAll();
	}
	
	@RequestMapping(value="/modelos", method=RequestMethod.POST)
	public modelosModel saveContact(@RequestBody modelosModel modModel) {
		return modDao.save(modModel);
	}
}
