package com.sleepingbranch.starterspring.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ToDoEntry implements Serializable {

    @Id
    @Column(nullable = false)
    private Long id;
    private Long listId;
    private Long orderId;
    private String entry;

    public ToDoEntry() {}
    public ToDoEntry(Long listId, Long orderId, String entry) {
        this.listId = listId;
        this.orderId = orderId;
        this.entry = entry;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getListId() {
        return listId;
    }
    public void setListId(Long listId) {
        this.listId = listId;
    }

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getEntry() {
        return entry;
    }
    public void setEntry(String entry) {
        this.entry = entry;
    }
}
