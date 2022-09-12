package com.class17.service;

import com.class17.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IUserService {

    List<User> findAll();
    User findById(int id);
    void updateUser(User user);
}
