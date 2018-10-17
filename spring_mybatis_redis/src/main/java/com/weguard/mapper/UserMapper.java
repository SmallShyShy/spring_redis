package com.weguard.mapper;


import com.weguard.entity.User;

public interface UserMapper {

    User getUserById(int id);

    boolean addUser(User u);

    boolean updateUser(User user);
}
