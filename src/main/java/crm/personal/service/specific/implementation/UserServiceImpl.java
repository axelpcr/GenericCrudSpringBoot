package crm.personal.service.specific.implementation;

import crm.personal.entity.User;
import crm.personal.service.specific.UserService;
import crm.personal.service.generic.implementation.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by axel on 16/10/16.
 */
@Service
@Transactional
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService {

}
