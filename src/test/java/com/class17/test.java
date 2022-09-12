package com.class17;

import com.class17.dao.IUserDao;
import com.class17.domain.User;
import com.class17.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class test {
    @Autowired
    private IUserService userService;

    @Test
    public void findAll()
    {
        List<User> userList = userService.findAll();
        for(User user:userList)
        {
            System.out.println(user);
        }
    }

    @Test
    public void selectById()
    {
        User user = userService.findById(1);
        System.out.println(user);
    }
}
