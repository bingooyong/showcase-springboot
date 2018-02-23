package com.example.demomybatismutildatasources.mapper.db1;

import com.example.demomybatismutildatasources.entity.UserEntity;

import java.util.List;

public interface User1Mapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

}
