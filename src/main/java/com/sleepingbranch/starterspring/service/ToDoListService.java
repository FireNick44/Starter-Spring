package com.sleepingbranch.starterspring.service;

import com.sleepingbranch.starterspring.model.ToDoList;
import com.sleepingbranch.starterspring.repository.ToDoListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoListService {
    private final ToDoListRepo toDoListRepo;

    @Autowired
    public ToDoListService(ToDoListRepo toDoListRepo) {
        this.toDoListRepo = toDoListRepo;
    }

    public ToDoList addToDoList(ToDoList toDoList){
        return toDoListRepo.save(toDoList);
    }

    public List<ToDoList> findAllToDoLists(){
        return toDoListRepo.findAll();
    }

    public ToDoList findToDoList(Long id){
        return toDoListRepo.findToDoListById(id);
    }

    public ToDoList updateToDoList(ToDoList toDoList) {
        return toDoListRepo.save(toDoList);
    }

    public void deleteToDoList(Long id){
        toDoListRepo.deleteToDoListById(id);
        /* Custom function -> repo */
    }
}
