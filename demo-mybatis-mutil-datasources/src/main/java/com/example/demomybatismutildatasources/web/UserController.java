package com.example.demomybatismutildatasources.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demomybatismutildatasources.entity.UserEntity;
import com.example.demomybatismutildatasources.mapper.db1.User1Mapper;
import com.example.demomybatismutildatasources.mapper.db2.User2Mapper;

@RestController
public class UserController {

    @Autowired
    private User1Mapper user1Mapper;

    @Autowired
    private User2Mapper user2Mapper;

    @RequestMapping("/db1/users")
    public List<UserEntity> getDb1Users() {
        List<UserEntity> users = user1Mapper.getAll();
        return users;
    }

    @RequestMapping("/db2/users")
    public List<UserEntity> getDb2Users() {
        List<UserEntity> users = user2Mapper.getAll();
        return users;
    }

    @RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
        UserEntity user = user2Mapper.getOne(id);
        return user;
    }

    @RequestMapping("/db1/add")
    public void saveDb1(UserEntity user) {
        user1Mapper.insert(user);
    }

    @RequestMapping("/db2/add")
    public void saveDb2(UserEntity user) {
        user2Mapper.insert(user);
    }

    @RequestMapping(value = "update")
    public void update(UserEntity user) {
        user2Mapper.update(user);
    }

    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        user1Mapper.delete(id);
    }
}
