package com.pet.demo.dao;

import com.pet.demo.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public interface UserDao {
    //CURD
    void save(User user);
    void delete(String id);
    void update(User user);
    List<User> findAll();
//    User findOne(String id);
    //根据名称模糊查询
    List<User> findByName(String username);
}
