package com.pet.demo.dao;

import com.pet.demo.entity.Apply;
import com.pet.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplyDao {
    //CURD
    void save(Apply apply);
    void delete(String id);
    void update(Apply apply);
    List<Apply> findAll(String applyState);
    Apply findOne(String id);
    List<Apply> findByName(String applyUserName,String applyState);
}
