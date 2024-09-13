package com.solvd.carina.demo.db.mappers;

import com.solvd.carina.demo.db.models.User;

public interface IUserMapper {
    User findById(long id);
    User findByUserName(String username);
    void create(User user);
    void update (User user);
    void delete(long id);
}
