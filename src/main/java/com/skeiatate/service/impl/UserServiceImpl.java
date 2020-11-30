package com.skeiatate.service.impl;

import com.skeiatate.entity.User;
import com.skeiatate.repository.UserRepository;
import com.skeiatate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> queryAll() {
        return userRepository.findAll();
    }
}
