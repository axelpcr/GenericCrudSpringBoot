package crm.personal.controler;/**
 * Created by axel on 17/10/16.
 */

import crm.personal.entity.User;
import crm.personal.service.specific.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserWebService {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getUsers() {
        return new ResponseEntity(userService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getUser(@PathVariable Integer id) {
        return new ResponseEntity(userService.findOne(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity setUser(@RequestBody User user) {
        return new ResponseEntity(userService.save(user), HttpStatus.OK);
    }
//
//    @RequestMapping(value = "/user", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity updateUser(User user) {
//        return new ResponseEntity(userService.updateUser(user), HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE, produces = MediaType
//            .APPLICATION_JSON_VALUE)
//    public ResponseEntity deleteUser(@PathVariable("id") Integer id) {
//        return new ResponseEntity(HttpStatus.OK);
//    }
}
