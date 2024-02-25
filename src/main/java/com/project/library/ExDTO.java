package com.project.library;

import org.springframework.stereotype.Component;

@Component
public class ExDTO {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "com.project.library.ExDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExDTO() {
        super();
    }
    public ExDTO(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}
