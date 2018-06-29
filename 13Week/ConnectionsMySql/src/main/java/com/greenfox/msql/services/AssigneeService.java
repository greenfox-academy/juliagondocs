package com.greenfox.msql.services;

import com.greenfox.msql.model.Assignee;
import com.greenfox.msql.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AssigneeService {
    List<Assignee> findAll();
    void save(Assignee assignee);
    void deleteById (Long id);
    Assignee findById (Long id);
    Assignee findByName (String name);
}
