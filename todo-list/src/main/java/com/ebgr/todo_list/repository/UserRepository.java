package com.ebgr.todo_list.repository;

import com.ebgr.todo_list.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    public Optional<User> findUserByName(String name);
    public List<User> findAll();
    //public Integer save(User user);
}