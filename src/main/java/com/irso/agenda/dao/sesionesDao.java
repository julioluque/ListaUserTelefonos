package com.irso.agenda.dao;

import org.springframework.data.repository.CrudRepository;
import com.irso.agenda.model.sesionesModel;

public interface sesionesDao 
	extends CrudRepository<sesionesModel, Long>{

}
