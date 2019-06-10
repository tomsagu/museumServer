package com.museum.museumServer.main.repository;

import com.museum.museumServer.main.models.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;
import java.util.List;


@Repository
public interface RoomRepository extends MongoRepository<Room, Serializable> {
    List<Room> findByNameLikeIgnoreCaseOrTextLikeIgnoreCase(@Param("word")String word, @Param("word1")String word1);

    Room findByName(@Param("word")String word);
}
