package com.museum.museumServer.main.repository;

import com.museum.museumServer.main.models.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;
import java.util.List;


@CrossOrigin
@Repository
public interface DocumentRepository extends MongoRepository<Document, Serializable>{

    List<Document> findByNameLikeOrTextLike(@Param("word")String word, @Param("word1")String word1);

}
