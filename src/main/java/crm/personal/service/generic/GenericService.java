package crm.personal.service.generic;

import java.io.Serializable;
import java.util.List;


/**
 * Created by axel on 17/10/16.
 */
public interface GenericService <T, ID extends Serializable> {
	<S extends T> S save(S entity);
	T findOne(ID id);
	List<T> findAll();
}
