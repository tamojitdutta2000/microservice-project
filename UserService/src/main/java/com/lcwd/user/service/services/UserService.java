package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {

    //create
    User saveUSer(User user);

    //get all users
    List<User> getAllUSer();

    //get single user using id
    User getUser(String userId);

}
