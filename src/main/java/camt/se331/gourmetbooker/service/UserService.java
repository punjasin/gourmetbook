package camt.se331.gourmetbooker.service;

import camt.se331.gourmetbooker.entity.User;

import java.util.List;

/**
 * Created by Dto on 4/19/2015.
 */
public interface UserService {
    public List<User> findAll();
    public User findByUserName(String username);
    public User findUserByEmail(String username);
    public User login(String email, String password);
    public User addUser(User user);
}