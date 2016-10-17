package crm.personal.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;


/**
 * Created by axel on 16/10/16.
 */
@Service
public class GenericServiceImpl<T, ID extends Serializable> implements GenericService<T, ID>{

	@Autowired
	private CrudRepository<T, ID> repository;

	@Override
	public <S extends T> S save(S entity) {
		return repository.save(entity);
	}
}
