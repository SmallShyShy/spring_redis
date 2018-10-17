package com.weguard.service;

import com.weguard.entity.User;

public interface UserService {
    User getUserById(int id);
    boolean addUser();
    boolean updateUser(User user);
}


