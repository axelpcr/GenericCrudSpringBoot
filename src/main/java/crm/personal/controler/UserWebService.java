package crm.personal.controler;

import crm.personal.entity.User;
import crm.personal.service.UserService;
import crm.personal.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by axel on 16/10/16.
 */
@RestController
public class UserWebService {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "user", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity find(@RequestBody User user){

		return new ResponseEntity(userService.save(user), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity test(){

		return new ResponseEntity("test", HttpStatus.CREATED);
	}

}
