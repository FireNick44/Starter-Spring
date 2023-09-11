package com.sleepingbranch.starterspring.repository;

import com.sleepingbranch.starterspring.model.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoListRepo extends JpaRepository<ToDoList, Long> {
    void deleteToDoListById(Long id);
    ToDoList findToDoListById(Long id);
}
