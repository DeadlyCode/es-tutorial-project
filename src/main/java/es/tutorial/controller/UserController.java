package es.tutorial.controller;

import es.tutorial.domain.res.Response;
import es.tutorial.model.User;
import es.tutorial.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

/**
 * @author star.lee
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserSearchService userSearchService;

    @GetMapping("/getUsers")
    public Response getAllUsers() {return new Response("200", "SUCCESS", userSearchService.getUsers());}

    @GetMapping("/getUserByName")
    public Response getUserByName(@RequestParam("name") String name,
                                  @RequestParam("pageNum") int pageNum,
                                  @RequestParam("pageSize") int pageSize) {
        return new Response("200", "SUCCESS", userSearchService.getUserByName(name, PageRequest.of(pageNum, pageSize)));
    }

    @PostMapping("/addUser")
    public Response addUser(@RequestBody User user) {return new Response("200", "SUCCESS", userSearchService.addUser(user));}


}
