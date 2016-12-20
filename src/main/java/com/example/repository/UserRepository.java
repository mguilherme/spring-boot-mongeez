package com.example.repository;

import com.example.domain.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by mguilherme on 19-12-2016.
 */
public interface UserRepository extends MongoRepository<User, ObjectId> {
}
