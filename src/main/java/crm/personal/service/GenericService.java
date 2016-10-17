package crm.personal.service;

import java.io.Serializable;


/**
 * Created by axel on 17/10/16.
 */
public interface GenericService <T, ID extends Serializable> {
	<S extends T> S save(S entity);
}
