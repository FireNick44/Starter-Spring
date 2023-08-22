package com.sleepingbranch.starterspring.repository;

import com.sleepingbranch.starterspring.model.ToDoEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToDoEntryRepo extends JpaRepository<ToDoEntry, Long> {
    void deleteToDoEntryById(Long id);
    List<ToDoEntry> findAllById(Long id);
}
