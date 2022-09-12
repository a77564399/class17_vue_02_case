package com.class17.dao;

import com.class17.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface IUserDao {
    /**
     * 查询用户列表
     */
    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where id=#{id}")
    User findById(int id);

    @Update("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id = #{id}")
    void updateUser(User user);
}
