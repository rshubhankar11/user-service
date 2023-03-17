package com.brs.user.service.service;

import java.util.List;
import com.brs.user.service.entity.*;

/**
 *
 */
public interface UserService{
    public User getUser(String userId);
    public List<User> getAllUser();
    public User addUser(User user);
}
