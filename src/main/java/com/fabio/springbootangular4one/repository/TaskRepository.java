package com.fabio.springbootangular4one.repository;

import com.fabio.springbootangular4one.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long>{
}
