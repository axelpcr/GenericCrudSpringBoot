package crm.personal.service.generic.implementation;


import crm.personal.service.generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;


/**
 * Created by axel on 16/10/16.
 */
@Service
public class GenericServiceImpl<T, ID extends Serializable> implements GenericService<T, ID> {

	@Autowired
	private JpaRepository<T, ID> repository;

	@Override
	public <S extends T> S save(S entity) {
		return repository.save(entity);
	}

	@Override
	public T findOne(ID id) {
		return repository.findOne(id);
	}

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}


}
