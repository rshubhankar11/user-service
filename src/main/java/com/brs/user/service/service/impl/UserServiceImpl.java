package com.brs.user.service.service.impl;

import com.brs.user.service.entity.User;
import com.brs.user.service.exceptions.ResourceNotFoundException;
import com.brs.user.service.repository.UserRepository;
import com.brs.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException());
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
//       it will generate uniqe user id
        String randomUserId = UUID.randomUUID().toString();
        user.setId(randomUserId);
        return userRepository.save(user);
    }
}
