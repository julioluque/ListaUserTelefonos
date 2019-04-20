package com.irso.agenda.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.irso.agenda.model.administradoresModel;
import com.irso.agenda.dao.administradoresDao;

@RestController
public class administradoresApi {

	@Autowired
	private administradoresDao adminDao;
	
	@CrossOrigin(origins = "*")
	@GetMapping(value="/administradores")
	public Iterable<administradoresModel> getAll(){
		return adminDao.findAll();
	}
	

	@CrossOrigin(origins = "*")
	@PostMapping(value="/administradores")
	public administradoresModel saveContact(@RequestBody administradoresModel adminModel) {
		return adminDao.save(adminModel);
	}
	
//	@CrossOrigin(origins = "*")
//	@PutMapping(value="/administradores")
//	
//	
//	@CrossOrigin(origins = "*")
//	@DeleteMapping(value="/administradores")
//	
//	
//	@CrossOrigin(origins = "*")
//	@PatchMapping(value="/administradores")
//	
//	validaciones de negocio
//	busqueda por parametros. -   /autos?color=azul   con @RequestParams
//	busqueda por id  -   /autos/1
//	metodo put   - actualiza todo - y lo que no le pido deja en null.
//	metodo patch - actualiza solo el campo que necestio (parche) - solo actualiza el esado.
//	metodo delete.
	
	
}
