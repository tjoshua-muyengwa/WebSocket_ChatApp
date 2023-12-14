package com.josh.WebSocket.repository;

import com.josh.WebSocket.user.Status;
import com.josh.WebSocket.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findAllByStatus(Status status);
}
