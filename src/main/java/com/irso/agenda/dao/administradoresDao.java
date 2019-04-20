package com.irso.agenda.dao;

import org.springframework.data.repository.CrudRepository;
import com.irso.agenda.model.administradoresModel;

public interface administradoresDao 
	extends CrudRepository<administradoresModel, Long> {

}
