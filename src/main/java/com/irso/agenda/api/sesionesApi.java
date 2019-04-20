package com.irso.agenda.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.irso.agenda.model.sesionesModel;
import com.irso.agenda.dao.sesionesDao;

@RestController
public class sesionesApi {

	@Autowired
	private sesionesDao sesiDao;
	
	@RequestMapping(value="/sesiones", method=RequestMethod.GET)
	public Iterable<sesionesModel> getAll(){
		return sesiDao.findAll();
	}
	
	@RequestMapping(value="/sesiones", method=RequestMethod.POST)
	public sesionesModel saveContact(@RequestBody sesionesModel sesiModel) {
		return sesiDao.save(sesiModel);
	}
}
