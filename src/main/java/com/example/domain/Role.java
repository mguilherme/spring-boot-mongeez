package com.example.domain;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by mguilherme on 19-12-2016.
 */
@Document(collection = "roles")
public class Role {

    private ObjectId id;
    private String name;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
