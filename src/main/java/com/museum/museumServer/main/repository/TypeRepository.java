package com.museum.museumServer.main.repository;

import com.museum.museumServer.main.models.Type;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;
import java.util.List;


@Repository
public interface TypeRepository extends MongoRepository<Type, Serializable> {
    List<Type> findByNameLikeIgnoreCase(@Param("word")String word);
}
