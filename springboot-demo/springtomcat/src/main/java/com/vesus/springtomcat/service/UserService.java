package com.vesus.springtomcat.service;



import com.vesus.springtomcat.model.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public void saveUser(User book);

    public User findOne(long id);

    public void delete(long id);

    public List<User> findByName(String name);
}
