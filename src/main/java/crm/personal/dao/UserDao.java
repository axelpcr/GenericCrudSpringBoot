package crm.personal.dao;

import crm.personal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.Serializable;


/**
 * Created by axel on 16/10/16.
 */
public interface UserDao extends JpaRepository<User, Integer> {
}
