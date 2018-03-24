package com.example.demo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  userrepository userRepository;

  //retrieve all user
  @RequestMapping("/Users")
  public List<User> getAllTopics() {
    return userRepository.findAll();

  }

  //retrieve single user
  @RequestMapping("/Users/{id}")
  public Optional<User> getuser(@PathVariable String id) {
    return userRepository.findById(id);

  }

  //create a new user
  @RequestMapping(method = RequestMethod.POST, value = "/Users")
  public User create(@RequestBody User User) {
    //return CourseMockData.createCourse(course);
    userRepository.save(User);
    return User;
  }
  //update user
  @RequestMapping(method = RequestMethod.PUT,value = "/Users/{id}")
  public User updatetopic(@RequestBody User user,@PathVariable String id){
    user.setId(id);
    return userRepository.save(user);
  }

  @RequestMapping(method = RequestMethod.DELETE,value = "/Users/{id}")
  public Optional<User> delete(@PathVariable String id){
    Optional<User> user = userRepository.findById(id);
    userRepository.deleteById(id);
    return user;
  }

}
