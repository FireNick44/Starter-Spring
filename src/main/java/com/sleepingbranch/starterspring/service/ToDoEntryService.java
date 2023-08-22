package com.sleepingbranch.starterspring.service;

import com.sleepingbranch.starterspring.model.ToDoEntry;
import com.sleepingbranch.starterspring.repository.ToDoEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoEntryService {
    private final ToDoEntryRepo toDoEntryRepo;

    @Autowired
    public ToDoEntryService(ToDoEntryRepo toDoEntryRepo){
        this.toDoEntryRepo = toDoEntryRepo;
    }
    public ToDoEntry addToDoEntry(ToDoEntry toDoEntry){
        return toDoEntryRepo.save(toDoEntry);
    }
    public List<ToDoEntry> findAllToDoEntries(){
        return toDoEntryRepo.findAll();
    }
    public List<ToDoEntry> findAllToDoEntriesById(Long id){
        return toDoEntryRepo.findAllById(id);
    }
    public ToDoEntry updateToDoEntry(ToDoEntry toDoEntry) {
        return toDoEntryRepo.save(toDoEntry);
    }
    public void deleteToDoEntry(Long id){
        toDoEntryRepo.deleteToDoEntryById(id);
        /* Custom function -> repo */
    }
}
