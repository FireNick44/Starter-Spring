package com.sleepingbranch.starterspring.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class ToDoList implements Serializable {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imageCoverUrl;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getImageCoverUrl() {
        return imageCoverUrl;
    }
    public void setImageCoverUrl(String imageCoverUrl) {
        this.imageCoverUrl = imageCoverUrl;
    }

    public String toString() {
        return "ToDoList {" +
                "id=" + id +
                ", name=" + name +
                ", imageUrl=" + imageCoverUrl +
               "}";
    }
}
