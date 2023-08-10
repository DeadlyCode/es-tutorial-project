package es.tutorial.service;

import es.tutorial.model.User;
import es.tutorial.repository.UserSearchRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author star.lee
 */
@Service
@Slf4j
public class UserSearchService {

    @Autowired
    private UserSearchRepository userSearchRepository;

    public List<User> getUsers(){
        log.info("getUsers start");
        List<User> users = null;
        try {
            users = userSearchRepository.findAll();
        }
        catch (Exception e) {
            log.error(String.format("getUsers error: %s", e.getMessage()));
        }

        return users;
    }

    public User getUserByName(String name, PageRequest pageRequest){
        log.info("getUserByName start: name: {}",name);
        User user = null;

        try {
            user = userSearchRepository.findByName(name, pageRequest);
        }
        catch (Exception e){
            log.error("getUsers error: %s", e.getMessage());
        }


        return user;
    }

    public String addUser(User user){
        String result = null;
        log.info("addUser start:{}",user.toString());

        List<User> users = this.getUsers();

        user.setId(users.get(users.size()-1).getId() + 1L);

        try {
            userSearchRepository.save(user);
        }
        catch (Exception e) {
            result = e.getCause().toString();
            log.error("addUser error:{}", e.getMessage());
        }
        return result;
    }

    public void updateUser(User user){
        log.info("updateUser start:{}",user.toString());
        try {
            userSearchRepository.save(user);
        }
        catch (Exception e) {
            log.error("updateUser error:{}", e.getMessage());
        }
    }

}
