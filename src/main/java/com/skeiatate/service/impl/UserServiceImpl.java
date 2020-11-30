package com.skeiatate.service.impl;

import com.skeiatate.repository.UserRepository;
import com.skeiatate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;





}
