package com.sleepingbranch.starterspring;

import com.sleepingbranch.starterspring.model.ToDoList;
import com.sleepingbranch.starterspring.service.ToDoEntryService;
import com.sleepingbranch.starterspring.service.ToDoListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todo/list")
public class ToDoResource {
    private final ToDoEntryService toDoEntryService;
    private final ToDoListService toDoListService;

    public ToDoResource(ToDoEntryService toDoEntryService, ToDoListService toDoListService) {
        this.toDoEntryService = toDoEntryService;
        this.toDoListService = toDoListService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ToDoList>> getAllToDoLists() {
        List<ToDoList> toDoList = toDoListService.findAllToDoLists();
        return new ResponseEntity<>(toDoList, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<ToDoList> getToDoListsById(@PathVariable("id") Long id) {
        ToDoList toDoList = toDoListService.findToDoList(id);
        return new ResponseEntity<>(toDoList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ToDoList> addTodoList(@RequestBody ToDoList toDoList) {
        ToDoList newToDoList = toDoListService.addToDoList(toDoList);
        return new ResponseEntity<>(newToDoList, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<ToDoList> updateTodoList(@RequestBody ToDoList toDoList) {
        ToDoList updateToDoList = toDoListService.updateToDoList(toDoList);
        return new ResponseEntity<>(updateToDoList, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTodoList(@PathVariable("id") Long id) {
        toDoListService.deleteToDoList(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
