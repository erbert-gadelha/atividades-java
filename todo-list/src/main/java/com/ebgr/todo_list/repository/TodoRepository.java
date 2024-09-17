package com.ebgr.todo_list.repository;

import com.ebgr.todo_list.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
}
