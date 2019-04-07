package com.museum.museumServer.main.repository;

import com.museum.museumServer.main.models.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RoomRepository extends MongoRepository<Room, Serializable> {
}