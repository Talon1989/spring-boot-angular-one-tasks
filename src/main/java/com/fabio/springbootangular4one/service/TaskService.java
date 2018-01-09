package com.fabio.springbootangular4one.service;

import com.fabio.springbootangular4one.domain.Task;

public interface TaskService {

    Iterable<Task> list();
    Task save(Task task);

}
